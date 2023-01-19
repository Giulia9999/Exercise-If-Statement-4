package it.develhope.ifstatement4;

public class Start {
    public static void main(String[] args) {
        Person person = new Person();
        String lifeStage = person.getLifeStage();
        System.out.printf("The person is in the %s stage of life", lifeStage);
    }
}
