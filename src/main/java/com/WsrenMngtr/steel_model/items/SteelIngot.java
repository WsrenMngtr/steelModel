package com.WsrenMngtr.steel_model.items;

import com.WsrenMngtr.steel_model.Main;
import com.WsrenMngtr.steel_model.init.ModItems;
import com.WsrenMngtr.steel_model.interfaces.IHasModel;
import com.WsrenMngtr.steel_model.util.Util;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SteelIngot extends Item implements IHasModel {
    public SteelIngot(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
        ModItems.ITEMS.add(this);
        Util.logger.warn("Now Create A Steel Ingot");
    }

    public void registryItemRender() {
        Main.proxy.registryModel(this, 0, "inventory");
    }
}
