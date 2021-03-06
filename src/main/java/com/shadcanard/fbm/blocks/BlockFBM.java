package com.shadcanard.fbm.blocks;

import akka.io.Tcp;
import com.shadcanard.fbm.FantaBobMod;
import com.shadcanard.fbm.items.IItemModelProvider;
import com.shadcanard.fbm.references.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@SuppressWarnings("UnusedDeclaration")
public class BlockFBM extends Block implements IItemModelProvider {
    protected String name;

    public BlockFBM(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        name = unlocalizedName;
        this.setUnlocalizedName(unlocalizedName);
        setRegistryName(unlocalizedName);
        this.setCreativeTab(FantaBobMod.fbmCreativeTabs);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public BlockFBM(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.GROUND, hardness, resistance);
    }

    public BlockFBM(String unlocalizedName) {
        this(unlocalizedName, 0.0F, 5.0f);
    }

    @Override
    public void registerItemModel(Item itemBlock) {
        FantaBobMod.proxy.registerItemRenderer(itemBlock, 0, name);
    }

}