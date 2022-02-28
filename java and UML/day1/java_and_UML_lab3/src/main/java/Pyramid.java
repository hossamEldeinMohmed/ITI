
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author Hossam Osman
 * 
 */
public class Pyramid {
    private String pharaoh;
    private String modernName;
    private String site;
    private double height;

    public Pyramid() {
    }

    public Pyramid(String pharaoh, String modernName, String site, double height) {
        this.pharaoh = pharaoh;
        this.modernName = modernName;
        this.site = site;
        this.height = height;
    }

    public static ArrayList<Pyramid> readCSVFile(String fileName) {
        BufferedReader bufferedReader;
        ArrayList<Pyramid> pyramids = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;

            do {
                line = bufferedReader.readLine();

                if(line != null && !line.contains("Pharaoh,Ancient name")) {
                    String[] attributes = line.split(",");
                    double height = attributes[7] == null || attributes[7].isEmpty() ? 0 : Double.parseDouble(attributes[7]);
                    Pyramid pyramid = new Pyramid(attributes[0], attributes[2], attributes[4], height);
                    pyramids.add(pyramid);
                }
            }while (line != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pyramids;
    }


    @Override
    public String toString() {
        return "Pyramid{" +
                "pharaoh='" + pharaoh + '\'' +
                ", modernName='" + modernName + '\'' +
                ", site='" + site + '\'' +
                ", height=" + height +
                '}';
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public String getModernName() {
        return modernName;
    }

    public void setModernName(String modernName) {
        this.modernName = modernName;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
