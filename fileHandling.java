// import java.io.File;
// import java.io.IOException;

// public class fileHandling {
//     public static void main(String[] args) {
//         try {
//             File myObj = new File("filename.txt");
//             if (myObj.createNewFile()) {
//                 System.out.println("File created: " + myObj.getName());
//             } else {
//                 System.out.println("File already exists");
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }

//     }

// }

// wrtie to a file

// import java.io.FileWriter;
// import java.io.IOException;

// public class fileHandling {
// public static void main(String[] args) {
// try {
// FileWriter myWriter = new FileWriter("filename.txt");
// myWriter.write("Hello my name is tarun");
// myWriter.close();
// } catch (IOException e) {
// System.err.println("error occured" + e);
// e.printStackTrace();
// }
// }

// }

// with try and resoucre writing inside a file

// import java.io.FileWriter;
// import java.io.IOException;

// public class fileHandling {
// public static void main(String[] args) {
// try(FileWriter myWriter = new FileWriter("filename.txt");) {

// myWriter.write("Hello my name is tarun and i am 19");
// System.out.println("successful");
// } catch (IOException e) {
// System.err.println("error occured" + e);
// e.printStackTrace();
// }
// }
// }

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileHandling {
public static void main(String[] args) {
File myObj = new File("filename.txt");

//****** // try-with-resources: Scanner will be closed automatically
try (Scanner myReader = new Scanner(myObj)) {
while (myReader.hasNextLine()) {
String data = myReader.nextLine();
System.out.println(data);
}

} catch (FileNotFoundException e) {
System.err.println("error occured" + e);
e.printStackTrace();
}
}
}

// get files data

// import java.io .File;

// public class fileHandling {
// public static void main(String[] args) {
// File myObj = new File("filename.txt");
// if (myObj.exists()) {
// System.out.println("File name: " + myObj.getName());
// System.out.println("Absolute path: " + myObj.getAbsolutePath());
// System.out.println("Writeable: " + myObj.canWrite());
// System.out.println("Readable " + myObj.canRead());
// System.out.println("File size in bytes " + myObj.length());
// } else {
// System.out.println("The file does not exist.");
// }
// }

// }

// delete file

// import java.io.File;

// public class fileHandling {
// public static void main(String[] args) {
// File mFile = new File("filename.txt");
// if (mFile.delete()) {
// System.out.println("deleted the file: " + mFile.getName());
// }else{
// System.out.println("Failed to delete the file");
// }
// }

// }