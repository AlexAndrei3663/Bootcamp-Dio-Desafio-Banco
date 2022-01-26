import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Cliente {
    @Setter private Agencia agencia;
    private final String nome;
    private final String cpf; // Alterar para aceitar pessoa jurídica também
    private final List<Conta> minhasContas;

    public Cliente(String nome, String cpf, Agencia agencia){
        this.agencia = agencia;
        this.nome = nome;
        this.cpf = cpf;
        minhasContas = new ArrayList<>();
        agencia.adicionarCliente(this);
    }

    public void adicionarConta(Conta conta){
        minhasContas.add(conta);
    }

    public double removerConta(Conta conta){
        double saldoResidual = conta.getSaldo();
        minhasContas.remove(conta);
        return saldoResidual;
    }

}