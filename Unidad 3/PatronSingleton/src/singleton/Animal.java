/*
    para que sea singleton debe ser el contructor privado y a traves
    de un atributo debemos instanciar la clase
 */
package singleton;


public class Animal {
    private String nombre;
    private int numPatas;
    private static Animal miAnimal;
    
    private Animal(String nombre, int numPatas) {
        this.nombre = nombre;
        this.numPatas = numPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
    public static Animal getAnimal(String nombre, int numPatas){
        if (miAnimal==null) {
            miAnimal=new Animal(nombre,numPatas);
        }
        return miAnimal;
    }
    
}
