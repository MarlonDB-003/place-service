package br.com.marlonsilva.pacleservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.com.marlonsilva.pacleservice.api.PlaceRequest;

@SpringBootTest
class PacleServiceApplicationTests {
	@Autowired
	WebTestClient webTestClient;

	@Test
	public void testCreatePlaceSucess() {
		var name = "Valid name";
		var state = "Valid state";
		var slug = "valid-name";

		webTestClient
			.post()
			.uri("/places")
			.bodyValue(
				new PlaceRequest(name, state)
			)
			.exchange()
			.expectBody()
			.jsonPath("name").isEqualTo(name)
			.jsonPath("state").isEqualTo(state)
			.jsonPath("slug").isEqualTo(slug)
			.jsonPath("createdAt").isNotEmpty()
			.jsonPath("updateAt").isNotEmpty();
	}

	@Test
	public void TestCreatedPlaceFailure(){
		var name = "";
		var state =  "";
		
		webTestClient
		.post()
		.uri("/places")
		.bodyValue(
			new PlaceRequest(name, state)
		)
		.exchange()
		.expectStatus().isBadRequest();
	}

}
