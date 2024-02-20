package Evento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
    Object obtenerTodos();
    // Puedes agregar métodos de consulta específicos si es necesario
}
