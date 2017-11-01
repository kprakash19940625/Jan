import java.util.Random;
import java.io.*;
import java.util.*;
public class GenerateRandom {
  public static int generate() {
    Random randomGenerator = new Random();
    int n = randomGenerator.nextInt(10);
    return n;
  }
  public static void main(String args[]){
    //System.out.println("Hello World");
    File file = new File("index.html");
    FileWriter writer;
    try {
        writer = new FileWriter(file, true);
        PrintWriter printer = new PrintWriter(writer);
        printer.write("HelloWorld");
        printer.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    //System.out.println(generate());
  }
}
