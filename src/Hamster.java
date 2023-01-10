public class Hamster extends Pet {

    public Hamster(String voice, Integer pawsCount) {
        super(voice, pawsCount);
    }

    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }

}
