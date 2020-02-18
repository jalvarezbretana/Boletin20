/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author jalvarezbretana
 */
public class Metodos {

    public Libro crearLibro() {

        Libro x = new Libro(PedirDatos.pedirString(), PedirDatos.pedirString(), PedirDatos.pedirString(), PedirDatos.pedirFloat(), PedirDatos.pedirInt());
        return x;
    }

    public void venderLibro(ArrayList<Libro> lista) {
        if (lista.isEmpty()) {
            throw new NullPointerException("El ArrayList está vacío");
        } else {
        }
        String codigo = JOptionPane.showInputDialog("Introduce o código(IBSN) do libro vendido: ");
        for (int i = 0; i < lista.size(); i++) {
            if (codigo.equals(lista.get(i).ISBN)) {
                lista.get(i).unidades--;
            }
        }
    }

    public void amosar(ArrayList<Libro> lista) {
        if (lista.isEmpty()) {
            throw new NullPointerException("El ArrayList está vacío");
        } else {
        }
        Collections.sort(lista);
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

    public void darBaixa(ArrayList<Libro> lista) {
        if (lista.isEmpty()) {
            throw new NullPointerException("El ArrayList está vacío");
        } else {
        }
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).unidades == 0) {
                lista.remove(lista.get(i));
            }
        }
    }

    public void buscarLibro(ArrayList<Libro> lista) {
        if (lista.isEmpty()) {
            throw new NullPointerException("El ArrayList está vacío");
        } else {
            String codigo = JOptionPane.showInputDialog("Introduce o código do libro(IBSN): ");
            for (Libro x : lista) {
                if (codigo.equals(x.ISBN)) {
                    System.out.println("Ese ISBN corresponde a " + x.titulo + " do autor " + x.autor
                            + ", o seu prezo é " + x.prezo + "€"
                            + " e hai " + x.unidades + " unidades");
                }
            }
        }

    }
}
