package fr.lthc.plugintest;

import org.bukkit.plugin.java.JavaPlugin;

import fr.lthc.plugintest.commands.RandChestSummon;

public class PluginTestMain extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Le Plugin -PluginTest- de l'auteur -LTHC- a ete demarre");
		getCommand("randchest").setExecutor(new RandChestSummon(this));
		System.out.println("Le Plugin -PluginTest- de l'auteur -LTHC- est allume\n Le plugin vous dit 'bonne utilisation'");
	}
	

	@Override
	public void onDisable() {
		System.out.println("Au revoir\n    Signe: -PluginTest- de -LTHC-");
	}
	
}
