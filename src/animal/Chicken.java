package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cục tác!";
    }

    @Override
    public String howToEat() {
        return "Mawm mawm";
    }
}
