import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Conta implements InterfaceConta {
    private static int SEQUENCIAL_CONTA = 1;

    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numeroConta = SEQUENCIAL_CONTA++;
        this.cliente = cliente;
        this.saldo = 0;
        cliente.adicionarConta(this);
    }

    @Override
    public void sacar(double valor) {
        try{
            if (saldo<valor)
                throw new Exception("!!!!!  Saldo insuficiente  !!!!!!");
            saldo -= valor;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, InterfaceConta contaDestino)  {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirDados() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.cliente.getAgencia().getNumeroAgencia());
        System.out.printf("Numero: %d%n", this.numeroConta);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

}