package br.com.marlonsilva.pacleservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.marlonsilva.pacleservice.domain.PlaceRepository;
import br.com.marlonsilva.pacleservice.domain.PlaceService;

@Configuration
public class PlaceConfig {

    @Bean
    PlaceService placeService(PlaceRepository placeRepository){
        return new PlaceService(placeRepository);
    }
    
}
