package Facade.Fachada;

import Facade.Dominio.Cliente;
import Facade.Dominio.Reserva;
import Facade.Subsistemas.*;

public class ViagemFacade {

    public Reserva reservasViagem(Cliente cliente, String destino){
        VooService vooService = new VooService();
        HotelService hotelService = new HotelService();
        TransportService transportService = new TransportService();
        ComprovanteService comprovanteService = new ComprovanteService();
        NotificacaoService notificacaoService =  new NotificacaoService();
        //----------------------------------------------------------
        vooService.reservarVoo(destino);
        hotelService.reservarHotel(destino);
        transportService.reservarTransporte(destino);
        Reserva reserva = comprovanteService.gerarComprovante(destino);
        notificacaoService.enviarConfirmacao(cliente,reserva);
        return reserva;
    }

}
