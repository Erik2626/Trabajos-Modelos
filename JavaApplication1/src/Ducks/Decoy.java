/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ducks;


import flyBehavior.FlyNoWay;

import quackBehavior.Squeak;

/**
 *
 * @author Estudiantes
 */
public class Decoy extends Duck{
    public Decoy(){
    flyBehavior = new FlyNoWay();
    quackBehavior = new Squeak();
    }
   
    public void display() {
        System.out.println("soy decoy");
    }
    
}
