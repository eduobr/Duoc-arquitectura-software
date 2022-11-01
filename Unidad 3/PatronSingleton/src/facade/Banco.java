/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

public class Banco {
    public boolean poseeDinero(Cliente c){
        System.out.println("El Cliente"+c.getNombre()+"tiene 2.000.000 en la cuenta");
        return true;
    }
}
