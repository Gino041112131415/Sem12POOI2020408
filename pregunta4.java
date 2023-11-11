public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora();
        hora.setHoras(12);
        hora.setMinutos(30);
        hora.setSegundos(10);
     
        hora.visualizar();
        int numPasos = 66;

        for (int i = 0; i < numPasos; i++) {
            hora.avanzar();
            hora.visualizar();
        }

        hora.ponerACero();
        hora.visualizar();
    }
}

 public class Hora {

  private int horas , minutos , segundos;
  
  public Hora() {}
  public Hora(int horas , int minutos, int segundos){
     this.horas = horas;
     this.minutos = minutos;
     this.segundos = segundos;
      
  }

  public int getHoras() {
    return this.horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public int getMinutos() {
    return this.minutos;
  }
  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }
  public int getSegundos() {
    return this.segundos;
  }
  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }
    public void avanzar() {
    this.segundos++;
    
    while (this.segundos == 60) {
        this.minutos++;
        this.segundos = 0;
    }
    
    while (this.minutos == 60) {
        this.horas++;
        this.minutos = 0;
     }
    }

  public void ponerACero() {
    this.horas = 0;
    this.minutos = 0;
    this.segundos = 0;
  }
   public void visualizar() {
    System.out.println("Hora: " + this.horas + ":" + this.minutos + ":" + this.segundos);
  }

}
