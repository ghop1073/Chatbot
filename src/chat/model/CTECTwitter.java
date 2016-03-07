package chat.model;

import twitter4j.*;
import java.util.ArrayList;

public class CTECTwitter
{

	private ArrayList <Status> statusList;
	private ArrayList <String> wordsList;

	public CTECTwitter()
	{
		this.statusList = new ArrayList <Status>();
		this.wordsList = new ArrayList <String>();
	}
}
