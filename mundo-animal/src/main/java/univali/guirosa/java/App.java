package univali.guirosa.java;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cachorro toto = new Cachorro("totó", 10);
        Cavalo magnus = new Cavalo("magnus", 5);
        Preguica soneca = new Preguica("soneca", 8);

        System.out.println(toto.EmitirSom());
        System.out.println(magnus.EmitirSom());
        System.out.println(soneca.EmitirSom());

        veterinario jorge = new veterinario();

        System.out.println(" ");

        System.out.println(jorge.examinar(toto));
        System.out.println(jorge.examinar(magnus));
        System.out.println(jorge.examinar(soneca));

        Cachorro rex = new Cachorro("rex", 10);
        Cavalo pegasus = new Cavalo("pegasus", 5);
        Preguica dorminhoco = new Preguica("dorminhoco", 8);
        Cachorro belinha = new Cachorro("belinha", 10);
        Cavalo nicki = new Cavalo("nicki", 5);
        Preguica ronco = new Preguica("ronco", 8);
        Cachorro sushi = new Cachorro("sushi", 10);

        Zoologico zoologico = new Zoologico();
        zoologico.prenderAnimal(toto);
        zoologico.prenderAnimal(magnus);
        zoologico.prenderAnimal(soneca);
        zoologico.prenderAnimal(rex);
        zoologico.prenderAnimal(pegasus);
        zoologico.prenderAnimal(dorminhoco);
        zoologico.prenderAnimal(belinha);
        zoologico.prenderAnimal(nicki);
        zoologico.prenderAnimal(ronco);
        zoologico.prenderAnimal(sushi);

        for (int i=0; i<10; i++){
            if (zoologico.jaulas[i] instanceof AnimalCorre)
                System.out.println(((AnimalCorre)zoologico.jaulas[i]).Movimentar());
        }
    }
}
