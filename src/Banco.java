import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Banco {
    private int numeroAgencia = 1;

    @Setter private String nome;
    private final List<Agencia> minhasAgencias;

    public Banco(String nome){
        this.nome = nome;
        this.minhasAgencias = new ArrayList<>();
    }

    public void adicionarAgencia(Agencia agencia){
        minhasAgencias.add(agencia);
    }

    public void removerAgencia(Agencia agencia){
        minhasAgencias.remove(agencia);
    }

    public int getNumeroAgencia(){
        return numeroAgencia++;
    }
}