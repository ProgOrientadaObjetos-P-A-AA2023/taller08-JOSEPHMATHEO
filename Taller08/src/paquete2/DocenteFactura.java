package paquete2;

public class DocenteFactura extends Docente {
    
    private double vFactura;
    private int vIvaDes;
    private double vCancelar;

    public void establecervFactura(double f) {
        
        vFactura = f;
        
    }

    public void establecervIvaDes(int f) {
        
        vIvaDes = f;
        
    }

    public void calcularvCancelar() {
        
        vCancelar = vFactura - (vFactura * ( (double)(vIvaDes) / 100 ) );
    }

    public double obtenerFactura() {
        
        return vFactura;
        
    }

    public double obtenervIvaDes() {
        
        return vIvaDes;
        
    }

    public double obtenervCancelar() {
        
        return vCancelar;
        
    }
    
    @Override
    public String toString(){
        String reporte = String.format("\nNombres: %s\n"
                + "Cedula: %s\n"
                + "Valor de la Factura: $%.1f\n"
                + "Valor del Iva para Descuento: %d\n"
                + "Valor a Cancelar: $%.1f\n",
                nombre,
                cedula,
                vFactura,
                vIvaDes,
                vCancelar);
        
        return reporte;
    }
    
}
