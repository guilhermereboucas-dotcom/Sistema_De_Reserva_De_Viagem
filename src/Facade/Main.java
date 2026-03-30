package Facade;

import Facade.Dominio.Cliente;
import Facade.Fachada.ViagemFacade;

public class Main {
    public static void main(String[] args) {

        System.out.println("------CENÁRIO 1------");
        Cliente cliente1 = new Cliente("João","joao@email.com");
        ViagemFacade viagemFacade1 = new ViagemFacade();
        viagemFacade1.reservasViagem(cliente1,"Recife");

        System.out.println();

        System.out.println("------CENÁRIO 2------");
        Cliente cliente2 = new Cliente("Maria","maria@email.com");
        ViagemFacade viagemFacade2 = new ViagemFacade();
        viagemFacade2.reservasViagem(cliente2,"São Paulo");
    }
}