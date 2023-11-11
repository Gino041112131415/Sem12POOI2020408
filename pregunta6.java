public class Main {
    public static void main(String[] args) {
  LAN lan = new LAN();
        lan.añadirNodo("Nodo  numero 1");
        lan.añadirNodo("Nodo  numero 2");
        lan.enumerarNodos();
        lan.quitarNodo("Nodo  numero 1");
        lan.config_Red("arbol");
        lan.E_T_Paquete(1024);
        lan.e_Paquete("Nodo numero 2", "Nodo  numero 3");
        lan.d_Paquete("Nodo  numero 2");
        lan.Estadisticas();
}
}

import java.util.ArrayList;
import java.util.List;

public class LAN {
    private List<String> nodos;

    public LAN() {
        nodos = new ArrayList<>();
    }

    public void enumerarNodos() {
        System.out.println("Nodos actuales de la red LAN:");
        for (String nodo : nodos) {
            System.out.println(nodo);
        }
    }

    public void añadirNodo(String nodo) {
        nodos.add(nodo);
        System.out.println("Se ha añadido el nodo: " + nodo);
    }

    public void quitarNodo(String nodo) {
        if (nodos.contains(nodo)) {
            nodos.remove(nodo);
            System.out.println("Se ha quitado  el nodo: " + nodo);
        } else {
            System.out.println("El nodo no existe en la red LAN.");
        }
    }

    public void config_Red(String topologia) {
        System.out.println("Se ha configurado de forma correcta la red con la topología: " + topologia);
    }

    public void E_T_Paquete(int tamano) {
        System.out.println("Se ha especificado de forma correcta el tamaño del paquete: " + tamano + " bytes");
    }

    public void e_Paquete(String nodoOrigen, String nodoDestino) {
        System.out.println("Se ha enviado de forma correcta un paquete desde el nodo " + nodoOrigen + " al nodo " + nodoDestino);
    }

    public void d_Paquete(String nodoOrigen) {
        System.out.println("Se ha difundido de forma correcta  un paquete desde el nodo " + nodoOrigen + " a todos los demás nodos de la red");
    }

    public void Estadisticas() {
        System.out.println("Se han realizado  estadísticas de la LAN");
    }
}
