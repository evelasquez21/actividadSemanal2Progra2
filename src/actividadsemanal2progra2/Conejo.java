/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadsemanal2progra2;

/**
 *
 * @author eduar
 */
public class Conejo extends Mascota implements AtencionEspecial{
    @Override
    public void hacerSonido(){
        System.out.println("Chillido");
    }

    @Override
    public void recibirAtencionEspecial() {
        System.out.println("Esta recibiendo atención especial");
    }
}
