package it.project.classes;

import java.util.Scanner;

public class start {

    public static void main(String[] args){
        Person persona1 = new Person();
        Scanner scanner = new Scanner(System.in);
        String line;


        System.out.println("Insert the name of the person: ");
        line = scanner.nextLine();
        persona1.setName(line);

        System.out.println("Insert the surname of the person: ");
        line = scanner.nextLine();
        persona1.setSurname(line);

        System.out.println("Insert the height of the person: ");
        double height = scanner.nextDouble();
        persona1.setHeight(height);
        //scanner.nextLine();

        System.out.println("Insert the age of the person: ");
        int age = scanner.nextInt();
        persona1.setAge(age);
        //scanner.nextLine();


        System.out.println(persona1.toString());
    }
}
