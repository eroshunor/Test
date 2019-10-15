package org.fasttrackit;

public class App 
{
    public static void main( String[] args ){
        Human first = new Human();
        Human second = new Human();

        first.setAge(18);

        //boolean empty = (first.getName()==null);

        System.out.println(first.getName() == null ? "Nincs nev" : "Van nev " + first.getName());

        //if (first.getName() == null){
        //   System.out.println("Nincs nev!");
        //}else{
        //   System.out.println("Van nev " + first.getName());
        }

    }

