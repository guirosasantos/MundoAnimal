package univali.guirosa.java;

public class Preguica extends Animal {
    
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String EmitirSom() {
        return "Zzzz";
    }

    public String SubirArvore() {
       return this.getNome()+" subiu na árvore! ";
    }
}