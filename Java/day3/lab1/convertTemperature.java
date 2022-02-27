/*
Develop an application to convert temperature from
Centigrade to Fahrenheit using Function<T,R>
 
Count a group of words in a string using regular expressions
*/
package lab1;
import java.util.function.Function;
public class convertTemperature {
    public static void main(String[] args) {

        ConvertClass obj= new ConvertClass();
        Double sum =obj.apply( 5.02);

        System.out.println(sum);
     }

}
class ConvertClass implements Function<Double, Double> {

    @Override
    public Double apply (Double aDouble){

         return  (9.0/5) * aDouble + 32;
    }

}
