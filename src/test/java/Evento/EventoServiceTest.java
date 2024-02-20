package Evento;


import Evento.EventoRepository;
import Evento.EventoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Evento.class)
public class EventoServiceTest {

    @Autowired
    private EventoService eventoService;

    @Test
    public void testObtenerTodosLosEventos() {
        // Simula el comportamiento de tu repositorio o cualquier dependencia externa
        // En este ejemplo, estamos usando Mockito
        EventoRepository eventoRepositoryMock = Mockito.mock(EventoRepository.class);
        Mockito.when(eventoRepositoryMock.obtenerTodos()).thenReturn(List.of(new Evento(), new Evento()));

        // Configura el repositorio simulado en el servicio
        eventoService.setEventoRepository(eventoRepositoryMock);

        // Ejecuta el método que deseas probar
        List<Evento> eventos = eventoService.obtenerTodosLosEventos();

        // Verifica que el resultado sea el esperado
        Assertions.assertEquals(2, eventos.size());
        assertEquals("Evento1", eventos.get(0).getNombre());
        assertEquals("Evento2", eventos.get(1).getNombre());
    }
}
