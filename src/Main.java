public class Main {
    public static void main(String[] args) {
        Banco meuBanco = new Banco("DioBank");
        Agencia minhaAgencia = new Agencia(meuBanco);
        Cliente primeiroCliente = new Cliente("Alex", "12345678910", minhaAgencia);

        System.out.println("=+=+=+=+ " + meuBanco.getNome() + " +=+=+=+=");

        Conta contaCorrente = new ContaCorrente(primeiroCliente);
        Conta contaPoupanca = new ContaPoupanca(primeiroCliente);

        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);
        contaCorrente.sacar(50);

        contaCorrente.saldoAtual();
        contaPoupanca.saldoAtual();

    }
}
