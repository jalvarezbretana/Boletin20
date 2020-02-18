/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import java.util.Scanner;

/**
 *
 * @author jalvarezbretana
 */
public class PedirDatos {

    public static int pedirInt() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Introduce o número unidades");
        a = sc.nextInt();
        return a;
    }

    public static float pedirFloat() {
        Scanner sc = new Scanner(System.in);
        float b;
        System.out.println("Introduce o prezo");
        b = sc.nextFloat();
        return b;
    }

    public static String pedirString() {
        Scanner sc = new Scanner(System.in);
        String c;
        System.out.println("Introduce titulo, autor e ISBM");
        c = sc.nextLine();
        return c;
    }

}
