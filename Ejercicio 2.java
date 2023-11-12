import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int numeroEmpleado;

    public Empleado() {
        this.nombre = "";
        this.numeroEmpleado = 0;
    }

    public void leerDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        this.nombre = sc.nextLine();
        System.out.print("Ingrese el número de empleado: ");
        this.numeroEmpleado = sc.nextInt();
    }

    public void verDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Número de empleado: " + numeroEmpleado);
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado(); 
        empleado.leerDatos(); 
        System.out.println("\nDatos del empleado:");
        empleado.verDatos(); 
    }
}
