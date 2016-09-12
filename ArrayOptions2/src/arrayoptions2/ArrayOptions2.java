/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayoptions2;

import java.util.*;

class Book{

List<Book> totalbooks = new ArrayList<Book>();

String Title;
String Author;
int genre;

Book(){

totalbooks.add(this);

}

Book(String title){

this.Title = title;
totalbooks.add(this);
}


}


/**
 *
 * @author PFelegyh
 */
public class ArrayOptions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
