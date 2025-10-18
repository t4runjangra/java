// public class Main {

//     public void fullThrotal(){
//         System.out.println("The car is going as fast as it can!");
//     }

//     public void maxSpeed(int speed){
//         System.out.println("Max speed is: " + speed);
//     }
//     public static void main(String[] args) {
//         Main myobj = new Main();
//         myobj.fullThrotal();
//         myobj.maxSpeed(200);
//     }
// }

// public class Main {
//   int modelYear;
//   String modelName;

//   public Main(int year, String name) {
//     modelYear = year;
//     modelName = name;
//   }

//   public static void main(String[] args) {
//     Main myCar = new Main(1969, "Mustang");
//     System.out.println(myCar.modelYear + " " + myCar.modelName);
//   }
// }

// public class Main{
//     int x = 5;
//     public Main(){
//         System.out.println("tarun");
//     }
//     public Main(int x){
//         this.x = x; // used for current context if the name of the parameter and the class variable are same by name
//     }
//     public static void main(String[] args) {
//         Main myObj = new Main();
//         Main myObj1 = new Main(4);
//         System.out.println(myObj.x);
//         System.out.println(myObj1.x);
//     }
// }

//  using this from another constructor

// public class Main {
//     int modelName;
//     String carName;
//     public Main(String carName){
//         this(2020, carName);
//     }
//     public Main(int modelName, String carName){
//         this.modelName = modelName;
//         this.carName = carName;
//     }
//     public void printCar(){
//         System.out.println( modelName + " " + carName);
//     }
//     public static void main(String[] args) {
//         Main myCar = new Main("Honda");
//         Main myCar2 = new Main(2014 , "BMW");
//         myCar.printCar();
//         myCar2.printCar();
//     }

// }

// class Person {
//   protected String fname = "John";
//   protected String lname = "Doe";
//   protected String email = "john@doe.com";
//   protected int age = 24;
//   public static void main(String[] args) {

//   }
// }

// class Student extends Person {
//   private int graduationYear = 2018;
//   public static void main(String[] args) {
//     Student myObj = new Student();
//     System.out.println("Name: " + myObj.fname + " " + myObj.lname);
//     System.out.println("Email: " + myObj.email);
//     System.out.println("Age: " + myObj.age);
//     System.out.println("Graduation Year: " + myObj.graduationYear);
//   }
// }

// abstract class Main {
//     public String name = "tarun";
//     public int age = 19;
//     protected abstract void study();

// }

// class person extends Main{
//     public int year = 2024;
//     public void study(){
//         System.out.println("studying all day");
//     }

// }

// Encapsulation

//  public class Main {
//       private String name;

//     //  getter

//      public String getName() {
//          return name;
//      }

//   //  setter

//     public void setName(String newName) {
//          this.name = newName;
//     }

//      public static void main(String[] args) {
//          Main myObj = new Main();
//          myObj.setName("tarun");
//          String name = myObj.getName();
//          System.out.println(name);
//      }

//   }

// Packages:- Packages in java is used to group classes, it is like a file in a directory you can import it in your program. we use packages to avoid name conflicts. and to wrtie a better maintainable code 
// built in packages 
// user define packeages 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("enter your Name: ");
//         String username = scanner.nextLine();
//         System.out.println(username);

//     }

// }

// inheritence 

// public class Main {
//     protected String name = "Ford";
//     public void honk(){
//         System.out.println("Poo Poo!");
//     }
// }
// class car extends Main {
//     private String modelName = " Mustang";
//     public static void main(String[] args) {
//             car myObj = new car();
//             System.out.println(myObj.name +" " + myObj.modelName);
//             myObj.honk();
//     }

// }    

// polymorphism

// class animal {
//     public void animalSound(){
//         System.out.println("Animal sound");
//     }
// }
// class pig extends animal {
//     public void pigSound(){
//         System.out.println("Pig sound");
//     }
// }
// class dog extends animal{
//     public void dogSound(){
//         System.out.println("Dog sound");
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         animal obj1 = new animal();
//         pig obj2 = new pig();
//         dog obj3 = new dog();
//         obj1.animalSound();
//         obj2.pigSound();
//         obj3.dogSound();
//     }
    
// }



// super keyword // used to refer the parent class of subclass , most common use case of it to avoid the conflict between superclass and subclass if they contain same name method.



// public class Main {

//     public void animalSound(){
//         System.out.println("sound");
//     }    
// }

// class sound extends Main{
//     public void animalSound(){
//         super.animalSound();
//         System.out.println("another sound");
//     }
// }
// class run{
//     public static void main(String[] args) {
//         sound obj = new sound();
//         obj.animalSound();
//     }
// }


public class Main {
    int x = 5;
    public class InnerMain {
        int y = 3;
    }
}

class a {
    public static void main(String[] args) {
        Main obj = new Main();
        Main.InnerMain obj1 = obj.new InnerMain();
        System.out.println(obj1.y +" "+ obj.x);
    }
    
}