
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;


public class NewClass2 {

    public static void main(String[] args) {
        
		InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();
       List<City> highPop2 = worldDao.getContinents().stream()															
		.map(continent -> worldDao.findCountriesByContinent(continent).stream()		
		.map(country -> country.getCities().stream()						
		.max(Comparator.comparingInt(City::getPopulation)))
		.flatMap(Optional::stream)												
		.max(Comparator.comparingInt(City::getPopulation)))
		.flatMap(Optional::stream)										
		.collect(toList());												
		System.out.println(highPop2);
		
	}
}
