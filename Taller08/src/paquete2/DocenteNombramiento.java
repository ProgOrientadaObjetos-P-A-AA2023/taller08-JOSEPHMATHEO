package paquete2;

public class DocenteNombramiento extends Docente{
    
    private double vSueldo;
    private double valorHoE;
    private int numHoE;
    private double suledo;

    public void establecerVSueldo(double f) {
        
        vSueldo = f;
        
    }

    public void establecerValorHoE(double f) {
        
        valorHoE = f;
    }

    public void establecerNumHoE(int d) {
        
        numHoE = d;
       
    }

    public void calcularSuledo() {
        
        suledo = vSueldo + (valorHoE * numHoE);
        
    }

    public double obtenerVSueldo() {
        
        return vSueldo;
        
    }

    public double obtenerValorHoE() {
        
        return valorHoE;
        
    }

    public int obtenerNumHoE() {
        
        return numHoE;
        
    }

    public double obtenerSuledo() {
        
        return suledo;
        
    }
    
    @Override
    public String toString(){
        String reporte = String.format("Nombres: %s\n"
                + "Cedula: %s\n"
                + "Valor del Sueldo: %.1f\n"
                + "Valor Hora Extra: %.1f\n"
                + "Numero de Horas Extra: %d\n"
                + "Sueldo: %.1f\n",
                nombre,
                cedula,
                vSueldo,
                valorHoE,
                numHoE,
                suledo);
        
        return reporte;
    }
    
}
