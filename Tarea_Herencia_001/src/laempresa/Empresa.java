package laempresa;

import personal.Trabajador;

public class Empresa {
    private String nombre;
    private String siglas;
    private String ciudad;
    private Trabajador [] trabajadores;

    public Empresa(String nombre, String siglas, String ciudad, int n_a) {
        this.setNombre(nombre);
        this.setSiglas(siglas);
        this.setCiudad(ciudad);
        this.trabajadores =  new Trabajador [n_a];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTrabajadores() {
        String result = "";
        int i = 1;
        for (Trabajador trabajadores: this.trabajadores){
            result += String.format("\n\t%d)\t%s",i,trabajadores);
            i++;
        }
        return result;
    }

    public void setTrabajadores(int i, Trabajador trabajadores) {
        this.trabajadores[i] = trabajadores;
    }
    
    @Override
    public String toString(){
    
        return String.format("Empresa: %s\n"
                + "Siglas: %s\n"
                + "Ciudad: %s\n", this.getNombre(), this.getSiglas(), this.getCiudad());
    }
    
}
