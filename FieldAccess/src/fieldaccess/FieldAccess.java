/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fieldaccess;


class Super {
public int field = 0;
public int getField() { return field; }
}
class Sub extends Super {
public int field = 1;
public int getField() { return field; }
public int getSuperField() { return super.field; }
}


/**
 *
 * @author PFelegyh
 */
public class FieldAccess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
