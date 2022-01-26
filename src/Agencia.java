import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Agencia {
    private final int numeroAgencia;
    private final List<Cliente> meusClientes;

    public Agencia(Banco banco){
        this.numeroAgencia = banco.getNumeroAgencia();
        this.meusClientes = new ArrayList<>();
        banco.adicionarAgencia(this);
    }

    public void adicionarCliente(Cliente cliente){
        meusClientes.add(cliente);
    }

    public void removerCliente(Cliente cliente){
        meusClientes.remove(cliente);
    }
}