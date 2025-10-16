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

abstract class Main {
    public String name = "tarun";
    public int age = 19;
    protected abstract void study();
    
}

class person extends Main{
    public int year = 2024;
    public void study(){
        System.out.println("studying all day");
    }
    
}

