
public class Main {

    public static void main(String args[]){

        Cliente cliente = new Cliente(100, "Nocetti", "Aisha", 36587133, "2036987420");
        Cuentas cuentas = new cajaDeAhorro (cliente, 20.0, 20.0);

        cuentas.depositar(100.0);
        System.out.println(cuentas.extraer(500000.0));
        System.out.println(cuentas.informarSaldo());
    }


}