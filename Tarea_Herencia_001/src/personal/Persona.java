package personal;

public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    
    public Persona(String n, String a, String cd, int e){
        setNombre(n);
        setApellido(a);
        setCedula(cd);
        setEdad(e);
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setApellido(String n){
        apellido = n;
    }
    
    public void setCedula(String n){
        cedula = n;
    }
    
    public void setEdad(int n){
        edad = n;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getCedula(){
        return cedula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s\n"
                + "\t\t%d años de edad\n"
                + "\t\tCI: %s\n", 
                getNombre(), getApellido(), getEdad(), getCedula());
    }
    
}
