public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0; 
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void visualizarHora() {
        String horaFormateada = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        System.out.println("Hora: " + horaFormateada);
    }

    public Hora sumarHoras(Hora otraHora) {
        Hora resultado = new Hora();

        resultado.segundos = this.segundos + otraHora.segundos;
        resultado.minutos = this.minutos + otraHora.minutos + resultado.segundos / 60;
        resultado.horas = this.horas + otraHora.horas + resultado.minutos / 60;

        resultado.segundos %= 60;
        resultado.minutos %= 60;
        resultado.horas %= 24;

        return resultado;
    }

    public static void main(String[] args) {
        Hora hora1 = new Hora(10, 30, 45);
        Hora hora2 = new Hora(3, 15, 20);
        Hora resultado = new Hora();

        resultado = hora1.sumarHoras(hora2);

        System.out.print("Hora 1: ");
        hora1.visualizarHora();

        System.out.print("Hora 2: ");
        hora2.visualizarHora();

        System.out.print("Resultado: ");
        resultado.visualizarHora();
    }
}
