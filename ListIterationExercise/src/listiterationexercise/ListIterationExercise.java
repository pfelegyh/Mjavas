/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listiterationexercise;

import java.util.*;



/**
 *
 * @author PFelegyh
 */
public class ListIterationExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    List<Integer> myl1 = new ArrayList<Integer>(8);
    List<Integer> myl2 = new ArrayList<Integer>(8);
    
    int i=0;
    while(i<=10){
    
    myl1.add(i);
    myl2.add(i);
    i++;
    }
    
    //ListIterator<Integer> it1 = myl1.listIterator();
    ListIterator<Integer> it2 = myl2.listIterator(myl2.size());
    
    
    
    
    System.out.println("My First List: " + myl1);
    System.out.println("My Second List: " + myl2);
    
    
    while(it2.hasPrevious()){
    
    //System.out.println(it2.previous());
    
    myl1.add(it2.previous());
    
    }
    
    
    
     System.out.println("My First List after addition: " + myl1);
    
    
    }
    
}


