package xyz.exyron.fastcrystals;

import net.minecraft.network.protocol.game.PacketPlayOutEntityDestroy;
import org.bukkit.craftbukkit.v1_20_R6.entity.CraftPlayer;  // Updated import for 1.21
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class CrystalDamage_v1_21 implements CrystalDamage {  // Updated class name for 1.21

  @Override
  public void handle(Player damager, Entity crystal) {
    // The method for sending the packet may have changed. In 1.21, it's likely 'a' instead of 'c'.
    ((CraftPlayer) damager).getHandle().a(new PacketPlayOutEntityDestroy(crystal.getEntityId()));  // Updated for 1.21
  }
}
