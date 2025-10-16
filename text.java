// first java program

// static void main(String[] args) {
// System.out.println("hello ");
// }

// data types in java
// public static void main(String[] args) {
// String name = "Tarun"; //String: depends on length; each character is 2 bytes
// plus object overhead size depends on the length (5 characters × 2 bytes each
// = 10 bytes for characters + some object overhead) String is an object, not a
// primitive type. It stores a sequence of characters internally as a char
// array.
// int age = 19; //requires 4 bytes
// float cgpa = 8.5f ; //requires 4 bytes
// char letter = 'T'; //requires 2 bytes
// boolean myBool = true; //requires typically 1 byte
// double value = 19.99; //requires 8 bytes
// System.out.println("Hey! i am "+name +"\nI am " + age + "old\n" + "and i got"
// + cgpa + "\nMy name starts form the letter "+ letter +" \nand all the
// information about me is "+ myBool+ "\n" + value);
// }

// the var data type

// public static void main(String[] args) {
// var a = 10; // inferred as int
// var b = 1.1f; // inferred as float
// var c = true; // inferred as boolean
// var d = 'a'; // inferred as char
// var e = 1.2; // inferred as double
// System.out.println(((Object)a).getClass().getSimpleName()); // it's a method
// to find the datatype of the variable since we don't have any keyword that do
// the job
// it will type cast the variable then the getClass is called which return the
// runtime type of the variable and .getSimpleName() returns the simplfied name
// of the object
// System.out.println(((Object)b).getClass().getSimpleName());
// System.out.println(((Object)c).getClass().getSimpleName());
// System.out.println(((Object)d).getClass().getSimpleName());
// System.out.println(((Object)e).getClass().getSimpleName());

// }
// ASCII for loop
// public static void main(String[] args) {
// for (char i = 65; i <= 90; i++) {
// System.out.println(i);
// }
// }

//switch case
// public static void main(String[] args) {
//     int day = 4;
// switch (day) {
//   case 1:
//     System.out.println("Monday");
//     break;
//   case 2:
//     System.out.println("Tuesday");
//     break;
//   case 3:
//     System.out.println("Wednesday");
//     break;
//   case 4:
//     System.out.println("Thursday");
//     break;
//   case 5:
//     System.out.println("Friday");
//     break;
//   case 6:
//     System.out.println("Saturday");
//     break;
//   case 7:
//     System.out.println("Sunday");
//     break;
// }
// }

// Loop Through an Array
// public static void main(String[] args) {
//     String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
//     for (int i = 0; i < cars.length; i++) {
//         System.out.println(cars[i]);

//     }

// }

// for each loop 
// public static void main(String[] args){
//     String[] cars = {"volvo","Bmw","Mercs","Range Rover"};
//     for(String car: cars){   // for ( type variable: arrayName)
//         System.out.println(car);
//     }
// }


//multiDimensional array

// public static void main(String[] args) {
//     int[][] myNumbers = { { 1, 4, 2 }, { 3, 6, 8, 5, 2 } };

//     for (int row = 0; row < myNumbers.length; row++) {
//         for (int col = 0; col < myNumbers[row].length; col++) {
//             System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
//         }
//     }

// }


    
