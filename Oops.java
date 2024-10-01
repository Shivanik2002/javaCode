class Pen {
    String color;
    String type;   //ballPoint get

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }

}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Oops {
    public static void main(String args[]) {

        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type =  "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.write();
        pen1.printColor();
        pen2.printColor();
        pen1.printType();
        pen2.printType();

System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Student s1 = new Student("Shivani", 24);
        s1.printInfo();
    }
}
