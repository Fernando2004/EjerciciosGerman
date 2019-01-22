//package com.fernandogracia.tema08;

import java.util.Scanner;

public class MainPrincipal{
   public static Scanner lector=new Scanner (System.in);

    
    public static Coche [] vehiculo =new Coche[10];

    //metodos
    /**Busca al obgeto coche por una ref unica */
    public static int buscaCoche(String matricula){
        int pos=-1;
        for(int i=0;i<=vehiculo.length;i++){
            if(vehiculo[i]!=null &&
            vehiculo[i].getMatricula().equalsIgnoreCase(matricula)){
                pos=i;
                break;
            }
        }
        return pos;
    }
    //-------------------------------------------------
    /**Busca un hueco dentro del array y nos devuelve la posicion */
    public static int buscoHueco(){
        int pos=-1;
        for(int i=0;i<=vehiculo.length;i++){
            if(vehiculo[i]==null){
                pos=i;
                break;
            }
        }
        return pos;
    }
    //---------------------------------------------------------
    /**Muestra todos los coches creados */
    public static void imprimeCoche(){
        for(int i=0;i<vehiculo.length;i++){
            if(vehiculo[i]!=null){
                System.out.println(vehiculo[i].imprimeCoche());
                System.out.println("-------------------------");
                System.out.println(vehiculo[i].toStringCoche());
                System.out.println("-------------------------");
            }
        }
    }
    //----------------------------------------------------------
    /**Introduce un coche nuevo en el array */
    public static void nuevoCoche(){
        int pos=buscoHueco();
        if(pos!=-1){
            vehiculo[pos]=new Coche();
            System.out.println("Coche bien creado en la posicion  "+pos);
        }else{
            System.out.println("No hay sitio para mas coches");
        }    

    }
    //--------------------------------------------------------------
    /**Modifica los datos del coche encontrado por matricula */
    public static void modificarDatos(String matricula){
        int pos=buscaCoche(matricula);
        if(pos!=-1){
            System.out.println("Introduce el modelo nuevo ");
            vehiculo[pos].setModelo(lector.nextLine());
            System.out.println("Introduce el color nuevo ");
            vehiculo[pos].setColor(lector.nextLine());
            System.out.println("Pintura metalizada (true/false)");
            vehiculo[pos].setTipoPintura(lector.nextBoolean());
            System.out.println("Introduce la matricula nueva");
            vehiculo[pos].setMatricula(lector.nextLine());
            System.out.println("Indique el tipo de vehiculo ");
            System.out.println("MINI");
            System.out.println("UTILITARIO");
            System.out.println("FAMILIAR");
            System.out.println("DEPORTIVO");
            vehiculo[pos].setTipoCoche(lector.nextLine());
            System.out.println("Indique el anyo de fabricacion");
            vehiculo[pos].setAnyoFabricacion(lector.nextInt());
            System.out.println("Indique si el seguro es a todo reisgo (true/false)");
            vehiculo[pos].setTipoSeguro(lector.nextBoolean());

        }else{
            System.out.println("La matricula no existe");
        }
        
    }
    
    public static void main(String[] args) {

        
        //Los creo explicitamente
        Coche c1=new Coche("Seat","negro",true,"HDE1456","MINI",2005,false);
        Coche c2=new Coche("Seat","azul",true,"ADE1220","DEPORTIVO",2005,false);
        Coche c3=new Coche("Seat","blanco",true,"TYE3369","FAMILIAR",2005,false);
        Coche c4=new Coche("Seat","rojo",true,"ODE1456","UTILITARIO",2005,false);
        Coche c5=new Coche();
        //los meto en un array
        vehiculo[0]=c1;
        vehiculo[1]=c2;
        vehiculo[2]=c3;
        vehiculo[3]=c4;
        vehiculo[4]=c5;
        int opcion;

        do{
            System.out.println("---MENU----");
            System.out.println("1.Mostrar coches");
            System.out.println("2.Nuevos coches");
            System.out.println("3.Modifica datos de coches");
            System.out.println("0.salir de la aplicacion");

            System.out.println("Indique una opcion");
            opcion=lector.nextInt();
            switch(opcion){
                case 1:
                   imprimeCoche();
                break;
                case 2:
                    nuevoCoche();
                break;
                case 3:
                    imprimeCoche();
                    System.out.println("Indique la matricula del vehiculo a modificar");
                    String matricula="";
                    modificarDatos(matricula);
                break;
                case 0:
                    System.out.println("fin");
                break;
                default:
                System.out.println("Indique una opcion correcta");
            }
            if(opcion==0)
                break;
                System.out.println("Pulsa intro para continuar");
               String intro=lector.nextLine();
                intro=lector.nextLine();
            if(intro.equalsIgnoreCase("si")){
                continue;
            }else{
                System.out.println("Indique la opcion 0 para salir");
            }   
             
        }while(opcion!=0);



        
    }
}