package chat.controller;

import chat.view.ChatView;
import chat.model.Chatbot;

/**
 * Controller for the Chatbot project
 * @author mhop1073
 * @version 1.2 10/23/15 Displays the Chatbot's userName vaiable.
 */
public class ChatController
{

	private Chatbot simpleBot;
	private ChatView display;
	
	public ChatController()
	{
		display = new ChatView();
		String user = display.getAnswer("What is your name?");
		simpleBot = new Chatbot(user);
	}
	public void start()
	{
		display.displayText(simpleBot.getUserName());
		chat();
	}
	
	private void chat()
	{
		String textFromUser = display.getAnswer("Talk to the chatbot.");
		while(simpleBot.lengthChecker(textFromUser))
		{
			textFromUser = display.getAnswer("Wow" + textFromUser);
		}
	}
	
}
