/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hechizos;

/**
 *
 * @author Estudiantes
 */
public class WingardiumLeviosa implements Spell{

    @Override
    public String getName() {
       return "Wingardium Leviosa";
    }

    @Override
    public void cast(String caster, String target) {
       System.out.println(caster+""levita"+(target==null ? "un objeto":target)+"con"+ getName());
    }
    
}

