import java.util.Scanner;
class Animal{
    String name;
    int age;
Animal(String n, int a){
    name=n;
    age=a;
}
}
class Herbivorous extends Animal{
    String type;
Herbivorous(String n, int a, String t){
    super(n,a);
    type=t;
}
}
class Carnivorous extends Animal{
    String type;
Carnivorous(String n, int a, String t){
    super(n,a);
    type=t;
}
    }

public class animal{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("\nCarnivorous: ");
        System.out.println("\nEnter the name: ");
        String a=s.nextLine();
        System.out.println("Enter the age: ");
        int b= s.nextInt();
        System.out.println("Enter the type: ");
        String c=s.nextLine();
        c=s.nextLine();
        Carnivorous ca= new Carnivorous(a, b, c);
        System.out.println("\nName: "+a+"\nAge: "+b+"\nType: "+c);
        System.out.println("\nHerbivorous: ");
        System.out.println("Enter the name: ");
        a=s.nextLine();
        System.out.println("Enter the age: ");
        b=s.nextInt();
        System.out.println("Enter the type: ");
        c=s.nextLine();
        c=s.nextLine();
        Herbivorous he= new Herbivorous(a, b, c);
        System.out.println("\nName: "+a+"\nAge: "+b+"\nType: "+c);
    }
}

