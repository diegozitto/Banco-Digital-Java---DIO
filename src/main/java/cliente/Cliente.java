package cliente;

import conta.Conta;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter @Setter
public class Cliente {

    /**
     Todo cliente precisa de um nome e de um token para validação
     */
    protected String nome;
    protected int token = (new Random()).nextInt(999999);

    public Cliente() {


    }


}
