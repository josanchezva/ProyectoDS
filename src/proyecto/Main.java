/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.*;
import java.math.*;
import java.security.*;
/**
 *
 * @author ASUS
 */
public class Main {

    public static String randomtext(){
        SecureRandom random= new SecureRandom();
        String txt= new BigInteger(130, random).toString();
        return txt;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArrayList<Usuario> usuarios= new MyArrayList<>();
        MyArrayList<medicamento> medicamentos= new MyArrayList<>();
        
        Random r= new Random();
        long startTime = System.currentTimeMillis();
        //este ciclo evalua la creacion de usuarios
          /*for (int i = 0; i < 1000000; i++) {
              int j=0;
              j++;
              Usuario p= new Usuario(j,"Hola","Hola","Hola");
              usuarios.add(p);
          }*/
        //este ciclo evalua la creacion de medicamentos
          for (int i = 0; i < 10000; i++) {
              int j=0;
              j++;
              medicamento p= new medicamento("hola",5,3,3);
              medicamentos.add(p);
          }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }
}
