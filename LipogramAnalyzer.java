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
		 String c = text.replace('e', '#'); // or just do (letter, '#');
		 text = c;
		 
		return text;
		
	}
	
	public String allWordsWith(char letter)
	{
		String c = text.replace('#', 'e');
		text = c;
		/*
		int start = text.indexOf(" ");
		int end = text.lastIndexOf(" ");
		String nextRow = text.substring(0,start) + "\n";
		return nextRow;
		*/
		extract(0);
		
	}
	
	
	
	private String extract(int pos)		// this method searches left and right trying to locate spaces
	{
		int pos0 = pos - 1, pos1 = pos + 1;	
		
		while(pos0 >= 0 && Character.isLetter(text.charAt(pos0))
		{
			pos--;
		}
		      
		while(pos1 < text.length() && Character.isLetter(text.charAt(pos1))
		{
		      pos++;
	        }
		      return text.substring(pos0 - 1, pos1);
	}
	
}
