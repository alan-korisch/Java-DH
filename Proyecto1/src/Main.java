public class Main {
    public static void main(String[] args) {

      Perro perro = new Perro("Limon");
      Perro otroPerro = new Perro ("Frisket");

      Veterinario veterinario = new Veterinario ("Alan", "Korisch", 600.0);

      perro.ladrar();
      perro.getApodo();
      veterinario.atenderPerro(perro);
    }
}