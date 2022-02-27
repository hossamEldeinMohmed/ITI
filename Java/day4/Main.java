public class Main{
	public static void main (String[] args){
		A h= new A();
		try{
			 
			System.out.println(h.fact(5));
			h.Positive(-3);
			h.Negative(-5);
			
		}
		catch(myException e){
			System.out.println(e.getMessage());
		}
		catch(myException2 e){
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Thanks");
			
		}
	}
	
}
