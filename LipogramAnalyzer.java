import java.util.Scanner;


public class LipogramAnalyzer {

	private String text;
	
	public LipogramAnalyzer(String text)
	{
		this.text = text;
	}
	
	public String mark(char letter)		// returns the saved text string with all characters equal to letter replaced with #
	{
		// int f = text.indexOf('e');
		// text = text.substring(0, 'e') + text.substring('e' + text.length());
		 String c = text.replace(letter, '#'); // or just do (letter, '#');
		 text = c;
		 
		return text;
		
	}
	
	public String allWordsWith(char letter)
	{
		mark(letter);
		String s = " ";
		String a = text.replace('#', 'e');
		text = a;
		
		int start = text.indexOf(" ");
		int end = text.lastIndexOf(" ");
		
		for(int i = 0; i < text.length()-1; i++)
		{
			String nextRow = text.substring(0,start) + "\n" + text.substring( text.indexOf(" ") ) + text.trim() ;
		
			//	return nextRow;
			s = nextRow;
		}
	 
		//String a = text.replace('#', 'e');
		//text = a;
		
		return s;
		
		/*int start = text.indexOf(" ");
		int end = text.lastIndexOf(" ");
		String nextRow = text.substring(0,start) + "\n";
		return nextRow; */
		
	
	}
	
	
	
	private String extract(int pos)		// this method searches left and right trying to locate spaces
	{
		int pos0 = pos - 1, pos1 = pos + 1;	
		
		while(pos0 >= 0 && Character.isLetter(text.charAt(pos0)))	// returns true if the character is a letter; false otherwise.
		{
			pos--;	//	so if it's not a letter move left // all this does it look for a white space so that it can cut it and seperate the words
		}
		      
		while(pos1 < text.length() && Character.isLetter(text.charAt(pos1)))	// returns true if the character is a letter, false otherwise. passes the paremater char
		{
		      pos++;	// so if it is a letter move to the right
	    }
		      return text.substring(pos0 - 1, pos1);
	}
	
}
