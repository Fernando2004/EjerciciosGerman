
package com.fernandogarcia.tema08.ejer6;

import java.util.Scanner;

    public class TiendaBicicleta {

//metodos


        /**metodo de consultas */
        public static void consultasBicicleta(int consulta){

            switch(consulta){

                case 1:
                    //consultaReferencia();
                    break;
                case 2:
                    //consultaMarca();
                    break;
                case 3:
                    //consultaModelo();
                    break;
                case 0:
                    System.out.println("Volver al menu principal ");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
//----------------------------------------------------------------------

    }
