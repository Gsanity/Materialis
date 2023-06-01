package com.rcx.materialis.modifiers;

import com.rcx.materialis.compat.TinkerToolSocketable;
import com.rcx.materialis.util.MaterialisUtil;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.EquipmentContext;
import slimeknights.tconstruct.library.tools.context.ToolRebuildContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;
import slimeknights.tconstruct.library.tools.nbt.ModDataNBT;
import slimeknights.tconstruct.library.tools.nbt.ToolStack;
import vazkii.psi.api.PsiAPI;
import vazkii.psi.api.cad.ISocketable;
import vazkii.psi.api.spell.SpellContext;
import vazkii.psi.common.core.handler.PlayerDataHandler;
import vazkii.psi.common.core.handler.PlayerDataHandler.PlayerData;
import vazkii.psi.common.item.ItemCAD;

public class PsionizingRadiationModifierDamage extends Modifier {

	@Override
	public int getPriority() {
		return 200; //before most other things
	}

	@Override
	public void addVolatileData(ToolRebuildContext context, int level, ModDataNBT volatileData) {
		MaterialisUtil.addToVolatileInt(PsionizingRadiationModifier.RADIATION_LEVEL, volatileData, level);
	}

	@Override
	public void onAttacked(IToolStackView tool, int level, EquipmentContext context, EquipmentSlot slotType, DamageSource source, float amount, boolean isDirectDamage) {
		if (PsionizingRadiationModifier.enabled && !tool.isBroken() && context.getEntity() != null && context.getEntity() instanceof Player && !tool.getVolatileData().getBoolean(PsionizingRadiationModifier.SUPPRESS_TOOLCASTING)) {
			ItemStack toolStack = context.getEntity().getItemBySlot(slotType);
			if (tool instanceof ToolStack)
				toolStack = ((ToolStack) tool).createStack();
			Player player = (Player) context.getEntity();
			PlayerData data = PlayerDataHandler.get(player);
			ItemStack playerCad = PsiAPI.getPlayerCAD(player);

			if (!playerCad.isEmpty()) {
				int timesCast = tool.getPersistentData().getInt(TinkerToolSocketable.TIMES_CAST);
				ItemStack bullet = ISocketable.socketable(toolStack).getSelectedBullet();
				final ItemStack finalTool = toolStack;
				ItemCAD.cast(player.getCommandSenderWorld(), player, data, bullet, playerCad, 5, 0, 0.025F, (SpellContext spellContext) -> {
					spellContext.tool = finalTool;
					if (source.getEntity() instanceof LivingEntity)
						spellContext.attackingEntity = (LivingEntity) source.getEntity();
					spellContext.damageTaken = amount;
					spellContext.loopcastIndex = timesCast;
				});
				tool.getPersistentData().putInt(TinkerToolSocketable.TIMES_CAST, timesCast + 1);
			}
		}
	}
}