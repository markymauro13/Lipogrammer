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
		
		int start = text.indexOf(" ");
		int end = text.lastIndexOf(" ");
		
		String nextRow = text.substring(0,start) + "\n";
		
	
		return nextRow;
		
	}
	
	
	
	private int replacer(String text2)
	{
		return 0;
		
	}
	
}
