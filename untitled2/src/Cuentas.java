public abstract class Cuentas {

    private Cliente cliente;
   // private Double saldoInicial;

    public Cuentas(Cliente cliente) {
        this.cliente = cliente;

    }

    public abstract void depositar (Double deposito);

    public abstract Double extraer (Double extraigo);
    public abstract Double informarSaldo();


}
