package Facade.Subsistemas;

import Facade.Dominio.Reserva;

public class ComprovanteService {

    public Reserva gerarComprovante(String destino){
        Reserva reserva = new Reserva();
        System.out.println("Comprovante Gerado");
        return reserva;
    }

}
