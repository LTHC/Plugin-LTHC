package fr.lthc.plugintest.commands;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.lthc.plugintest.PluginTestMain;

public class RandChestSummon implements CommandExecutor {

	
	public RandChestSummon(PluginTestMain pluginTestMain) {
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("randchest"))
		{
			if(sender instanceof Player)
			{
				Player p = (Player) sender;
				
				Random r = new Random();
				double x = 0 + r.nextInt(8000);
				double xmap = 0 + r.nextInt(2);
				if(xmap == 0)
				{
					x = -x;
				}
				
				double y = 16 + r.nextInt(100);
				double ymap = 0 + r.nextInt(2);
				if(ymap == 0) {
					y = -y;
				}
				
				double z = 0 + r.nextInt(8000);
				double zmap = r.nextInt(2);
				if(zmap == 0)
				{
					z = -z;
				}
				
				
				Location randomChestSpawn = new Location(p.getWorld(), x, y, z);
				randomChestSpawn.getBlock().setType(Material.CHEST);
				
				
				Bukkit.broadcastMessage("Un coffre alatoire de la commande -randchest- a spawn en x: " + x + " y: " + y + " z: " + z);
				System.out.println("Un coffre alatoire de la commande -randchest- execute par le joueur -" + p.getName() + "- a spawn en x: " + x + " y: " + y + " z: " + z);
				
				Chest randomChest = (Chest) randomChestSpawn.getBlock().getState();
				Inventory randomChestInv = randomChest.getInventory();
				
				int chanceBase = (int) Math.round(Math.random()*100);
				int chanceTable = (int) Math.round(Math.random()*100);
				if(chanceBase < 10)
				{
					if(chanceTable <27)
					{
						randomChestInv.setItem(3, new ItemStack(Material.IRON_AXE));
						randomChestInv.setItem(11, new ItemStack(Material.LEATHER));
						randomChestInv.setItem(11, new ItemStack(Material.LEATHER, 3));
						System.out.println("Le coffre randchest contient:\n          1 hache en fer\n          4 cuir");
					}
					else
					{
						randomChestInv.setItem(26, new ItemStack(Material.DIAMOND, 26));
						System.out.println("Le coffre randchest contient:\n          26 Diamant");
					}
				}
				else if(chanceBase >= 10 && chanceBase < 37)
				{
					if(chanceTable < 76)
					{
						randomChestInv.setItem(0, new ItemStack(Material.GOLDEN_APPLE, 64));
						randomChestInv.setItem(11, new ItemStack(Material.ANVIL, 2));
						System.out.println("Le coffre randchest contient:\n          64 pomme d'or\n          2 enclume");
					}
					else if(chanceTable >= 76 && chanceTable < 99)
					{
						randomChestInv.addItem(new ItemStack(Material.MOSSY_COBBLESTONE, 64));
						System.out.println("Le coffre randchest contient:\n          64 cobblestone moussue");
					}
					else
					{
						randomChestInv.addItem(new ItemStack(Material.DIAMOND_BLOCK, 16));
						System.out.println("Le coffre randchest contient:\n          16 blocs de diamant");
					}
				}
				else if(chanceBase >= 37 && chanceBase < 99)
				{
					if(chanceTable < 51)
					{
						randomChestInv.addItem(new ItemStack(Material.SEA_LANTERN, 64));
						randomChestInv.setItem(18, new ItemStack(Material.SEA_LANTERN, 64));
						System.out.println("Le coffre randchest contient:\n        2 x 64 Sea Lantern");
					}
					else
					{
						randomChestInv.addItem(new ItemStack(Material.BEACON, 3));
						System.out.println("Le coffre randchest contient:\n        3 beacon");
					}
				}
				else
				{
					if(chanceTable < 99)
					{
						randomChestInv.addItem(new ItemStack(Material.COAL_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.IRON_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.GOLD_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.DIAMOND_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.EMERALD_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.REDSTONE_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.LAPIS_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.QUARTZ_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.NETHER_STAR));
						System.out.println("Le coffre randchest de tiers Quasi-Ultime a spawn");
					}
					else
					{
						randomChestInv.addItem(new ItemStack(Material.COAL_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.IRON_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.GOLD_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.DIAMOND_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.EMERALD_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.REDSTONE_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.LAPIS_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.QUARTZ_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.NETHER_STAR));
						randomChestInv.addItem(new ItemStack(Material.COAL_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.IRON_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.GOLD_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.DIAMOND_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.EMERALD_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.REDSTONE_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.LAPIS_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.QUARTZ_BLOCK, 64));
						randomChestInv.addItem(new ItemStack(Material.BEACON, 64));
						randomChestInv.addItem(new ItemStack(Material.GOLDEN_APPLE, 64));
						randomChestInv.addItem(new ItemStack(Material.GOLDEN_APPLE, 64));
						randomChestInv.addItem(new ItemStack(Material.GOLDEN_APPLE, 64));
						randomChestInv.addItem(new ItemStack(Material.GOLDEN_APPLE, 64));
						randomChestInv.addItem(new ItemStack(Material.GOLDEN_APPLE, 64));
						randomChestInv.addItem(new ItemStack(Material.GOLDEN_APPLE, 64));
						randomChestInv.addItem(new ItemStack(Material.GOLDEN_APPLE, 64));
						randomChestInv.addItem(new ItemStack(Material.GOLDEN_APPLE, 64));
						randomChestInv.addItem(new ItemStack(Material.GOLDEN_APPLE, 64));
						System.out.println("Le coffre randchest de tiers Ultime a spawn");
					}
				}
				
				return true;
			}
			System.out.println("Le 'sender' de cette commande n'est pas l'instance d'un joueur");
			return true;
		}
		return false;
	}

}
