package com.fernandogarcia.tema08.ejer7;
import java.util.Scanner;


public class Paciente{

    Scanner lector=new Scanner(System.in);

    private int sip;
    private String nombre;
    private String sexo;
    private String fechaEntrada;
    private String horaEntrada;
    private int edad;
    private String sintomatologia;
    //meto la tem,ppm,temsis y temdias en un array
    private double []preRev=new double[4];
    private String fechaAlta;
    private String horaAlta;
    private String motivoAlta;

    //constructores

    public Paciente(int sip,String nombre,String sexo,String fechaEntrada,String horaEntrada,int edad,String sintomatologia,double temperatura,double pulsaciones,double sistolica,double diastolica,String fechaAlta,String horaAlta,String motivoAlta){
        this.sip=sip;
        this.nombre=nombre;
        this.sexo=sexo;
        this.fechaEntrada=fechaEntrada;
        this.horaEntrada=horaEntrada;
        this.edad=edad;
        this.sintomatologia=sintomatologia;
        this.preRev[0]=temperatura;
        this.preRev[1]=pulsaciones;
        this.preRev[2]=sistolica;
        this.preRev[3]=diastolica;
        this.fechaAlta=fechaAlta;
        this.horaAlta=horaAlta;
        this.motivoAlta=motivoAlta;
    }    
    //setter y getters
    public int getSip(){
        return this.sip;
    }
    public void setSip(int sip){
        this.sip=sip;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo) {
        this.sexo=sexo;
    }
    public String getFechaEntrada(){
        return this.fechaEntrada;
    }
    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada=fechaEntrada;
    }
    public String getHoraEntrada(){
        return this.horaEntrada;
    }
    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada=horaEntrada;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String getSistomatologia(){
        return this.sintomatologia;
    }
    public void setSintomatologia(String sintomatologia) {
        this.sintomatologia=sintomatologia;
    }
    public double getTemperatura(){
        return this.preRev [0];
    }
    public void setTemperatura(double temperatura){
        this. preRev [0]=temperatura;
    }
    public double getPulsaciones(){
        return this.preRev [1];
    }
    public void setPulsaciones(double pulsaciones){
        this. preRev [1]=pulsaciones;
    }
    public double getSistolica(){
        return this.preRev [2];
    }
    public void setSistolica(double sistolica){
        this. preRev [2]=sistolica;
    }
    public double getDiastolica(){
        return this.preRev [2];
    }
    public void setDiastolica(double diastolica){
        this. preRev [2]=diastolica;
    }
    public String getFechaAlta(){
        return this.fechaAlta;
    }
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta=fechaAlta;
    }
    public String getHoraAlta(){
        return this.horaAlta;
    }
    public void setHoraAlta(String horaAlta) {
        this.horaAlta=horaAlta;
    }
    public String getMotivoAlta(){
        return this.motivoAlta;
    }
    public void setMotivoAlta(String motivoAlta) {
        this.motivoAlta=motivoAlta;
    }

    //toStirng
    public String toString(){
        return "Paciente\nNumero de Sip:\t " + sip+
                          "Nombre y Apellidos"+nombre+
                          "Sexo"+sexo+
                          "Fecha de entrada"+fechaEntrada+
                          "Hora de entrada"+horaEntrada+
                          "Edad"+edad+
                          "Sintomatologias"+sintomatologia+
                          "Temperatura"+preRev[0]+
                          "Pulsaciones"+preRev[1]+
                          "Temperatura Sistolica"+preRev[2]+
                          "Temperatura Diastolica"+preRev[3]+
                          "Fecha del alta"+fechaAlta+
                          "Hora del alta"+horaAlta+
                          "Motivos de alta"+motivoAlta;

    }


}



