package ee.helpit.beermicroservice.bootstrap;

import ee.helpit.beermicroservice.domain.Beer;
import ee.helpit.beermicroservice.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }
    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Saku")
                    .beerStyle("LAGER")
                    //.quantityToBrew(200)
                    .upc(10023123L)
                    .price(new BigDecimal(12.94))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("A le Coq")
                    .beerStyle("PILSNER")
                   // .quantityToBrew(100)
                    .upc(112123L)
                    .price(new BigDecimal(10.94))
                    .build());
        }
    }
}
