package com.boyarrex.testmodbr.item;

import com.boyarrex.testmodbr.TestModBR;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestModBR.MOD_ID);


public static final RegistryObject<Item> RAWGOLDNUGGET = ITEMS.register("raw_gold_nugget",
        ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));





public static void register(IEventBus eventBus){
    ITEMS.register(eventBus);
}


}
