package ee.helpit.beermicroservice.service;

import ee.helpit.beermicroservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

}
