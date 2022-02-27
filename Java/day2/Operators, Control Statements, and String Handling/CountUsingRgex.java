/*
Given a sentence and a word, your task is that to count the
number of occurrences of the given word in the string and
print the number of occurrence of the word.


Count a group of words in a string using regular expressions
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CountUsingRgex {
  public static void main(String[] args) {
        String Sentanes ="welcome in java i hope you will love java";
		String word ="\\bjava\\b";
		// pattern not have constractor
		Pattern pattern = Pattern.compile(word);
    	Matcher matcher = pattern.matcher(Sentanes);
		
		int counter=0;
		//find retuen true when ther is staill token match patter and false after finsh all of them
		while(matcher.find()){
		     counter++;
		}
		System.out.println("number of occurrence of word = "+counter);
		
		
	}
}