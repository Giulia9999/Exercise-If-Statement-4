package it.develhope.ifstatement4;

public class Person {
    private int age;

    public Person(){
        int min = 5;
        int max = 80;
        int rando = (int) Math.floor(Math.random()*(max-min+1)+min);
        age = rando;
    }

    public String getLifeStage(){
        if(age <= 12){
            return "child";
        }else if(age >= 13 && age <=19){
            return "teen";
        }else if(age >= 20 && age <=59){
            return "adult";
        }else if(age >=60){
            return "senior adult";
        }
        return "Baby";
    }
}
