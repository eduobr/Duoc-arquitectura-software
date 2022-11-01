/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

public class Facade {
    public boolean fiable(Cliente c){
        if (new Banco().poseeDinero(c) && new Prestamo().esFiable(c) && new Respuesta().res(c)) {
            System.out.println("Credito aprobado");
            return true;
        }else{
            System.out.println("No cumple con los requisitos");
            return false;
        }
    }
}
