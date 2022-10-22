/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermarket;

/**
 *
 * @author hp
 */
public class Supermarket {

   
    public static void main(String[] args) {
        Customer c=new Customer("ahmed",43);
        c.printData();
        Proudct p=new Proudct("gehad","vegetables",4);
        p.printData();
        Employee e=new Employee("mohamed",3,22,"financial");
        e.printData();
        
      
    }
    
}
