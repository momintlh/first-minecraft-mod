package net.pundie.firstmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.pundie.firstmod.FirstMod;

public class ModItemGroup {
    
    public static final ItemGroup BLOOD_DIAMOND = FabricItemGroupBuilder.build(
        new Identifier(FirstMod.MOD_ID, "blood_diamond"), () -> new ItemStack(ModItems.BLOOD_DIAMOND)); 

}
