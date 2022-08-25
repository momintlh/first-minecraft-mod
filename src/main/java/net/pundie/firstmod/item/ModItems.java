package net.pundie.firstmod.item;

// import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pundie.firstmod.FirstMod;

public class ModItems {
    
    // item ↓
    public static final Item BLOOD_DIAMOND = registerItem("blood_diamond",
     new Item (new FabricItemSettings().group(ModItemGroup.BLOOD_DIAMOND )));


    // for registering an Item
    private static Item registerItem(String name, Item item) {

        return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name), item);

    }


    public static void registerModItems() {
        
        FirstMod.LOGGER.debug("Registering mod items for" + FirstMod.MOD_ID);

    }

}
