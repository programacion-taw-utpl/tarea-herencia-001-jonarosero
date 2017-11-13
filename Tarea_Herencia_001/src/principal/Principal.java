package principal;

import laempresa.Empresa_Privada;
import personal.Trabajador;

public class Principal {

    public static void main(String[] args) {
        Empresa_Privada emp = new Empresa_Privada("Soluciones Software", "SS´s", "Loja", 2, 200000, 12);
        Trabajador t = new Trabajador("Ana Luisa", "Velez Alcivar", "12903939", 30, 100, 40, 10);
        Trabajador t2 = new Trabajador("Mario Anibal", "Vela Narvaez", "212889", 35, 100, 50, 10);
        emp.setTrabajadores(0, t);
        emp.setTrabajadores(1, t2);
        System.out.println(emp);
        
    }
    
}
