package com.fernandogarcia.tema08.ejer7;

import java.util.GregorianCalendar;
import java.util.Scanner;
import com.fernandogarcia.tema08.*;

public class Hospital {

    public static Scanner lector=new Scanner(System.in);

    public static Paciente [] arrayPacientes=new Paciente[50];

    public static AtencionPaciente [] arrayAtencion=new AtencionPaciente[40];

    public static void mainPaciente() {

        Paciente p1=new Paciente(94964183,"Sonia Moran","M","15/12/2018","22:55",20,"Dolor Abdominal",36.5,75,130,60,"16/12/2018","01:25","Curada");
        Paciente p2=new Paciente(37109682,"Juan soler","V","15/12/2018","23:21",38,"Mareo Generalizado",38.2,71,135,55,"16/12/2018","01:39","Curado");
        Paciente p3=new Paciente(52046314,"Pedro Ferrer","V","16/12/2018","02:44",81,"Dolor pecho",36.4,98,175,98,"16/12/2018","02:59","fallece");
        Paciente p4=new Paciente(92367866,"Sergio Signes","V","16/12/2018","05:21",45,"Cambios de temperatura",40.1,115,180,110,"16/12/2018","05:30","Transladado al hospital");
        Paciente p5=new Paciente(79058213,"Ana Peralta","M","16/12/2018","07:50",21,"Migranya interna",36.7,68,125,62,"17/12/2018","10:25","Segimiento");
        Paciente p6=new Paciente(25152798,"Maria Piera","M","16/12/2018","08:13",15,"Contusion en brazo",36.5,75,130,60,"17/12/2018","11:25","Escayola");


        arrayPacientes[0]=p1;
        arrayPacientes[1]=p2;
        arrayPacientes[2]=p3;
        arrayPacientes[3]=p4;
        arrayPacientes[4]=p5;
        arrayPacientes[5]=p6;
        int opcion;

        do {
            System.out.println("-------URGENCIAS---------");

            System.out.println("1.Crear un paciente nuevo");
            System.out.println("2.Atender paciente");
            System.out.println("3.Consultas paciente");
            System.out.println("4.Alta medica paciente");
            System.out.println("0.Fin del programa");

            System.out.println("\nElije un opcion");

            opcion=lector.nextInt();
            lector.nextLine();

            switch(opcion) {
                case 1:
                    //nuevoPaciente();
                    break;

                case 2:

                    break;
                case 3:
                    int consulta;
                    System.out.println("-----CONSULTAS--------");
                    System.out.println("1.Consultas por Sip");
                    System.out.println("2.Consultas por Fecha");
                    System.out.println("3.Estadisticas");
                    System.out.println("4.Muestra el historico mensual");
                    System.out.println("Indica que tipo de consulta quieres hacer");
                    consulta=lector.nextInt();


                    //comsultaPacientes(consulta);

                    break;
                case 4:

                    break;
                case 0:
                    //salir
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Introduce otra opción");
            }

        }while(opcion!=7);

    }
    //-------------------------metodo 1-------------------------------

    private void nuevoPaciente() {

        int sip,edad;
        String nombre,sexo,sintomatologia,;
        GregorianCalendar fechaEntrada,horaEntrada;
        double []preRev=new double[4];

            System.out.println("Introduce el numero Sip del paciente");
            this.sip=lector.nextInt();

            System.out.println("Introduce el nombre del paciente");
            this.nombre=lector.nextLine();
            System.out.println("Introduce el sexo del paciente");
            this.sexo=lector.nextLine();
            System.out.println("Introduce la fecha de entrada (00/00/0000)");
            this.fechaEntrada=lector.nextLine();
            System.out.println("Introduce la hora de entrada (00:00)");
            this.horaEntrada=lector.nextLine();
            System.out.println("Introduce la edad del paciente");
            this.edad=lector.nextInt();
            System.out.println("Introduce la sintomatologia del paciente");
            this.sintomatologia=lector.nextLine();
            System.out.println("Introduce la temperatura del paciente");
            this.preRev[0]=lector.nextDouble();
            System.out.println("Introduce las pulsaciones del paciente");
            this.preRev[1]=lector.nextDouble();
            System.out.println("Introduce la tension arterial sistolica del paciente");
            this.preRev[2]=lector.nextDouble();
            System.out.println("Introduce la tension arterial diastolica del paciente");
            this.preRev[3]=lector.nextDouble();
            System.out.println("Introduce la fecha de alta (00/00/0000)");
            this.fechaAlta=lector.nextLine();
            System.out.println("Introduce la hora de alta (00:00)");
            this.horaAlta=lector.nextLine();
            System.out.println("Introduce el motivo del alta del paciente");
            this.motivoAlta=lector.nextLine();

    }


    //-------------------------metodo 2-------------------------------





    //------------------------metodo 3--------------------------------
       public void comsultaPacientes(int consulta){
        switch(consulta){
            case 1:

                //Consultas por Sip();
                break;
            case 2:
                //Consultas por Fecha();
                break;
            case 3:
                //Estadisticas();
                break;
            case 4:
                //Muestra el historico mensual();
                break;
            case 5:
                //Indica que tipo de consulta quieres hacer();
                break;
                default:
                    System.out.printf("Introduce una opcion valida");
                break;
        }
    }
    //------------------------------metodo 4--------------------------------

}