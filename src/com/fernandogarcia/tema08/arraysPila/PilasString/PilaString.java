package com.fernandogarcia.tema08.arraysPila.PilasString;

import java.util.*;


public class PilaString{

    /*Las pilas tienen 
        los siguientes constructores
        1.el constructor vacio
        2.el push
        3.El pop
        4.El size
        5.El top
        6.el Empty */

    private String [] palabra;
    private int tamanyo;
    private int puntero;
    

    //constructores
    /**creamos la pila con un tamaño dinamico iremos aumentandolo */
    public PilaString (){
        this.palabra=new String [2];
        this.puntero=0;
    }
    
    /**Metemos los datos en la pila */
    public void push(String palabra){
        
        if(puntero<this.palabra.length){
            this.palabra[this.puntero]=palabra;
            this.puntero++;
        }else{
            //Aumento la pila dinamicamente de dos en dos
            String temporal[]=new String[this.palabra.length+2];
            for(int i=0;i<this.palabra.length;i++){
                temporal[i]=this.palabra[i];
            }
            this.palabra=temporal;
            this.palabra[puntero]=palabra;
            this.puntero++;
        }
    }

    public String pop(){
        String temporal=null;
        if(puntero>0){
            temporal=this.palabra[puntero-1];
            this.palabra[puntero-1]=null;
            puntero--;
        }
        return temporal;
    }
   /**Nos dice los elementos de la pila */
    public int size(){
        return this.puntero;
    }


    /**retorna el puntero vacio */
    public String peek(){
        if(puntero>0){
            return this.palabra[puntero-1];
        }else{
            return null;
        }
    }

    /**Cuando este vacia retornara un true */
    public boolean empty(){
        if(tamanyo!=0){
            return true;
        }else{
            return false;
        }
    }
    public void mainPilaString() {

        PilaString pila = new PilaString();

        pila.push("1");
        pila.push("2");
        pila.push("3");
        pila.push("4");
        pila.push("jueves");
        //Aumento la pila dinamicamente de dos en dos
        pila.push("6");
        pila.push("7");
        pila.push("8");


        //miro el contenido de la pila
        System.out.println("Contenido total de la pila");
        System.out.println(pila.size());
        System.out.println("Me informa del contenido en la pila");
        System.out.println(pila.peek());
        System.out.println("Me informa si la pila esta vacia");
        System.out.println(pila.empty());

        System.out.println("Sacamos de dentro de la pila");
        System.out.println(pila.pop());
        System.out.println("Contenido total de la pila");
        System.out.println(pila.size());

        System.out.println("Sacamos de dentro de la pila");
        System.out.println(pila.pop());
        System.out.println("Sacamos de dentro de la pila");
        System.out.println(pila.pop());
        System.out.println("Contenido total de la pila");
        System.out.println(pila.size());
        System.out.println("Me informa del contenido en la pila");
        System.out.println(pila.peek());

        System.out.println("Sacamos de dentro de la pila");
        System.out.println(pila.pop());
        System.out.println("Sacamos de dentro de la pila");
        System.out.println(pila.pop());
        System.out.println("Sacamos de dentro de la pila");
        System.out.println(pila.pop());
        System.out.println("Sacamos de dentro de la pila");
        System.out.println(pila.pop());
        System.out.println("Sacamos de dentro de la pila");
        System.out.println(pila.pop());

        System.out.println("Contenido total de la pila");
        System.out.println(pila.size());
        System.out.println("Me informa del contenido en la pila");
        System.out.println(pila.peek());

        pila.push("verano");
        System.out.println("Contenido total de la pila");
        System.out.println(pila.size());
        System.out.println("Me informa del contenido en la pila");
        System.out.println(pila.peek());
        pila.push("9");
        pila.push("10");
        System.out.println("Contenido total de la pila");
        System.out.println(pila.size());
    }




}