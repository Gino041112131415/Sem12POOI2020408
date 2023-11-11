public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double cSalario() {
        return salario;
    }

    public void darAlta() {
        
    }

    public void jubilacion() {
        
    }
}

public class Supervisor extends Empleado {
    private int nJerarquico;

    public Supervisor(String nombre, double salario, int nJerarquico) {
        super(nombre, salario);
        this.nJerarquico = nJerarquico;
    }

    @Override
    public double cSalario() {
        return super.cSalario();
    }
}

public class RecursosHumanos extends Empleado {
    private String departamento;

    public RecursosHumanos(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

}

public class SUNAT extends Empleado {
    private String tAcceso;

    public SUNAT(String nombre, double salario, String tAcceso) {
        super(nombre, salario);
        this.tAcceso = tAcceso;
    }

 
}
