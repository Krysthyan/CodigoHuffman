/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigohuffman;

import java.util.List;
import java.util.Map;

/**
 *
 * @author krysthyan
 */
public class CodigoHuffman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lector lector = new Lector();
        List<Nodo> lista = lector.frecuenciaSimbolo("src/texto.txt");
        for(Nodo clave: lista){
            System.out.println("clave: " + clave.getClave() + " frecuencia " + clave.getFrecuencia());
        } 
        Arbol arbol = new Arbol(lista);
        Map<String, byte[]> mapaBin = arbol.generarMapaBinario(arbol.getRaiz(), "");
        for(String clave: mapaBin.keySet()){
            System.out.println("clave: " + clave + " frecuencia ");
            for(byte bit: mapaBin.get(clave)){
                System.out.println(bit);
            }
        }
        lector.GenerarArchivoBinario(mapaBin, "src/texto.txt");
        System.out.println(lector.Descomprimir(arbol.getRaiz()));
    }
    
}
