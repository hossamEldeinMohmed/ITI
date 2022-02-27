
class Ex_3 {

    public static void main(String args[]) {
        /*
	Receives two inputs (as main arguments) a number and a
    string and prints the string on different lines according to
    the given number.
         */
        String s = args[1];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
            } else {
                
                System.out.println("Error");
                /*We pass 0 to the exit() function, which indicates that the termination happens successfully without any error. 
                A non-zero status like 1 and -1 tells the compiler to terminate the program with some error or message.*/
                System.exit(0);
            }
        }
        int x = Integer.parseInt(args[1]);
        for (int i = 0; i < x; i++) {
            System.out.println(args[0]);
            
        }
        
    }
}
