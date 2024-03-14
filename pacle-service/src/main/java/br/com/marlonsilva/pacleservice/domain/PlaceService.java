package br.com.marlonsilva.pacleservice.domain;

import com.github.slugify.Slugify;

import br.com.marlonsilva.pacleservice.api.PlaceRequest;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;
    private Slugify slg;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
        this.slg = Slugify.builder().build();
    } 

    public Mono<Place> create(PlaceRequest placeRequest){
        var place = new Place(null, placeRequest.name(), slg.slugify(placeRequest.name()) , placeRequest.state(), null,null);
        return placeRepository.save(place);
    }
    
}
