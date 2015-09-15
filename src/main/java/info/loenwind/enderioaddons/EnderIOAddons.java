package info.loenwind.enderioaddons;

import info.loenwind.enderioaddons.common.InitAware;
import info.loenwind.enderioaddons.common.Recipes;
import info.loenwind.enderioaddons.config.Config;

import java.util.Locale;

import javax.annotation.Nonnull;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EnderIOAddons.MODID, name = EnderIOAddons.MOD_NAME, version = EnderIOAddons.VERSION, dependencies = "required-after:EnderIO", guiFactory = "info.loenwind.enderioaddons.config.gui.ConfigFactory")
public class EnderIOAddons implements InitAware {
  @Nonnull
  public static final String MODID = "enderioaddons";
  @SuppressWarnings("null")
  @Nonnull
  public static final String DOMAIN = MODID.toLowerCase(Locale.US);
  @Nonnull
  public static final String MOD_NAME = "Ender IO Addons";
  @Nonnull
  public static final String VERSION = "@VERSION@";

  @SidedProxy(clientSide = "info.loenwind.enderioaddons.common.CommonProxy", serverSide = "info.loenwind.enderioaddons.common.ServerProxy")
  public static InitAware proxy;
  @Nonnull
  public static final Config config = new Config();
  @Nonnull
  public static final Recipes recipes = new Recipes();

  @Override
  @EventHandler
  public void init(FMLPreInitializationEvent event) {
    config.init(event);
    proxy.init(event);
    recipes.init(event);
  }

  @Override
  @EventHandler
  public void init(FMLInitializationEvent event) {
    config.init(event);
    proxy.init(event);
    recipes.init(event);
  }

  @Override
  @EventHandler
  public void init(FMLPostInitializationEvent event) {
    config.init(event);
    proxy.init(event);
    recipes.init(event);
    // info.loenwind.enderioaddons.machine.waterworks.engine.BootstrapHelper.dumpConfig();
  }

}
