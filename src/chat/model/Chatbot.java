package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided. Students will complete methods as part of the project.
 * 
 * @author Gage Hopkins
 * @version 1.3 10/14/15 Built and called the buildMemesList method. Repaired the getContent method. Completed content checker.
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;

	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * 
	 * @param userName
	 *            The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		this.userName = userName;
		this.memesList = new ArrayList<String>();
		this.politicalTopicList = new ArrayList<String>();
		this.content = "Panda Express";

		buildMemesList();
		buildPoliticalTopicsList();

	}

	/**
	 * Built memesList with strings of memes
	 */
	private void buildMemesList()
	{
		this.memesList.add("Cute Animals");
		this.memesList.add("Doge");
		this.memesList.add("Kobe");
		this.memesList.add("LeBron");
		this.memesList.add("Curry");
		this.memesList.add("Harden");
		this.memesList.add("Lebron 2");
		this.memesList.add("John Cena");
		this.memesList.add("Kobe 1");
		this.memesList.add("Nba");

	}

	private void buildPoliticalTopicsList()
	{

	}

	/**
	 * Checks the length of the supplied string. Returns false if the supplied String is empty or null, otherwise returns true.
	 * 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		if (currentInput != null)
		{
			if (currentInput.length() > 0)
			{
				hasLength = true;
			}
		}
		return hasLength;
	}

	/**
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;

		if (currentInput.toLowerCase().contains(content.toLowerCase()))
		{
			hasContent = true;
		}
		return hasContent;
	}

	/**
	 * Checks if supplied String matches ANY of the topics in the politicalTopicsList. Returns true if it does find a match and false if it does not match.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		return false;
	}

	/**
	 * Checks to see that the supplied String value is in the current memesList variable.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMemes = false;
		
		for(String meme: memesList)
		{
			if(currentInput.toLowerCase().equals(meme.toLowerCase()))
			{
				hasMemes = true;
			}
		}
		
		return hasMemes;
	}
	
	public String processQuestion(String currentInput)
	{
		String nextConversation;
		nextConversation = "oh, what else would yo like to talk about?";
		int randomTopic = (int) (Math.random() * 5);
		
		switch(randomTopic)
		{
		case 0:
			if(contentChecker(currentInput))
			{
				nextConversation ="Hey, you talked about my special topic. What else do you like?";
			}
			break;
		case 1:
			if(memeChecker(currentInput))
			{
				nextConversation ="That is a popular meme this year! What is your favorite food?";
			}
			break;
		case 2:
			if(politicalTopicChecker(currentInput))
			{
				nextConversation ="I hate all the canidates! Are you going to vote for Kayne in 2020?";
			}
			break;
		case 3:
			//Choose your own test here
			if(currentInput.contains("work"))
			{
				nextConversation ="I am glad to hear that! Do you like to watch sports?";
			}
			break;
		case 4:
			//Random top for chat here
			nextConversation ="Oh, that is interesting!! What do you enjoy doing?";
			break;
		default:
			//Never will happen
			nextConversation ="My system just malfunctioned! I am sorry! How is your day going?";
			break;
		}
		
		return nextConversation;
	}

	/**
	 * Returns the username of this Chatbot instance.
	 * 
	 * @return The username of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * Returns the content area for this Chatbot instance.
	 * 
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return content;
	}

	/**
	 * Getter method for the memesList object.
	 * 
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return null;
	}

	/**
	 * Getter method for the politicalTopicList object.
	 * 
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return null;
	}

	/**
	 * Updates the content area for this Chatbot instance.
	 * 
	 * @param content
	 *            The updated value for the content area.
	 */
	public void setContent(String content)
	{

	}
}