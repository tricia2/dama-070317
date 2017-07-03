/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_dama;


public class MyClass1 implements MyInterface {
    @Override
    public void iMethod(){
        System.out.println("Interface method.");
    }
    void myMethod(){
        System.out.println("Another method.");
    }
}
