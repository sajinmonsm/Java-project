package in.orangecounty.sajin;

/**
 * Created by sajin on 06/02/17.
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.eat();
        a = new Cat();
        a.eat();
        a = new Lion();
        a.eat();
    }
}