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


    // Walidacja formularzy @Size,@Null + naprawic test
    // Wyslac zaszyfrowane hasło z Thymeleaf
    // Testy MVC
    // Obsluga wyjatkow w aplikacji z AOP
    // Własna strona logownaia -> książka Spring w Akcji V
    // Przekierowanie do kolejnego formularza w ramach sesji
    // Uruchomienie aplikacji na serwerze Tomcat
}

