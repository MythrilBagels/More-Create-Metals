package com.molybdenum.alloyed.items;

import com.molybdenum.alloyed.Alloyed;
import com.molybdenum.alloyed.util.ModTags;
import com.simibubi.create.Create;
import com.simibubi.create.content.AllSections;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.ItemEntry;
import net.minecraft.tags.Tag;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;



public class ModItems {
    private static final CreateRegistrate REGISTRATE = Alloyed.getRegistrate().creativeModeTab(() -> {
        return ModItemGroup.MAIN_GROUP;
    });

    // Item Entries
    public static final ItemEntry<Item> BRONZE_INGOT = taggedIngredient("bronze_ingot", ModTags.Items.BRONZE_INGOT);
    public static final ItemEntry<Item> STEEL_INGOT = taggedIngredient("steel_ingot", ModTags.Items.STEEL_INGOT);

    public static final ItemEntry<Item> BRONZE_SHEET = taggedIngredient("bronze_sheet", ModTags.Items.BRONZE_SHEET);
    public static final ItemEntry<Item> STEEL_SHEET = taggedIngredient("steel_sheet", ModTags.Items.STEEL_SHEET);

    public static final ItemEntry<SwordItem> STEEL_SWORD = REGISTRATE
            .object("steel_sword")
            .item((p) -> new SwordItem(ModItemTiers.STEEL, 3, -2.4F, p))
            .register();

    public static final ItemEntry<PickaxeItem> STEEL_PICKAXE = REGISTRATE
            .object("steel_pickaxe")
            .item((p) -> new PickaxeItem(ModItemTiers.STEEL, 1, -2.8F,p))
            .register();

    public static final ItemEntry<AxeItem> STEEL_AXE = REGISTRATE
            .object("steel_axe")
            .item((p) -> new AxeItem(ModItemTiers.STEEL, 5.0F, -3.0F,p))
            .register();

    public static final ItemEntry<ShovelItem> STEEL_SHOVEL = REGISTRATE
            .object("steel_shovel")
            .item((p) -> new ShovelItem(ModItemTiers.STEEL, 1.5F, -3.0F, p))
            .register();

    public static final ItemEntry<HoeItem> STEEL_HOE = REGISTRATE
            .object("steel_hoe")
            .item((p) -> new HoeItem(ModItemTiers.STEEL, -3, 0.0F, p))
            .register();

    public static final ItemEntry<ShearsItem> STEEL_SHEARS = REGISTRATE
            .object("steel_shears")
            .item((p) -> new ShearsItem(p.durability(476)))
            .register();

    public static final ItemEntry<FishingRodItem> STEEL_FISHING_ROD = REGISTRATE
            .object("steel_fishing_rod")
            .item((p) -> new FishingRodItem(p.durability(128)))
            .register();

    // End Item Entries

    public ModItems() {}

    public static void register() {
        Create.registrate().addToSection(BRONZE_INGOT, AllSections.MATERIALS);
        Create.registrate().addToSection(STEEL_INGOT, AllSections.MATERIALS);

        Create.registrate().addToSection(BRONZE_SHEET, AllSections.MATERIALS);
        Create.registrate().addToSection(STEEL_SHEET, AllSections.MATERIALS);

        Create.registrate().addToSection(STEEL_SWORD, AllSections.CURIOSITIES);
        Create.registrate().addToSection(STEEL_PICKAXE, AllSections.CURIOSITIES);
        Create.registrate().addToSection(STEEL_AXE, AllSections.CURIOSITIES);
        Create.registrate().addToSection(STEEL_SHOVEL, AllSections.CURIOSITIES);
        Create.registrate().addToSection(STEEL_HOE, AllSections.CURIOSITIES);
        Create.registrate().addToSection(STEEL_SHEARS, AllSections.CURIOSITIES);
        Create.registrate().addToSection(STEEL_FISHING_ROD, AllSections.CURIOSITIES);
    }

    // Functions from Create's item registrate. Found them useful, so copied them over.
    private static ItemEntry<Item> ingredient(String name) {
        return REGISTRATE.item(name, Item::new).register();
    }

    @SafeVarargs
    private static ItemEntry<Item> taggedIngredient(String name, Tag.Named<Item>... tags) {
        return REGISTRATE.item(name, Item::new).tag(tags).register();
    }
}
