/*
Given a sentence and a word, your task is that to count the
number of occurrences of the given word in the string and
print the number of occurrence of the word.

 Perform the above task using StringTokenizer class
*/
// you Should import 
import java.util.*;
//u can not give the class same name of reserved class
public class StringTokeniz
{
public static void  main(String[] args){
		StringTokenizer st = new StringTokenizer("welcome in java i hope you will love java"," ");
     
		String word ="java";
		int counter=0;
		
		while(st.hasMoreTokens()){
			if(word.equals(st.nextToken()))
		     counter++;
		}
		System.out.println("number of occurrence of word = "+counter);
		
		
	}
}