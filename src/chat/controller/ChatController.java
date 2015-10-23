package chat.controller;

import chat.view.ChatView;
import chat.model.Chatbot;

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
		
	}
}
