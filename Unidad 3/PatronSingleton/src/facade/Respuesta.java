/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

public class Respuesta {
    public boolean res(Cliente c){
        System.out.println("Felicitaciones Sr(a) "+c.getNombre()+" Su credito de 8.000.0000 "+" Ha sido otorgado");
        return true;
    }
}
