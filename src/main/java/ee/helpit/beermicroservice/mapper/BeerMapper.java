package ee.helpit.beermicroservice.mapper;

import ee.helpit.beermicroservice.domain.Beer;
import ee.helpit.beermicroservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses= {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtotoBeer(BeerDto beerDto);


}
