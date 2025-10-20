// public class Main {

// public void fullThrotal(){
// System.out.println("The car is going as fast as it can!");
// }

// public void maxSpeed(int speed){
// System.out.println("Max speed is: " + speed);
// }
// public static void main(String[] args) {
// Main myobj = new Main();
// myobj.fullThrotal();
// myobj.maxSpeed(200);
// }
// }

// public class Main {
// int modelYear;
// String modelName;

// public Main(int year, String name) {
// modelYear = year;
// modelName = name;
// }

// public static void main(String[] args) {
// Main myCar = new Main(1969, "Mustang");
// System.out.println(myCar.modelYear + " " + myCar.modelName);
// }
// }

// public class Main{
// int x = 5;
// public Main(){
// System.out.println("tarun");
// }
// public Main(int x){
// this.x = x; // used for current context if the name of the parameter and the
// class variable are same by name
// }
// public static void main(String[] args) {
// Main myObj = new Main();
// Main myObj1 = new Main(4);
// System.out.println(myObj.x);
// System.out.println(myObj1.x);
// }
// }

// using this from another constructor

// public class Main {
// int modelName;
// String carName;
// public Main(String carName){
// this(2020, carName);
// }
// public Main(int modelName, String carName){
// this.modelName = modelName;
// this.carName = carName;
// }
// public void printCar(){
// System.out.println( modelName + " " + carName);
// }
// public static void main(String[] args) {
// Main myCar = new Main("Honda");
// Main myCar2 = new Main(2014 , "BMW");
// myCar.printCar();
// myCar2.printCar();
// }

// }

// class Person {
// protected String fname = "John";
// protected String lname = "Doe";
// protected String email = "john@doe.com";
// protected int age = 24;
// public static void main(String[] args) {

// }
// }

// class Student extends Person {
// private int graduationYear = 2018;
// public static void main(String[] args) {
// Student myObj = new Student();
// System.out.println("Name: " + myObj.fname + " " + myObj.lname);
// System.out.println("Email: " + myObj.email);
// System.out.println("Age: " + myObj.age);
// System.out.println("Graduation Year: " + myObj.graduationYear);
// }
// }

// abstract class Main {
// public String name = "tarun";
// public int age = 19;
// protected abstract void study();

// }

// class person extends Main{
// public int year = 2024;
// public void study(){
// System.out.println("studying all day");
// }

// }

// Encapsulation

// public class Main {
// private String name;

// // getter

// public String getName() {
// return name;
// }

// // setter

// public void setName(String newName) {
// this.name = newName;
// }

// public static void main(String[] args) {
// Main myObj = new Main();
// myObj.setName("tarun");
// String name = myObj.getName();
// System.out.println(name);
// }

// }

// Packages:- Packages in java is used to group classes, it is like a file in a
// directory you can import it in your program. we use packages to avoid name
// conflicts. and to wrtie a better maintainable code
// built in packages
// user define packeages

// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("enter your Name: ");
// String username = scanner.nextLine();
// System.out.println(username);

// }

// }

// inheritence

// public class Main {
// protected String name = "Ford";
// public void honk(){
// System.out.println("Poo Poo!");
// }
// }
// class car extends Main {
// private String modelName = " Mustang";
// public static void main(String[] args) {
// car myObj = new car();
// System.out.println(myObj.name +" " + myObj.modelName);
// myObj.honk();
// }

// }

// polymorphism

// class animal {
// public void animalSound(){
// System.out.println("Animal sound");
// }
// }
// class pig extends animal {
// public void pigSound(){
// System.out.println("Pig sound");
// }
// }
// class dog extends animal{
// public void dogSound(){
// System.out.println("Dog sound");
// }
// }
// class Main {
// public static void main(String[] args) {
// animal obj1 = new animal();
// pig obj2 = new pig();
// dog obj3 = new dog();
// obj1.animalSound();
// obj2.pigSound();
// obj3.dogSound();
// }

// }

// super keyword // used to refer the parent class of subclass , most common use
// case of it to avoid the conflict between superclass and subclass if they
// contain same name method.

// public class Main {

// public void animalSound(){
// System.out.println("sound");
// }
// }

// class sound extends Main{
// public void animalSound(){
// super.animalSound();
// System.out.println("another sound");
// }
// }
// class run{
// public static void main(String[] args) {
// sound obj = new sound();
// obj.animalSound();
// }
// }

// inner class

// public class Main {
// int x = 5;
// public class InnerMain {
// int y = 3;
// }
// }

// class a {
// public static void main(String[] args) {
// Main obj = new Main();
// Main.InnerMain obj1 = obj.new InnerMain();
// System.out.println(obj1.y +" "+ obj.x);
// }

// }

// abstraction : hides specific details and show only essentials data. can't
// access directly through making an object we have to use polymorphism

// abstract class Main {
// public abstract void animalSound();
// public void sleep(){
// System.out.println("ezz");
// }

// }

// class pig extends Main{
// public void animalSound(){
// System.out.println("The Pig");
// }
// }

// class a{
// public static void main(String[] args) {
// pig myPig = new pig();
// myPig.animalSound();
// myPig.sleep();
// }
// }

// Interface : another way of abstraction use interface keyword here and replace
// extends keyword instead we use impliments

// interface animal {
// public void animalSound();

// public void sleep();
// }

// class pig implements animal {
// public void animalSound() {
// System.out.println("Pig Sound");
// }

// public void sleep() {
// System.out.println("Pig is sleeping");
// }

// }

// public class Main {
// public static void main(String[] args) {
// pig mPig = new pig();
// mPig.animalSound();
// mPig.sleep();
// }

// }

// multiple interface (used for mulitple inheritence)

// interface Main {
// public void animalSound();

// }
// interface InnerMain {
// public void sleep();
// }
// class dog implements Main, InnerMain{
// public void animalSound(){
// System.out.println("Bho Bho");
// }
// public void sleep(){
// System.out.println("Sleeping");
// }
// }

// class a{
// public static void main(String[] args) {
// dog mDog = new dog();
// mDog.animalSound();
// mDog.sleep();
// }
// }

// Anonymous class is a class without name in which where you create and used at
// the same time

// with normal class

// public class Main {
// public void makeSound(){
// System.out.println("Sound is making");
// }
// }
// class a{
// public static void main(String[] args) {
// Main myMain = new Main(){
// public void makeSound(){
// System.out.println("sound");
// }
// };
// myMain.makeSound();
// }
// }

// with interface

// interface Main {
// void sleep();
// }
// class a{
// public static void main(String[] args) {
// Main myobj = new Main() { // created and used at the same time
// public void sleep(){
// System.out.println("Sleeping");
// }
// };
// myobj.sleep();
// }
// }

// enum

// enum data{
// LOW,
// MEDIUM,
// HIGH
// }
// public class Main {
// public static void main(String[] args) {
// data myVar = data.HIGH;
// System.out.println(myVar);
// }

// }

//enum constructor : An enum can also have a constructor just like a class.
// The constructor is called automatically when the constants are created. You cannot call it yourself.
// Here, each constant in the enum has a value (a string) that is set through the constructor:

// enum data {
//     LOW("Low level"),
//     MEDIUM("mid level"),
//     HIGH("High level");

//     private String description;

//     private data( String description){
//         this.description = description;
//     }

//     public String getDescription(){
//         return description;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         data myData = data.HIGH;
//         System.out.println(myData.getDescription());

//         for (data var : data.values()) {
//             System.out.println(var + ": " + var.getDescription());

//         }
//     }

// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner myScanner = new Scanner(System.in);
//         System.out.println("enter your username: ");
//         String userName = myScanner.nextLine();
//         System.out.println("Username is: " + userName);
//     }

// }



// import the LocalDate class


// import java.time.LocalDate; 

// public class Main {
//   public static void main(String[] args) {
//     LocalDate myObj = LocalDate.now(); 
//     System.out.println(myObj); 
//   }
// }


// Local Time


// import java.time.LocalTime;
// public class Main {
//     public static void main(String[] args) {
//         LocalTime mLocalTime = LocalTime.now();
//         System.out.println(mLocalTime);
//     }
// }


// import the LocalDateTime class


//import java.time.LocalDateTime; 

//public class Main {
//   public static void main(String[] args) {
//     LocalDateTime myObj = LocalDateTime.now();
//     System.out.println(myObj);
//   }
// }