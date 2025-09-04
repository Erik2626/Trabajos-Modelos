/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hechizos;

/**
 *
 * @author Estudiantes
 */
public class Expelliarmus implements Spell{

    @Override
    public String getName() {
   return "Expelliarmus";
    }

    @Override
    public void cast(String caster, String target) {
       System.out.println(caster+"desarma a"+target+"con"+getName()+"el objeto sale volando");
    }
    
}

