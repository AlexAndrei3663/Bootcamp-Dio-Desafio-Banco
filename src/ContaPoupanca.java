public class ContaPoupanca  extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void saldoAtual() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirDados();
    }
}
