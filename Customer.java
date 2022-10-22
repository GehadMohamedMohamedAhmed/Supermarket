/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author hp
 */
public class Customer {
    String name;
    int  age;
    public Customer(String name,int age){
        this.age=age;
        this.name=name;
        
    }
    public void printData(){
        System.out.println(age + name);
    }
    
}
