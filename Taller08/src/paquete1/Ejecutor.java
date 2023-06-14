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
        
        // Presentacion de Programa
        
        System.out.println("--Informacion Pago Docentes--");
        
            while(condicion){

                System.out.print("\nIngrese los nombres del Docente: ");
                nombres = lm.nextLine();

                System.out.print("Ingrese la cedula del Docente: ");
                cedula = lm.nextLine();

                System.out.printf("\nOpciones de Docente: \n"
                    + "1) Docente Nombramiento \n"
                    + "2) Docente Factura \n"
                    + "3) Salir del Programa \n\n"
                    + "Elija una opcion: "
                    );

                    int opcion = lm.nextInt();
                    lm.nextLine();

                switch(opcion){

                        case 1:

                            System.out.print("\nIngrese el valor del sueldo: ");
                            double valorS = lm.nextDouble();

                            System.out.print("Ingrese el valor de las horas extras: ");
                            double vHoras = lm.nextDouble();

                            System.out.print("Ingrese el numero de horas extras: ");
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

                            System.out.print("\nIngrese el valor de la Factura: ");
                            double vFactura = lm.nextDouble();

                            System.out.print("Ingrese el valor del iva de descuento: ");
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

                            System.err.println("\nSaliendo del Porgrama...");
                            condicion = false;
                            break;

                        default:

                            System.err.println("\nError, opcion no valida");
                            break;

                }

            }
        
    }
    
}
