package br.com.marlonsilva.pacleservice.domain;

import br.com.marlonsilva.pacleservice.api.PlaceRequest;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(PlaceRequest placeRequest){
        var place = new Place(null, placeRequest.name(), placeRequest.slug(), placeRequest.state(), placeRequest.createAt(),placeRequest.updateAt());
        return placeRepository.save(place);
    }
    
}
