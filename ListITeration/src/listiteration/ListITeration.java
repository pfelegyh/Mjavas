/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listiteration;
import typeinfo.pets.*;
import java.util.*;


/**
 *
 * @author PFelegyh
 */
public class ListITeration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    List<Pet> pets = Pets.arrayList(8);
ListIterator<Pet> it = pets.listIterator();
while(it.hasNext())
System.out.print(it.next() + ", " + it.nextIndex() +
", " + it.previousIndex() + "; ");
System.out.println();
// Backwards:
while(it.hasPrevious())
System.out.print(it.previous().id() + " ");
System.out.println();
System.out.println(pets);
it = pets.listIterator(3);
while(it.hasNext()) {
it.next();
it.set(Pets.randomPet());
}
System.out.println(pets);
    
    
    
    }
    
}
