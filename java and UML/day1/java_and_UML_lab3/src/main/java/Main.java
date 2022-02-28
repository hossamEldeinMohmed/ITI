
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Hossam eldein mohamed osman 
Lab Exercise 3
• For the given pyramids data set compute the median, average,
quartile of the dataset based on one of the available numerical
columns.
• Hint:
• The median divides the data into a lower half and an upper half.
The lower quartile is the middle value of the lower half.
The upper quartile is the middle value of the upper half.
• The following figure shows the median, quartiles and interquartile range.
 */
public class Main {
      public static void main(String[] args) {
        ArrayList<Pyramid> pyramids = Pyramid.readCSVFile("pyramids.csv");

        

        pyramids.sort(Comparator.comparingDouble(Pyramid::getHeight));
        double median = pyramids.get(pyramids.size()/2).getHeight();
        if(pyramids.size()%2 == 0) {
            median = (median + pyramids.get(pyramids.size()/2-1).getHeight()) / 2;
        }
        System.out.println("Median of heights is: " + median);

        List<Double> heights = pyramids.stream().map(Pyramid::getHeight).collect(Collectors.toList());
        System.out.println("First Quartile of heights is: " + firstQR(heights.toArray(new Double[0]), heights.size()));
        System.out.println("Third Quartile of heights is: " + thirdQR(heights.toArray(new Double[0]), heights.size()));

    }
          private static int medianIndex(Double[] a, int l, int r) {
        int n = r - l + 1;
        n = (n + 1) / 2 - 1;
        return n + l;
    }

    private static double firstQR(Double[] a, int n)
    {
        Arrays.sort(a);
        int mid_index = medianIndex(a, 0, n);
        double Q1 = a[medianIndex(a, 0,mid_index)];
        return Q1;
    }

    private static double thirdQR(Double[] a, int n)
    {
        Arrays.sort(a);
        int mid_index = medianIndex(a, 0, n);
        double Q3 = a[medianIndex(a,mid_index + 1, n)];
        return Q3;
    }
}
