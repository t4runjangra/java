//first java program 

// static void main(String[] args) {
//     System.out.println("hello ");
// }


//data types in java
  public static void main(String[] args) {
    String name = "Tarun"; //String: depends on length; each character is 2 bytes plus object overhead  size depends on the length (5 characters × 2 bytes each = 10 bytes for characters + some object overhead) String is an object, not a primitive type. It stores a sequence of characters internally as a char array.
    int age = 19; //requires 4 bytes
    float cgpa = 8.5f ; //requires 4 bytes
    char letter = 'T'; //requires 2 bytes
    boolean myBool = true; //requires typically 1 byte
    double value = 19.99; //requires 8 bytes
    System.out.println("Hey! i am "+name +"\nI am " + age + "old\n" + "and i got" + cgpa + "\nMy name starts form the letter "+ letter +" \nand all the information about me is "+ myBool+ "\n" + value);
  }

