package ee.helpit.beermicroservice.web.controller;

import ee.helpit.beermicroservice.service.BeerService;
import ee.helpit.beermicroservice.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity postBeer(@PathVariable("beerId") UUID beerId, @Validated @RequestBody BeerDto beerDto, @RequestHeader HttpHeaders httpHeaders) {
        BeerDto savedDto = beerService.saveNewBeer(beerDto);
        httpHeaders.add("Location", "/api/v1/beer/" + savedDto.getId().toString());
        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBeer(@PathVariable("beerId") UUID beerId, @Validated @RequestBody BeerDto beerDto) {
        beerService.updateBeer(beerId, beerDto);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId) {
        beerService.deleteBeer(beerId);
    }
}
