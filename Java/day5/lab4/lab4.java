@FunctionalInterface
	interface str{
		boolean applyFunction(String a);
	}

class StringUtils{
	public static boolean onlyLetters (String a, str f){
		return f.applyFunction(a);
	}
}

class lab4{
	public static void main(String[] args){
		String string1 = "hellohello";
		boolean x = StringUtils.onlyLetters(string1,(s1)->{
			boolean l = true;
			for(int i = 0;i<s1.length();i++){
				if(!Character.isLetter(s1.charAt(i))){
					l = false;
					
				}
			}
			return l;
		});
		if(x)
		System.out.println("string contains only alphabets ");
	   else
		 System.out.println("string not contains only alphabets ");
}
}