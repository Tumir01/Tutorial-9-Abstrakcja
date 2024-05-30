package zad2;

public class Cat extends Animal implements Moveable{

    public String name;
    public Cat(String name){
        super(name);
    }

    @Override
    public String getType(){
        return "Cat";
    }
    public String getName(){
        return name;
    }

    @Override
    public void start(){
        System.out.println("Cat starts!");

    }

    @Override
    public void stop() {
        System.out.println("Cat stopped");
    }
}
