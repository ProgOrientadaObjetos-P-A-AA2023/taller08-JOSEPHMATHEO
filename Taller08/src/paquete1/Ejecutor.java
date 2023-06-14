package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.DocenteFactura;
import paquete2.DocenteNombramiento;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        // Declaracion de Variables 
        
        Scanner lm = new Scanner(System.in);
        lm.useLocale(Locale.US);
        String nombres;
        String cedula;
        boolean condicion = true;
        
        // Ingreso de Datos
        
        System.out.print("Ingrese los nombres del Docente: ");
        nombres = lm.nextLine();
        
        System.out.print("Ingrese la cedula del Docente: ");
        cedula = lm.nextLine();
        
        while(condicion){
            
            System.out.printf("Opciones de Docente: \n"
                + "1) Docente Nombramiento \n"
                + "2) Docente Factura \n"
                + "3) Salir del Programa \n\n"
                + "Elija una opcion: "
                );
            
                int opcion = lm.nextInt();
            
            switch(opcion){

                    case 1:
                        ;
                        System.out.println("Ingrese el valor del sueldo: ");
                        double valorS = lm.nextDouble();
                        
                        System.out.println("Ingrese el valor de las horas extras: ");
                        double vHoras = lm.nextDouble();
                        
                        System.out.println("Ingrese el numero de horas extras: ");
                        int numH = lm.nextInt();

                        DocenteNombramiento dc = new DocenteNombramiento();
                        dc.establecerNombre(nombres);
                        dc.establecerCedula(cedula);
                        dc.establecerVSueldo(valorS);
                        dc.establecerValorHoE(vHoras);
                        dc.establecerNumHoE(numH);
                        dc.calcularSuledo();

                         System.out.printf("%s\n", dc);

                        break;

                    case 2:
                        
                        System.out.println("Ingrese el valor de la Factura");
                        double vFactura = lm.nextDouble();
                        
                        System.out.println("Ingrese el valor del iva de descuento ");
                        int vIvaD = lm.nextInt();

                        DocenteFactura df = new DocenteFactura();
                        df.establecerNombre(nombres);
                        df.establecerCedula(cedula);
                        df.establecervFactura(vFactura);
                        df.establecervIvaDes(vIvaD);
                        df.calcularvCancelar();

                        System.out.printf("%s\n", df);

                        break;
                        
                    case 3:
                        
                        System.err.println("Saliendo del Porgrama...");
                        condicion = false;
                        break;

                    default:

                        System.err.println("Error, opcion no valida");
                        break;
                        
            }
        
        }
        
    }
    
}
