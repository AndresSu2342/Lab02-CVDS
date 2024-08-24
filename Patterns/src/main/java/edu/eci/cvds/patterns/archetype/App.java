package edu.eci.cvds.patterns.archetype;

public class App 
{
    public static void main(String[] args)
    {
        if (args.length >= 2) {
            System.out.println("Hola, " + args[0] + " " + args[1] + "!");
        } else if (args.length == 1) {
            System.out.println("Hola, " + args[0] + "!");
        } else {
            System.out.println("Hola Mundo!");
        }
    }
}
