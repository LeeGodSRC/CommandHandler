package org.imanity.commandhandler.param.defaults;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.imanity.commandhandler.param.ParameterType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class IntegerParameterType implements ParameterType<Integer> {

	public Integer transform(CommandSender sender, String source) {
		try {
			return (Integer.parseInt(source));
		} catch (NumberFormatException exception) {
			sender.sendMessage(ChatColor.RED + source + " is not a valid number.");
			return (null);
		}
	}

	public List<String> tabComplete(Player sender, Set<String> flags, String source) {
		return (new ArrayList<>());
	}

}