package com.company;

public class Cat implements AvaregeLevael{
    private String name;
    private int age;
    private int health;
    private int mood;
    private int satiety;
    private int averageLevel;
    int number;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getAverageLevel() {
        return averageLevel;
    }

    public int getNumber() {
        return number;
    }


    public Cat(int number, String name, int age, int health, int mood, int satiety) {
        this.number=number;
        this.name = name;
        this.age = age;
        this.health = health;
        this.mood = mood;
        this.satiety = satiety;
        this.averageLevel = (this.satiety+this.mood+this.mood)/3;
    }

    public static int sortByAverage(Cat one, Cat two){
   return two.getAverageLevel()-one.getAverageLevel();
    }

    @Override
    public int averageLevel() {
        int x =(getSatiety()+getMood()+getHealth())/3;
        return x;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", mood=" + mood +
                ", satiety=" + satiety +
                ", averageLevel=" + averageLevel +
                ", number=" + number +
                '}';
    }
}
