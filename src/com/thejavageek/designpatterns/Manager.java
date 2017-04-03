package com.thejavageek.designpatterns;

import java.util.HashMap;
import java.util.Map;

public class Manager {

	private Map<CommandType, Command> commands = new HashMap<CommandType, Command>();

	public void addRequest(CommandType type, Command command) {
		commands.put(type, command);
	}

	public void processRequest(CommandType type) {
		commands.get(type).execute();
	}

}
