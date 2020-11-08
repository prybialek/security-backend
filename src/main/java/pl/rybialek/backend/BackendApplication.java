package pl.rybialek.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	// 1. Dokonczyc API dla userow i pobawic sie postmanem.
	// 2. Wlaczyc HTTP Basic dla API Userow.
	// 3. Rzucic wyjatek gdy nie ma usera uzywajac AOP. (Rozdział AOP z książki)
	// 4. Zaimplementować pozostałe metody z interfejsu UserDetails.


	// Własna strona logownaia -> książka Spring w Akcji V
	// Walidacja formularzy
	// Testy MVC
	// Obsluga wyjatkow w aplikacji
	// Uruchomienie aplikacji na serwerze Tomcat
	// Połączyć z Angularem
}

