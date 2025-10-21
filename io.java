// import java.io.FileInputStream; // fileinputstream
// import java.io.IOException; // import IOException 

// public class io {
//         public static void main(String[] args) {

//             try (FileInputStream input = new FileInputStream(("image.jpg"))) {

//                int i;// will store each byte that is read

//                //read one byte at a time until end of file (-1 means "no more data")

//                while ((i = input.read()) != -1) {
//                 System.out.print((char)i);
//                } 

//             } catch (IOException e) {
//                System.out.println("Error reading File.");
//             }
//         }
// }

//copy a binary file 

// import java.io.FileInputStream; // fileinputstream
// import java.io.FileOutputStream; //FileOutputStream

// public class io {
//     public static void main(String[] args) {
//         try (FileInputStream input = new FileInputStream("image.jpg");
//             FileOutputStream output = new FileOutputStream("copy.jpg")){
//                 int i;
//                 while ((i = input.read()) != -1) {
//                     output.write(i);
//                 }
//                 System.out.println("File copied successfully");
//         } catch (IOException e) {
//             System.out.println("Error handling file.");
//         }
//     }
// }


// create a file and write inside it 

// import java.io.FileOutputStream; //FileOutputStream
// import java.io.IOException; // import IOException

// public class io {
//     public static void main(String[] args) {

//         String text = "Hello world!";
//         try (FileOutputStream output = new FileOutputStream("filemane.txt")) {
//             output.write(text.getBytes());
//         } catch (IOException e) {
//             System.out.println("error occured");
//             e.printStackTrace();
//         }
//     }
// }


// append on a file 

// import java.io.FileOutputStream; //FileOutputStream
// import java.io.IOException; // import IOException

// public class io {
//     public static void main(String[] args) {

//         String text = " Hello world! tarun here";
//         try (FileOutputStream output = new FileOutputStream("image.jpg", true)) { // just passed a ture which tells the conplier to append into the file 
//             output.write(text.getBytes());
//             System.err.println("Done!");
//         } catch (IOException e) {
//             System.out.println("error occured");
//             e.printStackTrace();
//         }
//     }

// }


// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;


// public class io {
//     public static void main(String[] args) {
        
//         try (BufferedReader br = new BufferedReader(new FileReader("filename.txt"))) {
//             String line;
//             while((line = br.readLine())!=null) {
//                 System.out.println(line);
//             }
//         } catch (IOException e) {
//             System.out.println("Error Occured");
//         }
//     }
    
// }

//The BufferedWriter class is used to write text to a file, one line or one string at a time. If the file already exists, its contents will be replaced (overwritten).

// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;

// public class io {
//   public static void main(String[] args) {
//     try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt"))) {
//       bw.write("First line");
//       bw.newLine();  // add line break
//       bw.write("Second line");
//       System.out.println("Successfully wrote to the file.");
//     } catch (IOException e) {
//       System.out.println("Error writing file.");
//     }
//   }
// }


//Append to a Text File
// To add new content to the end of a file (instead of overwriting), pass true to FileWriter:

// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;

// public class io {
//   public static void main(String[] args) {
//     // true = append mode
//     try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt", true))) {
//       bw.newLine();                     
//       bw.write("Appended line");    
//       System.out.println("Successfully appended to the file.");
//     } catch (IOException e) {
//       System.out.println("Error writing file.");
//     }
//   }
// }