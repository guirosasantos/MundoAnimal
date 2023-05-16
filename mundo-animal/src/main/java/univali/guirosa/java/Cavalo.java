package univali.guirosa.java;

public class Cavalo extends AnimalCorre {
    
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String EmitirSom() {
        return "rilinchin";
    }

    @Override
    public String Movimentar() {
        return this.getNome()+" correu 100 metros! ";
    }
}