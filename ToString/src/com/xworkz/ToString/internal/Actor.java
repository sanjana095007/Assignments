package com.xworkz.ToString.internal;

public class Actor {
    private String name;
    private int age;
    private int filmCount;

    public Actor(String name, int age, int filmCount) {
        this.name = name;
        this.age = age;
        this.filmCount = filmCount;
    }

    @Override
    public String toString() {
        return "Actor name: " + name + ", Age: " + age + ", Films: " + filmCount;
    }
    @Override
    public int hashCode() {
        return 100;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj!=null){
            System.out.println("null reference");
            if(obj instanceof  Actor){
                System.out.println("reference of Actor ,will be compared");
                Actor actor=this;
                Actor actor1=(Actor)obj;
                if(actor.name.equals(actor.name) && actor.age==actor1.age && actor.filmCount==actor1.filmCount){
                    System.out.println("both are same");
                    return true;
                }

            }
        }

        return false;
    }
}

