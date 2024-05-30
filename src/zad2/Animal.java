package zad2;

public abstract class Animal {
    protected String name;
    abstract String getType();
    String getName(){
        return name;
    }

    public Animal(String name){
        this.name = name;
    }


}
