package Evento;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventoService {


    private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public List<Evento> obtenerTodosEventos() {
        return eventoRepository.findAll();
    }

    public void setEventoRepository(EventoRepository eventoRepositoryMock) {

    }

    public List<Evento> obtenerTodosLosEventos() {
        return eventoRepository.findAll();
    }

    // Otros métodos según sea necesario
}
