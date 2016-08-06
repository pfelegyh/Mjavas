/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upcast;

class Cycle {

Cycle(){

System.out.println("Cycle Constructor");
}

static void ride(Cycle x){
  
  System.out.println("I want to ride my Cycle");
  
}

}


class UniCycle extends Cycle{

public UniCycle(){

System.out.println("Unicycle constructor");

}

public void rideUni(){

System.out.println("Riding a Unicycle");

}

}

class BiCycle extends Cycle{

public BiCycle(){

System.out.println("Bicycle constructor");

}

public void rideBi(){

System.out.println("Riding a Bicycle");
}

}


/**
 *
 * @author Peter
 */
public class Upcast {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
  
  UniCycle x = new UniCycle();
  BiCycle y = new BiCycle();
  
  
  Cycle.ride(x);
  Cycle.ride(y);
  
  
  
  }
  
}
