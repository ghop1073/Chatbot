package chat.controller;

import chat.view.ChatView;
import chat.model.Chatbot;

/**
 * Controller for the Chatbot project
 * 
 * @author mhop1073
 * @version 1.2 10/23/15 Displays the Chatbot's userName variable.
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
		display.displayText("Hello " + simpleBot.getUserName());
		chat();
	}

	private void chat()
	{
		String textFromUser = display.getAnswer("What do you want to talk about today.");
		while (simpleBot.lengthChecker(textFromUser))
		{
			if (simpleBot.contentChecker(textFromUser))
			{
				display.displayText("Wow, I had no idea you loved " + simpleBot.getContent());
			}

			
			if(simpleBot.memeChecker(textFromUser))
			{
				display.displayText("Wow. What a dank meme you choose.");
			}
			
			textFromUser = display.getAnswer(textFromUser);
		}
	
	}

}
