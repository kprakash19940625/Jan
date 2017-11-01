import java.util.Random;
public class GenerateRandom {
  public static int generate() {
    Random randomGenerator = new Random();
    int n = randomGenerator.nextInt(10);
    return n;
  }
  public static void main(String args[]){
    System.out.println("Hello World");
    //System.out.println(generate());
  }
}
