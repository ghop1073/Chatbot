package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 * Popup disply class for GUI interaction in the Chatbot project.
 * @author Gage Hopkins
 * @version 1.0 10/21/15
 */
public class ChatView
{
	private String windowMessage;
	private ImageIcon chatIcon;
	
	public ChatView()
	{
		windowMessage = "This message is brought to you by chatbot!";
		chatIcon = new ImageIcon(getClass().getResource("images/kd8usa.jpg"));
	}
	/**
	 * Display a GUIpopup for collecting user text.
	 * @param input The tet to show in the popup window.
	 * @return The text supplied by user.
	 */
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input, windowMessage, JOptionPane.INFORMATION_MESSAGE, chatIcon, null, "Type here please!").toString();
		
		return answer;
	}
	/**
	 * Displays a strin to the user with a standard popup.
	 * @param input The supplied text.
	 */
	public void displayText(String input)
	{
		JOptionPane.showMessageDialog(null, input, windowMessage, JOptionPane.PLAIN_MESSAGE, chatIcon);
	}
}
