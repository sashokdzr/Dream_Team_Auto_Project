package Codewars;

import java.util.Locale;

class GreetMe {
    public static void main(String[] args) {
        System.out.println(greet("saSha"));
    }
    public static String greet(String name){
        return "Hello " + name.substring(0,1).toUpperCase() + (name.substring(1, name.length()).toLowerCase()) + "!";
    }
}
