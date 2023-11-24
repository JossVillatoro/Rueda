package com.rueda.proyecto.Controller;

import com.rueda.proyecto.Entidades.boleto.Boleto;
import com.rueda.proyecto.Entidades.boleto.DatoregistroBoleto;
import com.rueda.proyecto.Entidades.boleto.RegistrarBoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boleto")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class BoletoController {
    @Autowired
    private RegistrarBoletoService registrarBoletoService;

    @PostMapping("/registro")
    public ResponseEntity<List<Boleto>> registerTickets(@RequestBody DatoregistroBoleto datoregistroBoleto) {
        Integer numberOfTickets = datoregistroBoleto.cantidad();

        // Genera la cantidad específica de boletos
        List<Boleto> generatedTickets = registrarBoletoService.generateTickets(numberOfTickets);

        // Guarda los boletos generados
        List<Boleto> savedTickets = registrarBoletoService.GuardarBoletos(generatedTickets);

        return new ResponseEntity<>(savedTickets, HttpStatus.CREATED);
    }
}
