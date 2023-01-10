public class Practicum {

    public static void main(String[] args) {
        Cat cat = new Cat("м€у", 4);
        cat.catchMouse();
        cat.giveVoice();
        System.out.println(cat.getPawsCount());

        Dog dog = new Dog("a", 4);
        dog.bringStick();
        dog.play();
        dog.giveVoice();
        System.out.println(dog.getPawsCount());

        Hamster hamster = new Hamster("b", 4);
        hamster.hideFood();
        hamster.sleep();
        hamster.giveVoice();
        System.out.println(hamster.getPawsCount());

        Fish fish = new Fish("c", 0);
        fish.sleep();
        fish.giveVoice();
        System.out.println(fish.getPawsCount());

        Spider spider = new Spider("d", 6);
        spider.giveVoice();
        System.out.println("” паука " + spider.getPawsCount() + " лапок.");
    }

}