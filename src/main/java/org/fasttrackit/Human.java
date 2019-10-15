package org.fasttrackit;

public class Human {
    private String name;
    private int age;

    public void writeMyName(){
        String name = "Jani";
        System.out.println("Az en nevem " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
