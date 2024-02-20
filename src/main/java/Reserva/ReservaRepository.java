package Reserva;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByIdUsuarid(Long idUsuario);

    List<Reserva> findByIdUsuario(Long idUsuario);
    // Otros métodos según sea necesario
}
