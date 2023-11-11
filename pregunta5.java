public class Main {
    public static void main(String[] args) {
        
        Cadena cadena1 = new Cadena();
        Cadena n2 = new Cadena("examen");

        System.out.println("Longitud de  la cadena 2: " + cadena2.obtenerLongitud());
        cadena2.mostrarCadena();
        char tercerCaracter = cadena2.obtenerCaracter(3);
        System.out.println("Tercer carácter de la cadena 2: " + tercerCaracter);

    }
}
public class Cadena {
    private String cadena;

    public Cadena() {
        this.cadena = "";
    }

    public Cadena(String cadena) {
        this.cadena = cadena;
    }

    public int obtenerLongitud() {
        return cadena.length();
    }

    public String obtenerCadena() {
        return cadena;
    }

    public void establecerCadena(String nuevaCadena) {
        this.cadena = nuevaCadena;
    }

    public void mostrarCadena() {
        System.out.println("La cadena es: " + cadena);
    }

     public char obtenerCaracter(int i) {
        if (i >= 0 && i <  obtenerLongitud()) {
            return cadena.charAt(i);
        } else {
            return (char) -1 ;
       }
    }
}
