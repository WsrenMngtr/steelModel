package com.WsrenMngtr.steel_model.handler;

import com.WsrenMngtr.steel_model.init.ModItems;
import com.WsrenMngtr.steel_model.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item: ModItems.ITEMS) {
            if (item instanceof IHasModel) {
                ((IHasModel) item).registryItemRender();
            }
        }
    }
}
