public class Main {
    public static void main(String[] args) {
        Cow wagyu = new Cow();
        Duck donald = new Duck("โดนัล");
        Duck daisy = new Duck("เดซี่");
        Pig burin = new Pig();
        // burin.sound();
        // donald.sound();
        // wagyu.sound();
        donald.clean(wagyu);
        daisy.clean(donald);
        PekingDuck fourseasns = new PekingDuck("4ss");
        fourseasns.clean(daisy);
        fourseasns.fly();

        donald.clean(new Cow());
        donald.clean(new Cow());
        donald.clean(new Cow());
        donald.clean(new Cow());
        

     
    }
}