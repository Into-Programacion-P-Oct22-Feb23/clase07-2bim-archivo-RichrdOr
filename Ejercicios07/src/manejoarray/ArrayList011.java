/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

import java.util.Scanner;
// import java.util.ArrayList;}
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ArrayList011 {

    public static void main(String[] args) {

        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obternerCadenaFinal(arreglo2);
        System.out.printf("%S\n", cadenaFinal);

    }

    public static ArrayList<String> obtenerDatos() {
        ArrayList<String> arreglo2 = new ArrayList<>();
        boolean bandera = true;
        String pais;
        String opcion;
        Scanner entrada = new Scanner(System.in);

        while (bandera) {
            System.out.println("INGRESE EL PAIS");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("INGRESE S PARA SALIR");
            opcion = entrada.nextLine();

            if ("s".equals(opcion)) {
                bandera = false;
            } else {
            }
        }
        return arreglo2;
    }

    public static String obternerCadenaFinal(ArrayList<String> lista) {
        String cadenaFinal = "";
        for (int i = 0; i < lista.size(); i++) {

            cadenaFinal = String.format("%s%s\n", cadenaFinal, lista.get(i));

        }
        return cadenaFinal;

    }
}
