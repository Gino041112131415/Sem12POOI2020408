import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        Empleado[] empleados = new Empleado[50];
        int i = 0;

        while (i < 50) {
            empleados[i] = new Empleado();
            empleados[i].leerDatos();
            i++;
        }

        System.out.println("\nDatos de los empleados:");
        i = 0;

        while (i < 50) {
            empleados[i].verDatos();
            System.out.println("-");
            i++;
        }
    }
}

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int nEmpleado;

    public Empleado() {}

    public Empleado(String nombre, int nEmpleado) {
        this.nombre = nombre;
        this.nEmpleado = nEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNEmpleado() {
        return nEmpleado;
    }

    public void setNumeroEmpleado(int nEmpleado) {
        this.nEmpleado = nEmpleado;
    }

    public void leerDatos() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        this.nombre = s.nextLine();
        System.out.println("Ingrese el número de empleado: ");
        this.nEmpleado = s.nextInt();
    }

    public void verDatos() {
        System.out.println("Nombre del empleado: " + this.nombre);
        System.out.println("Número de empleado: " + this.nEmpleado);
    }
}
