/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colecao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author i03
 */
public class TestaPerformance {
    public static void main(String[] args){
        
        System.out.println("Iniciando");
        
        long inicio=System.currentTimeMillis();
        
        //Collection<Integer> teste= new ArrayList<Integer>();
        Collection<Integer> teste= new HashSet<Integer>();
        
        int total=30000;
        
        for(int i=0; i < total; i++){
            teste.contains(i);
        }
        
        long fim= System.currentTimeMillis();
        
        long tempo= fim - inicio;
        
        System.out.println("Tempo gasto:"+tempo);
    }
}
