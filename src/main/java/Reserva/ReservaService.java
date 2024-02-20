package Reserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;
    public Reserva realizarReserva(Reserva reserva) {
        // Lógica para realizar la reserva, validar disponibilidad, etc.
        return reservaRepository.save(reserva);
    }

    public List<Reserva> obtenerTodasLasReservas() {
        return reservaRepository.findAll();
    }

    public Optional<Reserva> obtenerReservaPorId(Long id) {
        return reservaRepository.findById(id);
    }

    public Reserva crearReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public Reserva actualizarReserva(Long id, Reserva nuevaReserva) {
        if (reservaRepository.existsById(id)) {
            nuevaReserva.setId(id);
            return reservaRepository.save(nuevaReserva);
        }
        return null; // Manejar el caso en que la reserva no exista
    }

    public boolean eliminarReserva(Long id) {
        reservaRepository.deleteById(id);
        return false;
    }
}
