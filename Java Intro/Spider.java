public class Spider extends Insect {
    boolean isPoisonous;

    public Spider(int age, boolean isPoisonous) {
        super(age, 8); // super keyword call constructor of insect(superclass, parent class)
        this.isPoisonous = isPoisonous;
    }

    public void says() {
        System.out.println("HISSSS");
    }
}
