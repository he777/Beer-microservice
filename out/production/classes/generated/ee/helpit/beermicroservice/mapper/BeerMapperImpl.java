package ee.helpit.beermicroservice.mapper;

import ee.helpit.beermicroservice.domain.Beer;
import ee.helpit.beermicroservice.web.model.BeerDto;
import ee.helpit.beermicroservice.web.model.BeerStyleEnum;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-05T14:43:34+0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
public class BeerMapperImpl implements BeerMapper {

    private final DateMapper dateMapper = new DateMapper();

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto beerDto = new BeerDto();

        beerDto.setId( beer.getId() );
        if ( beer.getVersion() != null ) {
            beerDto.setVersion( beer.getVersion().intValue() );
        }
        beerDto.setCreatedDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.setLastModifiedDate( dateMapper.asOffsetDateTime( beer.getLastModifiedDate() ) );
        beerDto.setBeerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDto.setBeerStyle( Enum.valueOf( BeerStyleEnum.class, beer.getBeerStyle() ) );
        }
        if ( beer.getUpc() != null ) {
            beerDto.setUpc( String.valueOf( beer.getUpc() ) );
        }
        beerDto.setPrice( beer.getPrice() );

        return beerDto;
    }

    @Override
    public Beer beerDtotoBeer(BeerDto beerDto) {
        if ( beerDto == null ) {
            return null;
        }

        Beer beer = new Beer();

        beer.setId( beerDto.getId() );
        if ( beerDto.getVersion() != null ) {
            beer.setVersion( beerDto.getVersion().longValue() );
        }
        beer.setCreatedDate( dateMapper.asTimestamp( beerDto.getCreatedDate() ) );
        beer.setLastModifiedDate( dateMapper.asTimestamp( beerDto.getLastModifiedDate() ) );
        beer.setBeerName( beerDto.getBeerName() );
        if ( beerDto.getBeerStyle() != null ) {
            beer.setBeerStyle( beerDto.getBeerStyle().name() );
        }
        if ( beerDto.getUpc() != null ) {
            beer.setUpc( Long.parseLong( beerDto.getUpc() ) );
        }
        beer.setPrice( beerDto.getPrice() );

        return beer;
    }
}
