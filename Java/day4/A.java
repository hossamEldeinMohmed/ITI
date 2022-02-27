public class A
{
	public int fact(int n) throws Exception{
		if(n<0) throw new Exception("main Exception");
		if(n==1) return 1;
		return n*fact(n-1);
	}
	public void Positive(int n) throws myException2{
		if(n>0) throw new myException2();
		return;
	}
	public void Negative(int n) throws myException{
		if(n<0) throw new myException();
		return;
	}
}