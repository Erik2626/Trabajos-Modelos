/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ducks;


import flyBehavior.FlyBehavior;
import quackBehavior.QuackBehavior;
/**
 *
 * @author Estudiantes
 */
public abstract class Duck {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){}

    public abstract void display();
    public void perfomFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys");
    }

}