/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hechizos;

/**
 *
 * @author Estudiantes
 */
public class OculusReparo implements Spell{

    @Override
    public String getName() {
       return "Oculus Reparo";
    }

    @Override
    public void cast(String caster, String target) {
       System.out.println(caster + "repara los anteojos de"+target+"con"+getName());
    }
    
}

