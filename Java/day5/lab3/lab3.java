
@FunctionalInterface
	interface betterString{
		boolean applyFunction(String a, String b);
	}

class StringUtils{
	public static String betterString (String a, String b, betterString f){
		if(f.applyFunction(a,b)){
			return a;
		}
		return b;
	}
        public  boolean betterString1 (String a, String b){
        
            return (a.length()>b.length());
                
        }
        
}

public class lab3 {
	public static void main(String[] args){
		String string1 = "hello";
		String string2 = "hello hello";
		String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
		String first = StringUtils.betterString(string1, string2, StringUtils::betterString1);
		System.out.println("your betterString is"+" "+"''"+longer+"''");
		System.out.println("this was your first string "+" "+first);
}
}