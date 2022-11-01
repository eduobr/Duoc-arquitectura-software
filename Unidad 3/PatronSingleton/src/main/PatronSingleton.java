/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import facade.*;
import singleton.Animal;

public class PatronSingleton {

    public static void main(String[] args) {
        //Singleton
        Animal a = Animal.getAnimal("Perrito",4);
        System.out.println("El animal es: "+a.getNombre());
        
        //Facade
        System.out.println(new Facade().fiable(new Cliente("Israel Naranjo")));
    }
    
}
