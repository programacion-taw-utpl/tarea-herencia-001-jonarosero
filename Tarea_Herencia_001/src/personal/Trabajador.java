package personal;

public class Trabajador extends Persona {

    private double costo_seguro;
    private int horas_trabajadas;
    private double costo_por_hora;
    private double sueldo;

    public Trabajador(String n, String a, String cd, int e, double costo_seguro, int horas_trabajadas, double costo_por_hora) {
        super(n, a, cd, e);
        this.setCosto_seguro(costo_seguro);
        this.setHoras_trabajadas(horas_trabajadas);
        this.setCosto_por_hora(costo_por_hora);
    }

    public double getCosto_seguro() {
        return costo_seguro;
    }

    public void setCosto_seguro(double costo_seguro) {
        this.costo_seguro = costo_seguro;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public double getCosto_por_hora() {
        return costo_por_hora;
    }

    public void setCosto_por_hora(double costo_por_hora) {
        this.costo_por_hora = costo_por_hora;
    }

    public double obtener_sueldo() {
        sueldo = ((this.getHoras_trabajadas() * this.getCosto_por_hora()) + this.getCosto_seguro());
        return sueldo;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "\t\tSeguro: $ %.2f\n"
                + "\t\tHoras trabajadas: %d\n"
                + "\t\tValor x Hora: $ %.2f\n"
                + "\t\tSueldo: $ %.2f", super.toString(), this.getCosto_seguro(), this.getHoras_trabajadas(),
                this.getCosto_por_hora(), this.obtener_sueldo());
    }
    
    

}
