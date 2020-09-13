/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author carloaiza
 */
public class ListaSE {

    private Nodo cabeza;
    private Nodo cabezaOriginal;
    //private String generoWeb = "hembra";

    public ListaSE() {
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    @Override
    public String toString() {
        return "cabeza=" + cabeza;
    }

    /**
     * Método para adicionar un nodo
     *
     * - Si tiene perros llamar a un ayudante recorrer todos los perros ,
     * mirando si tienen otro ammarrado cuando llegue al perro libre (No
     * ammarrado a otro) amarra el nuevo perro
     *
     * si no tiene perros El perro entrante Es la cabeza
     */
    public void adicionarNodo(Perro dato) {
        if (cabeza == null) {
            //No tiene perros
            cabeza = new Nodo(dato);
        } else {
            // tiene perros
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            //Ubicado o parado en el último
            temp.setSiguiente(new Nodo(dato));
        }
        cabezaOriginal = cabeza;    //Guardo la lista original en una variable global para llamarla cuando quiera todo como al inicio
    }

    public void adicionarNodoAlInicio(Perro perro) {

        if (cabeza != null) {

            Nodo temp = new Nodo(perro);
            temp.setSiguiente(cabeza);
            cabeza = temp;
        } else {
            cabeza = new Nodo(perro);
        }
    }

    public void invertirLista() {

        if (cabeza != null) {
            ListaSE listaTemporal = new ListaSE();  //creo lista temporal para guardar datos
            Nodo temp = cabeza;

            while (temp != null) {
                listaTemporal.adicionarNodoAlInicio(temp.getDato());
                temp = temp.getSiguiente();
            }
            //Ubicado o parado en el último
            cabeza = listaTemporal.getCabeza();
            //JOptionPane.showMessageDialog(null, cabeza.getDato().getNombre());
        }

    }

    public void eliminarNodo(Perro perro) {

        Nodo temp = cabeza;
        Nodo temp2;

        if (cabeza.getDato().getNumero() == perro.getNumero()) {

            cabeza = cabeza.getSiguiente();
        }
        while (temp.getSiguiente() != null) {

            temp2 = temp;       //Guardo el anterior
            temp = temp.getSiguiente();

            if (perro.getNumero() == temp.getDato().getNumero()) {

                temp2.setSiguiente(temp.getSiguiente());
                temp = temp2;
            }
        }
        //mostrarListadoPerros();
    }

    //Metodo Mio***********************************************************************************
//    public void invertirExtremos() {
//    //    try {
//            Nodo tempInicial = null;
//            Nodo tempFinal = new Nodo(cabeza.getDato());
//
//            Nodo temp = cabeza;
//
//            while (temp.getSiguiente() != null) {
//
//                if (temp.getSiguiente().getSiguiente() == null) {
//
//                    tempInicial = temp.getSiguiente();  //maya
//                    tempInicial.setSiguiente(cabeza.getSiguiente());//siguiente maya firulais
//                    cabeza = tempInicial;
//                    temp.setSiguiente(tempFinal);
//
//                }
//                
//                temp = temp.getSiguiente();
//            }
//
//            mostrarListadoPerros();
////        } catch (Exception e) {
////        }
//    }
    //********************************************************Metodo profe
    public void intercambiarExtremos() {
        if (cabeza != null) {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();

            }
            Perro perroTemp = cabeza.getDato();
            cabeza.setDato(temp.getDato());
            temp.setDato(perroTemp);
            // mostrarListadoPerros();

        }

    }

    public void ordenarGenero(String generoWeb) {

            if (cabeza != null) {

                ListaSE listaTemporal = new ListaSE();

                for (int i = 0; i <= 1; i++) {
                    Nodo temp = cabeza;
                    while (temp != null) {

                        if (temp.getDato().getGenero().equals(generoWeb)) {
                            listaTemporal.adicionarNodo(temp.getDato());//                                         
                        }
                        temp = temp.getSiguiente();
                    }

                    if (generoWeb.equals("macho")) {
                        generoWeb = "hembra";
                    } else {
                        generoWeb = "macho";
                    }

                }

                cabeza = listaTemporal.getCabeza();
//         mostrarListadoPerros();
//        System.out.println("lista desosrdenada: ");
//        cabeza = cabezaOriginal;
//         mostrarListadoPerros();
            }
//        }

    }

    public void mostrarListadoPerros() {

        Nodo temp1 = cabeza;
        while (temp1.getSiguiente() != null) {
            System.out.println(temp1.getDato().getNombre());
            temp1 = temp1.getSiguiente();
        }
        System.out.println(temp1.getDato().getNombre());    //Muestra el ultimo perro

    }

}
