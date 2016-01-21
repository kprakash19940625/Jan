import java.util.Random;
public class GenerateRandom {
  public int generate() {
    Random randomGenerator = new Random();
    int n = randomGenerator.nextInt(20);
    return n;
  }
}
