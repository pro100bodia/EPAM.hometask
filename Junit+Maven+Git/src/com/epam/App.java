package com.epam;

public class App {
    private String name;

    public App(){
        this.name = "������ �����������";
    }

    public String getName() {
        return name;
    }

    public static void main( String[] args ){
        System.out.println( new App().getName() );
    }
}
