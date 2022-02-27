/*
Use the interfaces in java.util.function to build an application
that defines the roots of the quadratic equation (2    
 0) and the roots could be computed by the following
formula
*/
import java.util.function.Function;
import  java.lang.Math.*;
public class quadraticEquation {
    public static void main(String[] args) {
       double []  arr= new double [3];
        arr[0] =  2.3;
		arr[1] = 4;
		arr[2] = 5.6;
        Equation obj= new Equation();
        double [] roots =new double [2];
		obj.apply(arr);

        
     }

}
class Equation implements Function<double  [], double []> {
    
    public double  [] apply (double [] arr){
		 double root1, root2;

       double a=arr[0];
		double b=arr[1];
		double c=arr[2];
    double determinant = b * b - 4 * a * c;

    // check if determinant is greater than 0
    if (determinant > 0) {

      // two real and distinct roots
      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    }

    // check if determinant is equal to 0
    else if (determinant == 0) {

      // two real and equal roots
      // determinant is equal to 0
      // so -b + 0 == -b
      root1 = root2 = -b / (2 * a);
      System.out.format("root1 = root2 = %.2f;", root1);
    }
	else {
	  double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
	}

         return arr ;
    }

}