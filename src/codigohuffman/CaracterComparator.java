/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigohuffman;

import java.util.Comparator;

/**
 *
 * @author krysthyan
 */
public class CaracterComparator implements Comparator<Nodo> {

    @Override
    public int compare(Nodo o1, Nodo o2) {
        return o1.getFrecuencia().compareTo(o2.getFrecuencia());
    }
    
}
