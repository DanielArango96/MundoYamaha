package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer idDeudor;
        String tipoDocumento;
        String documento;
        String nombres;
        String apellidos;
        String telefonoMovil;
        String telefonoFijo;
        String direccion;
        Integer idFiador;
        String nombresFiador;
        String documentoFiador;
        Double valorBrutoMoto;
        Double valorTotalMoto;
        Boolean tieneLicenciaElConductor;
        String tipoCompra;

        Scanner leer = new Scanner(System.in);

        //Proceso

        System.out.println("********************************");
        System.out.println("MUNDO YAMAHA");
        System.out.println("********************************");

        System.out.println("apreciado cliente,¿usted cuenta con licencia?");
        tieneLicenciaElConductor=leer.nextBoolean();

        //Primera desicion
        if(tieneLicenciaElConductor==true){
            //Si tiene licencia

            System.out.print("Nombres del cliente");
            leer.nextLine();
            nombres= leer.nextLine();

            System.out.print("Apellidos del cliente");
            leer.nextLine();
      apellidos= leer.nextLine();

            System.out.print("Tipo documento");
            leer.nextLine();
            tipoDocumento= leer.nextLine();

            System.out.print("Numero del documento");
            leer.nextLine();
            documento= leer.nextLine();

            System.out.print("Telefono celular");
            leer.nextLine();
            telefonoMovil= leer.nextLine();

            System.out.print("Tefono fijo");
            leer.nextLine();
            telefonoFijo= leer.nextLine();

            System.out.print("Direccion");
            leer.nextLine();
            direccion=leer.nextLine();
            System.out.print("Documento fiador");
            leer.nextLine();
documentoFiador= leer.nextLine();
            System.out.print("nombres fiador");
            leer.nextLine();
            nombresFiador= leer.nextLine();

            System.out.println("Nuestras motocicletas");
            System.out.println("1. Yamaha SZR 125----$9000000");
            System.out.println("2. Yamaha cripton FI----$8000000");
            System.out.println("3. Yamaha XTZ125---$10500000");
            System.out.println("4. Yamaha MT10 ----$72000000");
            System.out.println("5. Yamaha NMAX300----$34000000");

            Integer motoSeleccionada;
            System.out.println("Digite la motocicleta seleccionada");
            motoSeleccionada= leer.nextInt();
            Double valorMoto=0.0;
            if (motoSeleccionada==1){
                valorMoto=9000000.0;

            } else if (motoSeleccionada==2) {
                valorMoto=8000000.0;

            } else if (motoSeleccionada==3) {
                valorMoto=10500000.0;

            } else if (motoSeleccionada==4) {
                valorMoto=72000000.0;

            } else if (motoSeleccionada==5) {
                valorMoto=34000000.0;

            } else {
                System.out.println("Moto invalida");

            }
            //2 pregunta: Lo quiere a credito
            System.out.println("Usuario digite credito o contado para continuar su compra");
            leer.nextLine();
            tipoCompra= leer.nextLine().toLowerCase();

            if (tipoCompra.equals("credito")){
                //Le pregunto por el porcentaje que desea financiar
     Double porcentajeFinanciar;
                System.out.println("Ingresa el porcentaje a financiar");
                porcentajeFinanciar= leer.nextDouble();
                if (porcentajeFinanciar==1.0){
                    Double valorIntereses=0.25;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);


                } else if (porcentajeFinanciar==0.7) {
                    Double valorIntereses=0.15;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);
                } else if (porcentajeFinanciar==0.5) {
                    Double valorIntereses=0.07;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);
                } else{
                    System.out.println("Opcion Invalida");

                }

            }else{
                System.out.println("Enhorabuena, Le daremos un descuento del 10%");

            }

        }else{
            //No tiene licencia
            System.out.println("Aprecido usuario no podemos continuar la transaccion");
            System.out.println("Lo invitamos a tramitar su licencia, vuelva pronto");

        }

























    }
}