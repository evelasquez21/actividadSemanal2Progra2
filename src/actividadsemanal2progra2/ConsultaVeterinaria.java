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
        // Declaración de lista
        ArrayList<Mascota> m1 = new ArrayList<Mascota>();
        
        // Instancia de clases
        Perro Toby = new Perro();
        Gato Rayas = new Gato();
        Conejo Chispas = new Conejo();
        
        // Asignación de clases a la lista
        m1.add(Toby);
        m1.add(Rayas);
        m1.add(Chispas);
        
        // Reccorido de la lista
        for (Mascota m : m1){
            // Invocación de métodos
            m.hacerSonido();
            m.descansar();
            
            // Uso de intanceof para controlar el manejo de las clases y sus métodos
            if (m instanceof Conejo){
                ((Conejo) m).recibirAtencionEspecial();
            } else if(m instanceof Perro){
            ((Perro) m).vacunar();
            } else {
                System.out.println("La mascota no puede vacunarse");
            } 
        }
    }
    
}
