public abstract class Pet {

    private String voice;
    private Integer pawsCount;

    public Pet(String voice, Integer pawsCount) {
        this.voice = voice;
        this.pawsCount = pawsCount;
    }

    public void giveVoice() {
        System.out.println(this.voice);
    }

    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }

    public String getVoice() {
        return this.voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public Integer getPawsCount() {
        return this.pawsCount;
    }

}