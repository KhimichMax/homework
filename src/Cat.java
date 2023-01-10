public class Cat extends Pet {

    public Cat(String voice, Integer pawsCount) {
        super(voice, pawsCount);
    }

    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }

}
