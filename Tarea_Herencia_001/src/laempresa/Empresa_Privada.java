package laempresa;

public class Empresa_Privada extends Empresa{
    private double ventas_mensual_fijo;
    private int numero_sucursales;

    public Empresa_Privada(String nombre, String siglas, String ciudad, int n_a, double ventas_mensual_fijo, int numero_sucursales) {
        super(nombre, siglas, ciudad, n_a);
        this.ventas_mensual_fijo = ventas_mensual_fijo;
        this.numero_sucursales = numero_sucursales;
    }

    public double getVentas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void setVentas_mensual_fijo(double ventas_mensual_fijo) {
        this.ventas_mensual_fijo = ventas_mensual_fijo;
    }

    public int getNumero_sucursales() {
        return numero_sucursales;
    }

    public void setNumero_sucursales(int numero_sucursales) {
        this.numero_sucursales = numero_sucursales;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "Ventas: $ %.2f\n"
                + "Sucursales: %d\n"
                + "Lista Trabajadores:\n"
                + "%s\n", super.toString(), this.getVentas_mensual_fijo(), this.getNumero_sucursales(), this.getTrabajadores());
    }
    
    
    
    
}
