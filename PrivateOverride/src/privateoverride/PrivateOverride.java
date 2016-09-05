/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateoverride;


public class PrivateOverride {
private void f() { System.out.println("private f()"); }
public static void main(String[] args) {
PrivateOverride po = new Derived();
po.f();

}



/**
 *
 * @author PFelegyh
 */


    /**
     * @param args the command line arguments
     */
  
    
}
class Derived extends PrivateOverride {
public void f() { System.out.println("public f()"); }


} 