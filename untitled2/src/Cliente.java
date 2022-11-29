public class Cliente {

    private Integer numeroCliente;
    private String apellido;
    private String nombre;
    private Integer dni;
    private String cuit;

    public Cliente(Integer numeroCliente, String apellido, String nombre, Integer dni, String cuit) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.cuit = cuit;
    }

}
