public class Duck extends Animal implements Flyable{
    String name;
    public Duck(String name){
        this.name = name;
    }
    public String toString(){
        return "เป็ด: " + this.name; 
    }
    @Override
    void sound(){
        System.out.println("Quack");
    }

    @Override
    public void fly(){
        System.err.println("prubb");
    }
    
    @Override
    public void glide(){
        System.err.println("hyyaaa");
    }

    void clean(Animal animal){
        System.err.println(this.toString() + " is cleaning " + animal);
    }
    
    
}
