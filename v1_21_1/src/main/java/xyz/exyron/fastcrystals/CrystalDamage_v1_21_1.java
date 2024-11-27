package xyz.exyron.fastcrystals;

import net.minecraft.network.protocol.game.PacketPlayOutEntityDestroy;
import org.bukkit.craftbukkit.v1_21_R0.entity.CraftPlayer; // Updated import for 1.21.1
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class CrystalDamage_v1_21_1 implements CrystalDamage {

  @Override
  public void handle(Player damager, Entity crystal) {
    // The method of sending the packet to the player might stay the same, but check if there are any changes in the API.
    ((CraftPlayer) damager).getHandle().a(new PacketPlayOutEntityDestroy(crystal.getEntityId()));
    // In 1.21.1, the method name could be 'a' (instead of 'c') for sending the packet.
  }
}
