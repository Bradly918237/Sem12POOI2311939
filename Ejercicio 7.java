public class Empleado {
    private String nombre;
    private double salario;
    private String categoria;
    private double bonoSupervisor;
    private double bonoDirector;
    private int acciones;

    public Empleado(String nombre, double salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    public Empleado(String nombre, double salario, String categoria, double bonoSupervisor) {
        this(nombre, salario, categoria);
        this.bonoSupervisor = bonoSupervisor;
    }

    public Empleado(String nombre, double salario, String categoria, double bonoSupervisor, double bonoDirector, int acciones) {
        this(nombre, salario, categoria, bonoSupervisor);
        this.bonoDirector = bonoDirector;
        this.acciones = acciones;
    }

    public double calcularSalario() {
        return salario;
    }

    public void darDeAlta() {
    }

    public void jubilacion() {
    }

    public void aumentarSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
    }

    public double calcularBonoSupervisor() {
        return bonoSupervisor;
    }

    public String obtenerInformacionPublica() {
        return "Nombre: " + nombre + ", Salario: " + salario;
    }

    public String obtenerInformacionSupervisor() {
        return obtenerInformacionPublica() + ", Bono Supervisor: " + bonoSupervisor;
    }

    public double calcularBonoDirector() {
        return bonoDirector;
    }

    public void otorgarAumentoSalario(double porcentaje) {
        aumentarSalario(porcentaje * 1.5); 
    }

    public String obtenerInformacionRH() {
        return obtenerInformacionSupervisor() + ", Bono Director: " + bonoDirector + ", Acciones: " + acciones;
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 2000, "Operativo");
        Empleado supervisor = new Empleado("Ana", 9000, "Supervisor", 9000);
        Empleado director = new Empleado("Carlos", 150000, "Director", 5500, 11000, 100);
        System.out.println("Información Empleado: " + empleado.obtenerInformacionPublica());
        System.out.println("Información Supervisor: " + supervisor.obtenerInformacionSupervisor());
        System.out.println("Información Director: " + director.obtenerInformacionRH());
        supervisor.aumentarSalario(10);
        director.otorgarAumentoSalario(15);
        System.out.println("Nuevo salario Supervisor: " + supervisor.calcularSalario());
        System.out.println("Nuevo salario Director: " + director.calcularSalario());
    }
}
