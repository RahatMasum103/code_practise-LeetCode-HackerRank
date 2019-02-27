/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankcode;

/**
 *
 * @author APU
 */

abstract class Base{
    int a = 45;
    abstract int getA();
}

class Derived extends Base{

    int getA()
    {
        //int a = 50;
        return a;
    }

}
public class AbstractClass {
    public static void main(String args[]) {  

       System.out.println("Package main");
       Derived Der = new Derived();
       int num = Der.getA();
       System.out.println("In derived "+num);
    } 
}
