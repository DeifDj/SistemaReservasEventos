package MongoDB;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.tuempresa.SistemaReservasEventos")
public class MongoConfig {
    // Otros métodos de configuración de MongoDB si los hubiera
}
