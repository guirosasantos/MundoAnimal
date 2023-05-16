package univali.guirosa.java;

public class Cachorro extends AnimalCorre {
    
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String EmitirSom() {
        return "auau";
    }

    @Override
    public String Movimentar() {
        return this.getNome()+" correu 10 metros";
    }
}
