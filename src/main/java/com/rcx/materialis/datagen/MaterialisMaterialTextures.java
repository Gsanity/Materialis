package com.rcx.materialis.datagen;

import com.rcx.materialis.Materialis;
import com.rcx.materialis.util.GreyToFittingSpriteTransformer;

import net.minecraft.resources.ResourceLocation;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToColorMapping;
import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToSpriteTransformer;
import slimeknights.tconstruct.tools.data.sprite.TinkerPartSpriteProvider;
import slimeknights.tconstruct.tools.stats.BowstringMaterialStats;
import slimeknights.tconstruct.tools.stats.ExtraMaterialStats;

public class MaterialisMaterialTextures extends AbstractMaterialSpriteProvider {

	@Override
	public String getName() {
		return "Materialis Material Textures";
	}

	@Override
	protected void addAllMaterials() {
		buildMaterial(MaterialisMaterials.fairy)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.transformer(GreyToSpriteTransformer.builderFromBlack().addTexture(63, getTexture("material/fairy_outline_dark")).addTexture(102, getTexture("material/fairy_outline")).addARGB(140, 0xFFF2268E).addARGB(178, 0xFFFF44A3).addARGB(216, 0xFFFF65B4).addARGB(255, 0xFFFF89C6).build());
		//general oredict materials
		buildMaterial(MaterialisMaterials.brass)
		.meleeHarvest().ranged()
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF602F24).addARGB(102, 0xFF885035).addARGB(140, 0xFFB07347).addARGB(178, 0xFFDEAD5A) /* funny hex code */ .addARGB(216, 0xFFFDDB7E).addARGB(255, 0xFFFFF9C7).build());
		buildMaterial(MaterialisMaterials.aluminum)
		.meleeHarvest()
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF4D322C).addARGB(102, 0xFF754B42).addARGB(140, 0xFFB26C5B).addARGB(178, 0xFFD17F6C).addARGB(216, 0xFFEB9886).addARGB(255, 0xFFFFC9BD).build());
		buildMaterial(MaterialisMaterials.nickel)
		.meleeHarvest().ranged()
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF6D5F41).addARGB(102, 0xFF7F704B).addARGB(140, 0xFF9B8B66).addARGB(178, 0xFFAA9B75).addARGB(216, 0xFFCEBE8E).addARGB(255, 0xFFF4F1B5).build());
		buildMaterial(MaterialisMaterials.uranium)
		.meleeHarvest().ranged()
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF282C24).addARGB(102, 0xFF373E31).addARGB(140, 0xFF485240).addARGB(178, 0xFF59664F).addARGB(216, 0xFF6D7C61).addARGB(255, 0xFF7F9374).build());
		//create materials
		buildMaterial(MaterialisMaterials.roseQuartz)
		.meleeHarvest()
		.fallbacks("crystal", "rock", "stick")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF70283D).addARGB(102, 0xFFA53B57).addARGB(140, 0xFFE06464).addARGB(178, 0xFFFF828A).addARGB(216, 0xFFFFA699).addARGB(255, 0xFFFFDCD1).build());
		buildMaterial(MaterialisMaterials.refinedRadiance)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFFF7F6F2).addARGB(102, 0xFFFCFCFC).addARGB(140, 0xFFBFBEAE).addARGB(178, 0xFFD8D8CD).addARGB(216, 0xFFE8E8DA).addARGB(255, 0xFFF4F2E8).build());
		buildMaterial(MaterialisMaterials.shadowSteel)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF0B0719).addARGB(102, 0xFF2E2742).addARGB(140, 0xFF423C57).addARGB(178, 0xFF4D4861).addARGB(216, 0xFF575366).addARGB(255, 0xFF635D71).build());
		//eidolon materials
		buildMaterial(MaterialisMaterials.pewter)
		.meleeHarvest().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF24241E).addARGB(102, 0xFF3B3B32).addARGB(140, 0xFF63635A).addARGB(178, 0xFF838379).addARGB(216, 0xFFA1A097).addARGB(255, 0xFFD6D6D4).build());
		buildMaterial(MaterialisMaterials.arcaneGold)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF5E232D).addARGB(102, 0xFF7A3030).addARGB(140, 0xFFB76541).addARGB(178, 0xFFDF9559).addARGB(216, 0xFFF3BF71).addARGB(255, 0xFFFFF0B3).build());
		//aquaculture materials
		buildMaterial(MaterialisMaterials.neptunium)
		.meleeHarvest().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF013929).addARGB(102, 0xFF056B50).addARGB(140, 0xFF07A378).addARGB(178, 0xFF04D199).addARGB(216, 0xFF17F4B8).addARGB(255, 0xFFB6FBE8).build());
		//mystical world materials
		buildMaterial(MaterialisMaterials.orichalcum)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF825637).addARGB(102, 0xFF8C643B).addARGB(140, 0xFFC28858).addARGB(178, 0xFFBF987B).addARGB(216, 0xFFD0BFA1).addARGB(255, 0xFFF9FCC5).build());
		//astral sorcery materials
		buildMaterial(MaterialisMaterials.starmetal)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.transformer(GreyToSpriteTransformer.builderFromBlack().addARGB(63, 0xFF07062B).addARGB(102, 0xFF070B4F).addTexture(140, getTexture("material/starmetal_0")).addTexture(178, getTexture("material/starmetal_1")).addTexture(216, getTexture("material/starmetal_2")).addTexture(255, getTexture("material/starmetal_3")).build());
		//industrial foregoing materials
		buildMaterial(MaterialisMaterials.plastic)
		.meleeHarvest().ranged()
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF535353).addARGB(102, 0xFF686868).addARGB(140, 0xFF797979).addARGB(178, 0xFF959595).addARGB(216, 0xFFB6B6B6).addARGB(255, 0xFFD3D3D3).build());
		buildMaterial(MaterialisMaterials.pinkSlime)
		.meleeHarvest().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("slime_metal", "metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF602B57).addARGB(102, 0xFF733469).addARGB(140, 0xFFB65DA7).addARGB(178, 0xFFC279B6).addARGB(216, 0xFFD6A5CD).addARGB(255, 0xFFFFEBFF).build());
		buildMaterial(MaterialisMaterials.pinkSlimeball)
		.statType(TinkerPartSpriteProvider.SLIMESUIT)
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF973998).addARGB(102, 0xFFB143B2).addARGB(140, 0xFFD150D3).addARGB(178, 0xFFDC6CDD).addARGB(216, 0xFFF196F2).addARGB(255, 0xFFFFDBFF).build());
		//undergarden materials
		buildMaterial(MaterialisMaterials.cloggrum)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF352926).addARGB(102, 0xFF493933).addARGB(140, 0xFF645144).addARGB(178, 0xFF7B6959).addARGB(216, 0xFF968168).addARGB(255, 0xFFBA9D7B).build());
		buildMaterial(MaterialisMaterials.froststeel)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF4F5781).addARGB(102, 0xFF4F5781).addARGB(140, 0xFF6988B0).addARGB(178, 0xFF8BB2D6).addARGB(216, 0xFFB9D3EC).addARGB(255, 0xFFE6EDFF).build());
		buildMaterial(MaterialisMaterials.utherium)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF3D1421).addARGB(102, 0xFF65282A).addARGB(140, 0xFF9C3832).addARGB(178, 0xFFCE4650).addARGB(216, 0xFFED5F50).addARGB(255, 0xFFFA9387).build());
		buildMaterial(MaterialisMaterials.regalium)
		.statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF6D4516).addARGB(102, 0xFFB96B1D).addARGB(140, 0xFFD8964A).addARGB(178, 0xFFEBBE76).addARGB(216, 0xFFFCD87D).addARGB(255, 0xFFFFEFB2).build());
		buildMaterial(MaterialisMaterials.forgottenMetal)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF27373A).addARGB(102, 0xFF2F4C4C).addARGB(140, 0xFF279074).addARGB(178, 0xFF34B68B).addARGB(216, 0xFF51D8A4).addARGB(255, 0xFF7BFFBD).build());
		//mekanism materials
		buildMaterial(MaterialisMaterials.refinedObsidian)
		.meleeHarvest().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF252036).addARGB(102, 0xFF312854).addARGB(140, 0xFF483E5C).addARGB(178, 0xFF62517C).addARGB(216, 0xFF7A67A1).addARGB(255, 0xFFA789CC).build());
		buildMaterial(MaterialisMaterials.refinedGlowstone)
		.meleeHarvest().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF9E842A).addARGB(102, 0xFFC5A441).addARGB(140, 0xFFEAC940).addARGB(178, 0xFFFFE05A).addARGB(216, 0xFFFFE990).addARGB(255, 0xFFFDF6D9).build());
		//psi materials
		buildMaterial(MaterialisMaterials.psimetal)
		.meleeHarvest().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF7357BC).addARGB(102, 0xFF7372C1).addARGB(140, 0xFF9E92E1).addARGB(178, 0xFFB0ABF1).addARGB(216, 0xFFC5C9FF).addARGB(255, 0xFFE7E9FD).build());
		buildMaterial(MaterialisMaterials.ebonyPsimetal)
		.meleeHarvest().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF100C0C).addARGB(102, 0xFF151111).addARGB(140, 0xFF191715).addARGB(178, 0xFF201C1B).addARGB(216, 0xFF272222).addARGB(255, 0xFF2F2E2E).build());
		buildMaterial(MaterialisMaterials.ivoryPsimetal)
		.meleeHarvest().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFFB4B187).addARGB(102, 0xFFC4C3A4).addARGB(140, 0xFFD3D3C2).addARGB(178, 0xFFE3E5D8).addARGB(216, 0xFFF2F4E6).addARGB(255, 0xFFFCFCFC).build());
		//occultism materials
		buildMaterial(MaterialisMaterials.iesnium)
		.meleeHarvest().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF233C57).addARGB(102, 0xFF345F7C).addARGB(140, 0xFF3E8C9D).addARGB(178, 0xFF56A7B9).addARGB(216, 0xFF7DCDD8).addARGB(255, 0xFFD0F9FC).build());
		//botania materials
		buildMaterial(MaterialisMaterials.livingwood)
		.meleeHarvest().ranged()
		.fallbacks("wood", "stick")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF320704).addARGB(102, 0xFF410E05).addARGB(140, 0xFF4A190A).addARGB(178, 0xFF4E1D0B).addARGB(216, 0xFF53210D).addARGB(255, 0xFF5D2409).build());
		buildMaterial(MaterialisMaterials.dreamwood)
		.meleeHarvest().ranged()
		.fallbacks("wood", "stick")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF7B8D87).addARGB(102, 0xFF8B9F9A).addARGB(140, 0xFF9CB2AC).addARGB(178, 0xFFA9C0B9).addARGB(216, 0xFFAFCAC2).addARGB(255, 0xFFBBD3CD).build());
		buildMaterial(MaterialisMaterials.manasteel)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF083772).addARGB(102, 0xFF0A4998).addARGB(140, 0xFF0C5FC6).addARGB(178, 0xFF1776ED).addARGB(216, 0xFF5BA3FF).addARGB(255, 0xFFBDD9FF).build());
		buildMaterial(MaterialisMaterials.elementium)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFFBB0067).addARGB(102, 0xFFE90081).addARGB(140, 0xFFEE45A3).addARGB(178, 0xFFF26DB6).addARGB(216, 0xFFF592C8).addARGB(255, 0xFFFACAE4).build());
		buildMaterial(MaterialisMaterials.terrasteel)
		.meleeHarvest().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF176600).addARGB(102, 0xFF259300).addARGB(140, 0xFF2EB800).addARGB(178, 0xFF35DA00).addARGB(216, 0xFF5DF82A).addARGB(255, 0xFFA7FF8B).build());
		buildMaterial(MaterialisMaterials.manastring)
		.statType(BowstringMaterialStats.ID)
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF51B6FF).addARGB(102, 0xFF63CDFF).addARGB(140, 0xFF87EBFF).addARGB(178, 0xFFA5F6FF).addARGB(216, 0xFFC6FFFF).addARGB(255, 0xFFE8FFFE).build());
		//mythicbotany materials
		buildMaterial(MaterialisMaterials.alfsteel)
		.meleeHarvest().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF683900).addARGB(102, 0xFF9E5F00).addARGB(140, 0xFFD37E00).addARGB(178, 0xFFF89100).addARGB(216, 0xFFFFC400).addARGB(255, 0xFFFFE863).build());
		//draconic evolution materials
		buildMaterial(MaterialisMaterials.draconium)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF340C52).addARGB(102, 0xFF4E1882).addARGB(140, 0xFF7A42AE).addARGB(178, 0xFF905EBE).addARGB(216, 0xFFAE7ADD).addARGB(255, 0xFFE7B5FF).build());
		buildMaterial(MaterialisMaterials.awakenedDraconium)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF970000).addARGB(102, 0xFFC23800).addARGB(140, 0xFFFF5600).addARGB(178, 0xFFFF8800).addARGB(216, 0xFFFFBE00).addARGB(255, 0xFFFFFD03).build());
		//redstone arsenal materials
		buildMaterial(MaterialisMaterials.fluxInfused)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF781B12).addARGB(102, 0xFFB55B20).addARGB(140, 0xFFD98931).addARGB(178, 0xFFEFB544).addARGB(216, 0xFFF6D55F).addARGB(255, 0xFFFFF3B8).build());
		//avaritia materials
		buildMaterial(MaterialisMaterials.crystalMatrix)
		.statType(ExtraMaterialStats.ID).statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("crystal", "rock")
		.colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF289992).addARGB(102, 0xFF39B8B0).addARGB(140, 0xFF54D8D0).addARGB(178, 0xFF78F1E8).addARGB(216, 0xFFA5FFF9).addARGB(255, 0xFFD9FFFD).build());
		buildMaterial(MaterialisMaterials.neutronium)
		.meleeHarvest().ranged().statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.transformer(GreyToSpriteTransformer.builderFromBlack().addTexture(63, getTexture("material/neutronium_outline")).addTexture(102, getTexture("material/neutronium_outline")).addARGB(140, 0xFF5B5B5B).addARGB(178, 0xFF444444).addARGB(216, 0xFF303030).addARGB(255, 0xFF000000).build());
		buildMaterial(MaterialisMaterials.infinity)
		.meleeHarvest().ranged()//.statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.transformer(GreyToFittingSpriteTransformer.builderFromBlack().addTexture(63, getTexture("material/infinity_dark")).addTexture(178, getTexture("material/infinity_medium")).addTexture(255, getTexture("material/infinity_light")).build());
		buildMaterial(MaterialisMaterials.infinityEmbellishment)
		.statType(TinkerPartSpriteProvider.PLATE)
		.fallbacks("metal")
		.transformer(GreyToSpriteTransformer.builderFromBlack().addTexture(63, getTexture("material/infinity_loop_dark")).addTexture(178, getTexture("material/infinity_loop_medium")).addTexture(255, getTexture("material/infinity_loop_light")).build());
	}

	public static ResourceLocation getTexture(String path) {
		return new ResourceLocation(Materialis.modID, path);
	}
}
