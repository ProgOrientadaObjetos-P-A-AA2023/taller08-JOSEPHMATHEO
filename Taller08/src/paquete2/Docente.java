package paquete2;

public class Docente {
    
    protected String nombre;
    protected String cedula;

    public void establecerNombre(String s) {
        
        nombre = s;
        
    }

    public void establecerCedula(String s) {
        
        cedula = s;
        
    }

    public String obtenerNombre() {
        
        return nombre;
        
    }

    public String obtenerCedula() {
        
        return cedula;
        
    }
    
    
    
}
