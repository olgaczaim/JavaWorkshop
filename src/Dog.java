public class Dog extends Animal {

    private int eyes;
    private String sound;
    private int legs;
    private int tail;
    private int teeth;

    public Dog(String name, int size, int weight, int eyes, String sound, int legs, int tail, int teeth) {
        super(name, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.sound = sound;
        this.teeth = teeth;
    }

    private void chew(){
        System.out.println("Dog.Chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        //super.eat();
    }
}
