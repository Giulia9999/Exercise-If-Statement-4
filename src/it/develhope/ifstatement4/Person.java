package it.develhope.ifstatement4;

public class Person {
    private int age;

    public Person(){
        int min = 5;
        int max = 80;
        int rando = (int) Math.floor(Math.random()*(max-min+1)+min);
        age = rando;
    }
}
