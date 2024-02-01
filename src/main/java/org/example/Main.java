package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
         String nombre;
         String cedula;
         Integer opcion;
         Integer cantidadProducto;
         Double sumatoriaCosto = 0.0;
         Double costoTotal =0.0;
         Scanner teclado = new Scanner(System.in);

         // proceso
        //1.CREAR UN MENU DE OPCIONES

        System.out.println("*******Peluchitos sas*******");
        System.out.println("1.cumple años");
        System.out.println("2.Dia de la mujer");
        System.out.println("3.baby showers");
        System.out.println("4.SALIR");

        //2.permitir que el usuario escoja
do {
    System.out.println("digite la opcion deseada");
    opcion = teclado.nextInt();

    //3.evaluando lAs opciones delmenu

    if (opcion==1) {
        System.out.println("digita cuantos kit de cumple años desa");
        cantidadProducto= teclado.nextInt();
        costoTotal=180000.0*cantidadProducto;
        sumatoriaCosto=sumatoriaCosto+costoTotal;


    } else if (opcion==2) {
        System.out.println("digita cuantos kit de muejer desa");
        cantidadProducto=teclado.nextInt();
        costoTotal=60000.0*cantidadProducto;
        sumatoriaCosto=sumatoriaCosto+costoTotal;


    } else if (opcion==3) {
        System.out.println("digita cuantos kit de bebe  desa");
        cantidadProducto=teclado.nextInt();
        costoTotal=25000.0*cantidadProducto;
        sumatoriaCosto=sumatoriaCosto+costoTotal;


    } else if (opcion==4) {
        System.out.println("Gracias, hasta pronto");

    } else {
        System.out.println("digita una opcion valida");
    }

}while(opcion!=4);
        System.out.println("el costo es de:"+sumatoriaCosto);



    }
}