public class cajaDeAhorro extends Cuentas {

    private Double tasaDeInteres;
    private Double saldoInicial;

    public cajaDeAhorro(Cliente cliente, Double saldoInicial, Double tasaDeInteres) {
        super(cliente);
        this.tasaDeInteres = tasaDeInteres;
        this.saldoInicial = saldoInicial;
    }

    @Override
    public Double extraer(Double retiro) {
        if (saldoInicial >= retiro) {
          saldoInicial -= retiro;
        } else {
           System.out.println("no tenes el dinero suficiente");
        }
        return saldoInicial;


    }
    @Override
    public void depositar (Double deposito) {
        saldoInicial += deposito;
    }

   @Override
    public Double informarSaldo(){
        return saldoInicial;
   }


   public Double cobrarInteres (Double tasaDeInteres){
      return  saldoInicial = ((saldoInicial * tasaDeInteres) / 100);
   }
}