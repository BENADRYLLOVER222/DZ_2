package controllers.concrete;

import java.util.HashMap;
import java.util.Map;

import controllers.concrete.impl.DoAuth;
import controllers.concrete.impl.DoRegistration;
import controllers.concrete.impl.GoToAddPage;
import controllers.concrete.impl.GoToIndexPage;
import controllers.concrete.impl.GoToMainPage;
import controllers.concrete.impl.GoToRegistrationPage;
import controllers.concrete.impl.GoToWelcomePage;
import controllers.concrete.impl.Logout;
import controllers.concrete.impl.addNews;

public class CommandProvider {
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put(CommandName.DO_AUTH, new DoAuth());
		commands.put(CommandName.DO_REGISTRATION, new DoRegistration());
		
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPage());
		
		commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
		
		commands.put(CommandName.GO_TO_INDEX_PAGE, new GoToIndexPage());
		
		commands.put(CommandName.GO_TO_WELCOME_PAGE, new GoToWelcomePage());
		
		commands.put(CommandName.GO_TO_MAIN_PAGE, new GoToMainPage());
		
		commands.put(CommandName.GO_TO_ADD_PAGE, new GoToAddPage());
		
		commands.put(CommandName.DO_LOGOUT, new Logout());
		
		commands.put(CommandName.ADD_NEWS, new addNews());
	}
	
	public Command takeCommand(String userCommand) {
		CommandName commandName;
		Command command;
		
		try {
			commandName = CommandName.valueOf(userCommand.toUpperCase());
			command = commands.get(commandName);
		}catch(IllegalArgumentException | NullPointerException e) {
			command = commands.get(CommandName.NO_SUCH_COMMAND);
		}
		
		return command;
	}

}
