/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ducks;

import flyBehavior.FlyWithWings;
import quackBehavior.Quack;


/**
 *
 * @author Estudiantes
 */
public class Rubber extends Duck{
    
    public Rubber(){
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
    }
  
    public void display() {
      
    }
    
}
