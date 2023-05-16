package univali.guirosa.java;

public class AnimalCorre extends Animal{
    public AnimalCorre (String nome, int idade) {
        super(nome, idade);
    }

    public String Movimentar() {
        return this.getNome()+" correu 10 metros";
    }
}
