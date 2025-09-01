/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ducks;

import flyBehavior.FlyRocketPowered;
import quackBehavior.Mute;

/**
 *
 * @author Estudiantes
 */
public class DuckRocketPowered extends Duck{
    public DuckRocketPowered(){
    flyBehavior = new FlyRocketPowered();
    quackBehavior = new Mute();
    }
    @Override
    public void display() {
        
    }

   
    
}
