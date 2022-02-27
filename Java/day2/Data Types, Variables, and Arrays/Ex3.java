/*
Given a sentence and a word, your task is that to count the
number of occurrences of the given word in the string and
print the number of occurrence of the word.
1. Perform the above task using only methods of the String
class (2 ways).


*/
class Ex3 {

public static void main(String args[]) {
        int cont=0;
        String s="hossam xmfb kmnsfk hossam fdljkn hossam";
		 String w="xmfb";
		 String[] arrs= s.split(" ");
		 for(int i=0;i<arrs.length;i++){
		  if(arrs[i].equals(w)){
		     cont++;
		 }
	      

	
	 }
	 System.out.println("number of words = "+cont);
	 
}}
