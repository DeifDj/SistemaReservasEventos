package Evento;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/eventos")
@Api(value = "Eventos", description = "Operaciones relacionadas con la gestión de eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping
    @ApiOperation(value = "Obtener todos los eventos", notes = "Obtiene una lista de todos los eventos disponibles.")
    public List<Evento> obtenerTodosEventos() {
        return eventoService.obtenerTodosEventos();
    }

    // Otros métodos para crear, actualizar y eliminar eventos
}
