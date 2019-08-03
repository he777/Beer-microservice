package ee.helpit.beermicroservice.web.controller;

import ee.helpit.beermicroservice.service.BeerService;
import ee.helpit.beermicroservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

     BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
        public ResponseEntity<BeerDto> getBeer (@PathVariable("beerId") UUID beerId) {
          return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
        }
}
