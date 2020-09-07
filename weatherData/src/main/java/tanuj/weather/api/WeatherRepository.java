package tanuj.weather.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface WeatherRepository extends CrudRepository<ForcastData, Long>{

}
