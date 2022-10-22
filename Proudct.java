/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author hp
 */
public class Proudct {
    String name;
    String type;
    int number;
    public Proudct(String name,String type,int number){
        this.name=name;
        this.type=type;
        this.number=number;
    }
    public void printData(){
        System.out.println(name + type + number);
    }
    
}

