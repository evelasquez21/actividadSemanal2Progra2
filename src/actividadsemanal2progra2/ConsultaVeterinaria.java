/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadsemanal2progra2;

import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class ConsultaVeterinaria{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Mascota> m1 = new ArrayList<Mascota>();
        Perro Toby = new Perro();
        Gato Rayas = new Gato();
        Conejo Chispas = new Conejo();
        
        m1.add(Toby);
        m1.add(Rayas);
        m1.add(Chispas);
        
        for (Mascota m : m1){
            m.hacerSonido();
            m.descansar();
        }
        
        Chispas.recibirAtencionEspecial();
    }
    
}
