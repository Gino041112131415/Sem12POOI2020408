public class Main
{
	public static void main(String[] args) {
		 Hora primeraHora = new Hora(12, 30, 00);
         Hora segundaHora = new Hora(13, 00, 00);
      primeraHora.visualizar();
      segundaHora.visualizar();

    Hora horafinal = primeraHora.sumar(segundaHora);
    horafinal.visualizar();
	}
}
public class Hora {
    private int horas , minutos , segundos ;
	
 public Hora() {}
	
 public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
 public void visualizar() {
    System.out.println(String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos));
 } 
 public Hora sumar(Hora h) {
     int horaSuma = this.horas + h.horas;
     int minutoSuma = this.minutos + h.minutos;
     int segundoSuma = this.segundos + h.segundos;
    for (; minutoSuma >= 60; minutoSuma -= 60) {
        horaSuma++;
    }
    for (; segundoSuma >= 60; segundoSuma -= 60) {
        minutoSuma++;
    }
   return new Hora(horaSuma, minutoSuma, segundoSuma);
    }
}
