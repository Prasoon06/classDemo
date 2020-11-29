package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public void matchPattern(String regex,String input)
	{
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(input);
		boolean found=false;
		while(matcher.find())
		{
			System.out.println("Found the text starting at "+matcher.start()+" and ending at "+matcher.end());
			found=true;
		}
		if(found==false)
			System.out.println("Text not found");
	}
}
