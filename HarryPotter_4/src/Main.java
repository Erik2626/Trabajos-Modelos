
import Mago.HarryPotter;
import Mago.HermioneGranger;
import Mago.Persona;
import Mago.RonWeasley;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class Main {
    public static void main(String[] arg){
    Persona harry =new HarryPotter;
    Persona ron = new RonWeasley;
    Persona hermione = new HermioneGranger;

        harry.performSpell("Harry")
        ron.performSpell("un oponente");
        hermione.performSpell("un libro");
        System.out.println("cambio de comportamiento");

        hermione.setSpell(new OculusReparo());
        hermione.performSpell("Harry")

        hermione.setSpell(new WingardiumLeviosa());
        hermione.performSpell("pluma");

        ron.setSpell(new WingardiumLeviosa());
        ron.perfomrSpell("varias cajas");
    }
}

