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
      Random r= new Random();
        for (int i = 0; i < 10; i++) {
            Usuario p= new Usuario(r.nextInt(8),randomtext(),randomtext(),randomtext());
            usuarios.add(p);
        }
    }
    
}
