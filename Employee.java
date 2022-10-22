/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author hp
 */
public class Employee {
    String name;
    int id;
    int age;
    String departement;
    
    public Employee(String name,int id,int age,String departement){
        this.age=age;
        this.id=id;
        this.name=name;
        this.departement=departement;
    }
    public void printData(){
        System.out.println(name + id + age + departement);
    }
    
}
