package com.rueda.proyecto.Entidades.boleto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistrarBoletoService {
    @Autowired
    private BoletoRepository boletoRepository;

    public List<Boleto> generateTickets(Integer numberOfTickets) {
        // Lógica para generar la cantidad específica de boletos
        List<Boleto> boletos = new ArrayList<>();

        for (int i = 0; i < numberOfTickets; i++) {
            Boleto boleto = new Boleto();
            // Puedes establecer valores predeterminados o generar valores aleatorios según sea necesario
            boletos.add(boleto);
        }

        return boletos;
    }

    public List<Boleto> GuardarBoletos(List<Boleto> boletos) {
        return boletoRepository.saveAll(boletos);
    }
}
