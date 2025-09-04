/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mago;

import Hechizos.Spell;

/**
 *
 * @author Estudiantes
 */
public abstract class Persona {
    private String name;
    private Spell spell;
    protected Persona(String name, Spell iniatialSpell){
    this.name=name;
    this.spell=iniatialSpell;
    }
    public String getName(){
    return name;
    }
    public void setSpell(Spell spell){
    if(spell ==null) throw new IllegalArgumentException("El hechizo no puede ser null");
    this.spell = spell;
    System.out.println(name+"ahora es habil en"+ spell.getName());
    }
    public void perfomrSpell(String target){
    if(spell==null){
    System.out.println(name+"no tiene hechizo");
    return;
    }
    spell.cast(name, target);
    }
}
