package com.gmail.jaquadro.oreplus;
 
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class OrePlusCommand extends JavaPlugin{

		public OrePlusCommand(OrePlus orePlus) {
		// Added by UltraMCPro
	}

		public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String []args) {
                if (cmd.getName().equalsIgnoreCase("oreplus")) {
                       
                        Player player = (Player) sender;
                       
                        if (args.length == 0) {
                        	player.sendMessage(ChatColor.DARK_RED + "--- The OrePlus Project ---");
                                player.sendMessage(ChatColor.DARK_PURPLE  + "Creators: " + ChatColor.LIGHT_PURPLE  + "UltraMCPro & jaquadro");
                                player.sendMessage(ChatColor.DARK_PURPLE  + "Usage: " + ChatColor.LIGHT_PURPLE  + "/oreplus list");
                        	    player.sendMessage(ChatColor.DARK_PURPLE  + "Version: " + ChatColor.LIGHT_PURPLE  + this.getDescription().getVersion() );
                                return true;
                        }
                        else if (args.length == 1) {
                                if (args[0].equalsIgnoreCase("list")) {
                                	player.sendMessage(ChatColor.BLUE + "--- OrePlus Suffix commands ---");
                                  player.sendMessage(ChatColor.AQUA + "dates: " + "Shows you our planned release/update time");
                        	      player.sendMessage(ChatColor.AQUA + "donate: " + "Gives you info tilling you how donating can help");
                        	      player.sendMessage(ChatColor.AQUA + "list: " + "Displays OrePlus Suffix list");  
                                        return true;
                        
                          }
                                if (args[0].equalsIgnoreCase("dates")) {
                                    player.sendMessage(ChatColor.BLUE + "--- OrePlus Planned update ---");
                          	        player.sendMessage(ChatColor.AQUA + "The next plugin update will be within 2-4 weeks if needed");
                          	        player.sendMessage(ChatColor.AQUA + "Date of message posting: April 17, 2014 - 7:02 AM EST");
                          	        player.sendMessage(ChatColor.YELLOW + "Get more info but viewing the dev page http://dev.bukkit.org/bukkit-plugins/oreplus/");
                                  }
                                
                                if (args[0].equalsIgnoreCase("donate")) {
                                    player.sendMessage(ChatColor.BLUE + "--- OrePlus Donations ---");
                          	        player.sendMessage(ChatColor.AQUA + "Donations are used to help the release of our plugin (OrePlus)");
                          	        player.sendMessage(ChatColor.AQUA + "Donations will be added with the update of 1.2");
                          	        player.sendMessage(ChatColor.YELLOW + "Get more info but viewing the dev page http://dev.bukkit.org/bukkit-plugins/oreplus/");
                                  }
                           }
                       
                        
                          }
                        
                
                return true;
        }
}
