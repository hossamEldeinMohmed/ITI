

import java.util.*;

import java.util.stream.Collectors;

public class NewClass {

   
    public static void main(String args[]) {
        InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();
        List<City> highPopulatedCityInCountries = worldDao.getCountries().values()
                .stream()
                .map(c-> 
                    {
            return c.getCities()
                    .stream()
                    .max(Comparator.comparingInt(City::getPopulation));
        })
              .flatMap(Optional::stream)
               
                .collect(Collectors.toList());
        for (int i = 0; i < highPopulatedCityInCountries.size(); i++) {
            System.out.println(highPopulatedCityInCountries.get(i).getName());
        }

    }
}
