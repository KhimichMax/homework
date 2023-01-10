public class Dog extends Pet {

    public Dog(String voice, Integer pawsCount) {
        super(voice, pawsCount);
    }

    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }

}
