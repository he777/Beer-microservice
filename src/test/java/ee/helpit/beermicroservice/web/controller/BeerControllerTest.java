package ee.helpit.beermicroservice.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import ee.helpit.beermicroservice.service.BeerService;
import ee.helpit.beermicroservice.web.model.BeerDto;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static ee.helpit.beermicroservice.web.model.BeerStyleEnum.LAGER;




@WebMvcTest(BeerController.class)
public class BeerControllerTest {

//    @MockBean
//    BeerService beerService;
//
//    @Autowired
//    ObjectMapper objectMapper;
//
//    @Autowired
//    MockMvc mockMvc;
//
//    BeerDto newBeer;
//
////    @BeforeEach
////    public void setUp() {
////        newBeer = BeerDto.builder()
////                .id(UUID.randomUUID())
////                .beerName("TestBeer1")
////                .beerStyle(LAGER)
////                .price(BigDecimal.valueOf(3.20))
////                .quantityOnHand(12)
////                .upc(1212L)
////                .version(1)
////                .lastModifiedDate(OffsetDateTime.now())
////                .createdDate(OffsetDateTime.now())
////                .build();
////    }
//
//    @Test
//    public void getBeer() throws Exception {
////        given(beerService.getBeerById(any(UUID.class))).willReturn(newBeer);
//
//        mockMvc.perform(get("/api/v1/beer/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
////                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
////                .andExpect(jsonPath("$.id", is(newBeer.getId().toString())))
////                .andExpect(jsonPath("$.beerName", is("TestBeer1")))
////                .andExpect(jsonPath("$.beerStyle", is(LAGER)))
////                .andExpect(jsonPath("$.price", is(BigDecimal.valueOf(3.20))))
////                .andExpect(jsonPath("$.quantityOnHand", is(12)))
////                .andExpect(jsonPath("$.upc", is(1212L)))
////                .andExpect(jsonPath("$.lastModifiedDate", is(OffsetDateTime.now())))
////                .andExpect(jsonPath("$.createdDate", is(OffsetDateTime.now())))
////                .andExpect(jsonPath("$.version", is(1)));
//    }
//    @Test
//    public void postBeer() throws Exception {
//        BeerDto beerDto  = BeerDto.builder().build();
//        String beerDtoJson = objectMapper.writeValueAsString(beerDto);
//            mockMvc.perform(post("/api/v1/beer")
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .content(beerDtoJson))
//                    .andExpect(status().isNoContent());
//    }
//
//    @Test
//    public void updateBeer() throws Exception {
//        BeerDto beerDto = BeerDto.builder().build();
//        String beerDtoJson = objectMapper.writeValueAsString(beerDto);
//            mockMvc.perform(put("/api/v1/beer")
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .contentType(beerDtoJson))
//                    .andExpect(status().isNoContent());
//    }
}
