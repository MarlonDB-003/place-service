package br.com.marlonsilva.pacleservice.web;

import br.com.marlonsilva.pacleservice.api.PlaceResponse;
import br.com.marlonsilva.pacleservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createAt(), place.updateAt());
    }
    
}