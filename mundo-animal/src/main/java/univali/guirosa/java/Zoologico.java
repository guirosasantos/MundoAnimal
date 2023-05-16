package univali.guirosa.java;

public class Zoologico {
    public Animal []jaulas = new Animal[10];
    public int numAnimaisPresos = 0;

    public Zoologico() {
    }

    public void prenderAnimal(Animal animal){
        if (numAnimaisPresos <=10){
            jaulas[numAnimaisPresos] = animal;
            numAnimaisPresos++;
        }
        else {
            System.out.println("todas as jaulas estão ocupadas");
        }
    }
}
