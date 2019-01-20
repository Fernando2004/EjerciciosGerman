package com.fernandogarcia.tema08.ejer6;

import com.fernandogarcia.tema08.util.Lib;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Bicicleta{

        Scanner lector=new Scanner(System.in);
        private static int referencia=0;

        private int ref=++referencia;
        private String marca;
        private String modelo;
        private int kg;
        private int pulgadas;
        private boolean motor;
        private GregorianCalendar fechaFabricacion;
        private double precio;
        private int stock;


        public  Bicicleta(){
            System.out.println("Introduce la marca de la bicicleta ");
            this.marca=lector.nextLine();
            System.out.println("Introduce el modelo de la bicicleta ");
            this.modelo=lector.nextLine();
            System.out.println("Introduce el peso de la bicicleta ");
            this.kg=lector.nextInt();
            System.out.println("Introduce las pulgadas de las ruedasen de la bicicleta ");
            this.pulgadas=lector.nextInt();
            System.out.println("Introduce si la bicicleta tiene motor o no (SI/NO) ");
            String tieneMotor=lector.nextLine();
            lector.nextLine();

            if(tieneMotor.equalsIgnoreCase("si")){
                this.motor=true;
            }else{
                this.motor=false;
            }

            System.out.println("Introduce la fecha de fabricacion de la bicicleta ");
            this.fechaFabricacion= Lib.getFechaActual();
            System.out.println("Introduce el precio de la bicicleta ");
            this.precio=lector.nextDouble();
            System.out.println("Introduce la cantidad de stock de ese modelo");
            this.stock=lector.nextInt();
        }
        public Bicicleta(int ref,String marca,String modelo,int kg,int pulgadas,boolean motor,String fechaFabricacion,double precio,int stock){
            this.ref=ref;
            this.marca=marca;
            this.modelo=modelo;
            this.kg=kg;
            this.pulgadas=pulgadas;
            this.motor=motor;
            //this.fechaFabricacion=fechaFabricacion;
            this.precio=precio;
            this.stock=stock;
        }

        public void setRef(int ref){
            this.ref=ref;
        }
        public int getRef(){
            return this.ref;
        }
        public void setMarca(String marca){

            this.marca=marca;
        }
        public String getMarca()
        {
            return this.marca=marca;
        }
        public void setModelo(String modelo){

            this.modelo=modelo;
        }
        public String getModelo(){
            return
                    this.modelo=modelo;
        }
        public void setKg(int kg){

            this.kg=kg;
        }
        public int getKg(){

            return this.kg;
        }
        public void setPulgadas(int pulgadas){

            this.pulgadas=pulgadas;
        }
        public int getPulgadas(){
            return
                    this.pulgadas;
        }
        public void setMotor(boolean motor){
            this.motor=motor;
        }
        public boolean getMotor(){
            return
                    this.motor;
        }
        /*public void setFechaFabricacion(String fechaFabricacion){

            //this.fechaFabricacion=fechaFabricacion;
        }
        public String getFechaFabricacion(){
            return
                    //this.fechaFabricacion=fechaFabricacion;
        }*/
        public void setPrecio(double precio){

            this.precio=precio;
        }
        public double getPrecio(){

            return precio=precio;
        }
        public void setStock(int stock){

            this.stock=stock;
        }
        public int getStock(){

            return this.stock;
        }
        //toString
        public String toString(){
            String cadena=
                    "BICICLETA \n Ref:\t"+ref+
                            "Marcha\t"+marca+
                            "Modelo\t"+modelo+
                            "Kg\t"+kg+
                            "Pulgadas\t"+pulgadas;
            if(this.motor==true){
                cadena+="Motor\t SI";
            }else
                cadena+="Motor\t NO"+
                        "Fecha de fabricacion\t" +fechaFabricacion+
                        "Precion\t"+precio+
                        "Stock\t"+stock;
            return cadena;
        }



        public void mainBicicleta() {
            Scanner lector=new Scanner(System.in);


            int opcion=0;

            do{
                //try{
                System.out.println("------GESTIÓN BICICLETAS-------");

                switch(opcion){
                    case 1:
                        //nuevaBicicleta();
                        break;
                    case 2:
                        //venderBicicleta();
                        break;
                    case 3:
                        int consulta;
                        System.out.println("------CONSULTA BICICLETAS-------");
                        System.out.println("1.Consultar por referencia ");
                        System.out.println("2.Consultar por marca ");
                        System.out.println("3.Consultar por modelo ");
                        System.out.println("0.Volver al menu principal ");
                        lector.nextLine();
                        consulta=lector.nextInt();
                        //consultaBicicleta(consulta);
                        break;
                    case 4:
                        //mostrarStockBicicletas();
                        break;
                    case 0:
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
                //}catch(InterruptedException e){
                System.out.println("La opcion introducida no es correcta");
                lector.nextLine();
                //}
            }while(opcion!=0);
        }
    }
