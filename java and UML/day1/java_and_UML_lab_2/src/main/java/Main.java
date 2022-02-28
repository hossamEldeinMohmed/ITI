
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Hossam eldein mohamed osman 
 *  Process the Egyptian Pyramids CSV dataset.
 https://www.kaggle.com/lsind18/egyptianpyramids
 Prepare it and print the basic data about each pyramid.
 */
public class Main {
      public static void main(String[] args) {
        ArrayList<Pyramid> pyramids = Pyramid.readCSVFile("pyramids.csv");

        for(Pyramid pyramid : pyramids) {
            System.out.println(pyramid);
        }

     
    }
    


}
