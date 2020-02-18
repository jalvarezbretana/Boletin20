/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jalvarezbretana
 */
public class Boletin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Libro> libro = new ArrayList();
        int opcion;
        Metodos obx = new Metodos();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***** MENU *****"
                    + "\n1 Engadir Libro"
                    + "\n2 Vender (Borrar) Libro"
                    + "\n3 Amosar Libros"
                    + "\n4 Dar de Baixa"
                    + "\n5 Buscar Libro"
                    + "\n0 Saír"));

            switch (opcion) {
                case 1:
                    libro.add(obx.crearLibro());
                    break;
                case 2:
                    obx.venderLibro(libro);
                    break;
                case 3:
                    obx.amosar(libro);
                    break;
                case 4:
                    obx.darBaixa(libro);
                    break;
                case 5:
                    obx.buscarLibro(libro);
                    break;

            }

        } while (opcion != 0);
    }
}
