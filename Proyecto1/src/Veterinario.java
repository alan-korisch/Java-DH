public class Veterinario {

    private String nombre;
    private String apellido;
    private Double costo;

    public Veterinario (String nombre, String apellido, Double precio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.costo = precio;
    }

    public void atenderPerro (Perro perro){
        System.out.println("Hola soy " + nombre + " y mi apellido es " + apellido + " y mi perro es " + perro.getApodo());
    }


}
