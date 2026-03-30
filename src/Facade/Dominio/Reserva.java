package Facade.Dominio;

public class Reserva {

    private String destino;
    private String codigo= "RES 123";

    public Reserva(String destino) {
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }

}
