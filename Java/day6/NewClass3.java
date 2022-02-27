
import static java.lang.System.out;
import java.util.*;
import static java.util.Comparator.comparing;

import static java.util.stream.Collectors.maxBy;

public class NewClass3 {

    

    public static void main(String args[]) {
        
     /*   CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
      final Optional<City> capital = countryDao.findAllCountries()
                .stream()
                .map(Country::getCapital)
                .map(cityDao::findCityById)
                .filter(Objects::nonNull)
                .collect(maxBy(comparing(City::getPopulation)));
        capital.ifPresent(out::println);*/
		CountryDao worldDao = InMemoryWorldDao.getInstance();
		City highPop3 = worldDao.getCountries().values().stream()
			.map(country-> worldDao.findCityById(country.getCapital()))
			.filter(Objects::nonNull)
			.max(Comparator.comparingInt(City::getPopulation))
		    .get();
											
		System.out.println(highPop3);
	}

    }



