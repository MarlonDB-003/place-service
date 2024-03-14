package br.com.marlonsilva.pacleservice.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marlonsilva.pacleservice.domain.Place;
import br.com.marlonsilva.pacleservice.domain.PlaceService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/places")
public class PlaceController {

    private PlaceService placeService;

    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @PostMapping
    public ResponseEntity<Mono<Place>> create(Place place){
        var createPlace = placeService.create(place);
        return ResponseEntity.status(HttpStatus.CREATED).body(createPlace);
    }
     
}
