package com.fernandogarcia.tema08.arraysPila.PilasInt;

import java.util.*;


public class PilaInt{

    /*Las pilas tienen 
        los siguientes constructores
        1.el constructor vacio
        2.el push
        3.El pop
        4.El size
        5.El top
        6.el Empty */

    private int [] pila;
    private int tamanyo;
    private int puntero;
    

    //constructores
    /**creamos la pila con un tamaño maximo */
    public PilaInt (){
        this.pila=new int[4];
        this.puntero=0;
    }
    /**Metemos los datos en la pila */
    public void push(int num){
        
        if(puntero<this.pila.length){
            this.pila[this.puntero]=num;
            this.puntero++;
        }else{
            int [] pilaAux=new int[this.pila.length+2];
            
            for(int i=0;i<this.pila.length;i++){
                pilaAux[i]=this.pila[i];
        }
            this.pila=pilaAux;
            this.pila[puntero]=num;
            this.puntero++;
        } 
    }
    /**Sacamos datos de la pila */
    public int pop(){
        int temporal=-1;
        if(puntero>-1){
            temporal=this.pila[puntero-1];
            this.pila[puntero-1]=-1;
            puntero--;
        }
        return temporal;
    }
   /**Nos dice el tamaño de la pila */
    public int size(){
        return this.puntero;
    }
    /**Nos dice la posicion de la pila */
    public int peek(){
        if(puntero>0){
            return this.pila[puntero-1];
        }else{
            return -1;
        }
    }
    /**Cuando este vacia retornara un true */
    public boolean empty(){
        if(tamanyo==-1){
            return true;
        }else{
            return false;
        }
    }

   
    

       






}