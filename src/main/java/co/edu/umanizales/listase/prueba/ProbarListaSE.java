/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.prueba;

import co.edu.umanizales.listase.modelo.ListaSE;
import co.edu.umanizales.listase.modelo.Perro;
import javax.swing.JOptionPane;

/**
 *
 * @author carloaiza
 */
public class ProbarListaSE {

    public static void main(String... args) {
        //Instanciar una lista se
        ListaSE listaPerros = new ListaSE();

        Perro jeremias = new Perro("jeremias", (byte) 18, (byte) 6, "macho");
        listaPerros.adicionarNodo(jeremias);

        Perro lulu = new Perro("Lulú", (byte) 1, (byte) 9, "hembra");
        listaPerros.adicionarNodo(lulu);

        Perro firulais = new Perro("Firulais", (byte) 2, (byte) 4, "macho");
        listaPerros.adicionarNodo(firulais);

        Perro pastor = new Perro("Tobby", (byte) 3, (byte) 6, "macho");
        listaPerros.adicionarNodo(pastor);

        Perro martin = new Perro("martin", (byte) 4, (byte) 6, "macho");
        listaPerros.adicionarNodo(martin);

        Perro jaime = new Perro("jaime", (byte) 5, (byte) 6, "macho");
        listaPerros.adicionarNodo(jaime);

        Perro cain = new Perro("cain", (byte) 6, (byte) 6, "macho");
        listaPerros.adicionarNodo(cain);

        Perro tito = new Perro("tito", (byte) 7, (byte) 6, "macho");
        listaPerros.adicionarNodo(tito);

        Perro maya = new Perro("maya", (byte) 8, (byte) 6, "hembra");
        listaPerros.adicionarNodo(maya);

        Perro dohko = new Perro("dohko", (byte) 13, (byte) 6, "macho");
        listaPerros.adicionarNodo(dohko);

        Perro elias = new Perro("luciana", (byte) 33, (byte) 6, "hembra");
        listaPerros.adicionarNodo(elias);

//        listaPerros.adicionarNodoAlInicio(new Perro("MOrgan",(byte)5,(byte)5));
        // listaPerros.invertirExtremos();
        
//***************************Ejemplo Eliminar Nodo***************************************
//        listaPerros.mostrarListadoPerros();
//        System.out.println("la lista con el perro eliminado es");
//        listaPerros.eliminarNodo(new Perro("maya", (byte) 8, (byte) 6));
//        
//***************************************************Ejemplo listsa de perrod invertir Extremos************
//        listaPerros.mostrarListadoPerros();
//        System.out.println("la lista invertida en sus extremos es:");
//        listaPerros.invertirExtremos();

//        listaPerros.mostrarListadoPerros();
//        System.out.println("la lista invertida en sus extremos con el metodo de loaiza es:");
//        listaPerros.intercambiarExtremos();

//****************************************Ordenar Genero**************************
        listaPerros.ordenarGenero("macho");


    }
}
