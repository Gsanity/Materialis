package com.rcx.materialis.modifiers;

import com.rcx.materialis.util.MaterialisUtil;

import net.minecraft.item.Item;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.ToolDefinition;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.context.ToolHarvestContext;
import slimeknights.tconstruct.library.tools.nbt.IModDataReadOnly;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.library.tools.nbt.ModDataNBT;
import slimeknights.tconstruct.library.tools.nbt.StatsNBT;

public class PsionizingRadiationModifierLesser extends Modifier {


	public PsionizingRadiationModifierLesser() {
		super(0xB6A9E7);
	}

	@Override
	public int getPriority() {
		return 200; //before most other things
	}

	@Override
	public void addVolatileData(Item item, ToolDefinition toolDefinition, StatsNBT baseStats, IModDataReadOnly persistentData, int level, ModDataNBT volatileData) {
		super.addVolatileData(item, toolDefinition, baseStats, persistentData, level, volatileData);
		MaterialisUtil.addToVolatileInt(PsionizingRadiationModifier.RADIATION_LEVEL, volatileData, level);
	}

	@Override
	public Boolean removeBlock(IModifierToolStack tool, int level, ToolHarvestContext context) {
		MaterialisUtil.castOnBlockBreak(tool, level, context, true);
		return null;
	}

	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		MaterialisUtil.castOnEntityHit(tool, level, context, damageDealt, true);
		return 0;
	}
}