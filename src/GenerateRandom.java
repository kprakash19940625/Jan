import java.util.Random;
public class GenerateRandom {
  public int generate() {
    Random randomGenerator = new Random();
    int n = randomGenerator.nextInt(10);
    return n;
  }
  public void main(String args[]){
    System.out.println(generate());
  }
}
