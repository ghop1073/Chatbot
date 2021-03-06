package chat.controller;

import chat.view.ChatView;
import chat.model.CTECTwitter;
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
	private CTECTwitter myTwitter;

	public ChatController()
	{
		myTwitter = new CTECTwitter(this);
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
			else if(simpleBot.memeChecker(textFromUser))
			{
				display.displayText("Wow. What a dank meme you choose.");
			}
			else if(simpleBot.politicalTopicChecker(textFromUser))
			{
				display.displayText("I am not old enough to vote.");
			}
			
			textFromUser = display.getAnswer(textFromUser);
		}
	
	}
	
	public void sendTweet(String tweet)
	{
		myTwitter.sendTweet(tweet);
	}
	public void handleErrors(String error)
	{
		display.displayText(error);
	}
	

}
