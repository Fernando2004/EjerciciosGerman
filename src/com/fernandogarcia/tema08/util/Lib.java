package com.fernandogarcia.tema08.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Lib {


    //todos static
    //public static void limpiar(){


    //pausa(){}

    //fechaFabricacion(){



    /**Devuelve un Gregorian calendar con la fecha actual*/
    public static GregorianCalendar getFechaActual(){

        GregorianCalendar calendar=new GregorianCalendar();

        return calendar;
    }

    /**Devuelve el anyo de la fecha que le pase */
    public static int getAnyo(GregorianCalendar date){

        int anyo = date.get(Calendar.YEAR);

        return anyo;
    }
    /**Devuelve el mes de la fecha que le pase */
    public static int getMes(GregorianCalendar date){

        int mes = date.get(Calendar.MONTH);

        return mes;
    }
    /**Devuelve el dia de la fecha que le pase */
    public static int getDia(GregorianCalendar date){

        int dia = date.get(Calendar.DAY_OF_YEAR);

        return dia;
    }
    //----------------------------------------------------------





}
