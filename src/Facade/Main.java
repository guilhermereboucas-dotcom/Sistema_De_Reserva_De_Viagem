package Facade;

import Facade.Dominio.Cliente;
import Facade.Fachada.ViagemFacade;

public class Main {
    public static void main(String[] args) {

        System.out.println("------CENÁRIO 1------");
        Cliente cliente1 = new Cliente("João","joao@email.com");
        ViagemFacade viagemFacade = new ViagemFacade();
        viagemFacade.reservasViagem(cliente1,"Recife");

        System.out.println();

        System.out.println("------CENÁRIO 2------");
        Cliente cliente2 = new Cliente("Maria","maria@email.com");
        viagemFacade.reservasViagem(cliente2,"São Paulo");
    }
}
