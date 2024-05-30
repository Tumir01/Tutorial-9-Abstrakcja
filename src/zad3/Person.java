package zad3;

public abstract class Person {
    public String firstName;
    public String lastName;
    public int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear){
        this.birthdayYear = birthdayYear;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(){
        return 2024-birthdayYear;
    }

}
