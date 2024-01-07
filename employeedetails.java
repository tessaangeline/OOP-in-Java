import java.util.Scanner;
class Employee{
    int id;
    String name;
    double Salary;
    Employee(int i, String n,double s){
        id=i;
        name=n;
        Salary=s;
    }
    void display(){
        System.out.println("\nID: "+id+"\nName: "+name+"\nSalary: "+Salary);
    }
}
class Manager extends Employee{
    String position;
    Manager(int i, String n, double s, String p){
        super(i,n,s);
        position=p;
    }
    void display(){
        super.display();
        System.out.println("\nPostion: "+position);
    }
}
class SeniorManager extends Manager{
    String department;
    SeniorManager(int i,String n, double s, String p, String d){
        super(i,n,s,p);
        department=d;
    }
    void display(){
        super.display();
        System.out.println("\nDepartment: "+department);
    }
}
class Intern extends Employee{
    String college;
    Intern(int i,String n,double s, String c){
        super(i,n,s);
        college=c;
    }
    void display(){
        super.display();
        System.out.println("\nCollege: "+college);
    }
}
class Devoleper extends Employee{
    String area;
    Devoleper(int i,String n,double s,String a){
        super(i,n,s);
        area=a;
    }
    void display(){
        super.display();
        System.out.println("\nArea: "+ area);
    }
}
class JuniorDevoleper extends Devoleper{
    String lang;
    JuniorDevoleper(int i,String n,double s,String a, String l){
        super(i,n,s,a);
        lang=l;
    }
    void display(){
        super.display();
        System.out.println("\nLanguage: "+lang);
}
}

public class employeedetails{
    public static void main(String args[]){
        Manager m=new Manager(01,"Alex",100000.0, "chief");
        SeniorManager sm=new SeniorManager(02, "George", 10000000, "Senior", "Computer");
        Intern in=new Intern(03, "Anitta", 90000, "RSET");
        JuniorDevoleper j= new JuniorDevoleper(04, "Anu", 800000,"Computer", "java");

        sm.display();
        in.display();
        j.display();
    }
}
