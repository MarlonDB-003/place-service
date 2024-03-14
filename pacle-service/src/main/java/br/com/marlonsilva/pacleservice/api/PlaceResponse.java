package br.com.marlonsilva.pacleservice.api;

import java.time.LocalDateTime;

public record PlaceResponse(
    String name, String slug, String state, LocalDateTime createAt, LocalDateTime updateAt
) {
    
}
