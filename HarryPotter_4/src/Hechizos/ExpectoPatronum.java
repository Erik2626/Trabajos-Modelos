/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hechizos;

/**
 *
 * @author Estudiantes
 */
public class ExpectoPatronum implements Spell{

    @Override
    public String getName() {
       return "Expecto Patronum";
    }

    @Override
    public void cast(String caster, String target) {
      System.out.println(caster+"materializa un patronus para proteger a "+(target==null ? "todos":target)+"con"+getName());
    }
    
}

