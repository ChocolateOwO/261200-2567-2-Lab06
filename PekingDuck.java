public class PekingDuck extends Duck {
    PekingDuck(String name){
        super(name);
    }

    @Override
    void clean(Animal animal){
        System.out.println("I'm batman !!");
    }
    
}
