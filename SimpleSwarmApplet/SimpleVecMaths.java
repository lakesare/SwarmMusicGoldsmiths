import java.util.Arrays;

public class SimpleVecMaths {
  static float length(float[] vec) {
    float mag = 0;
    for (int d = 0; d < vec.length; d++)
      mag += vec[d] * vec[d];
    return (float) Math.sqrt(mag);
  }

  static void clamp(float[] vec, float length) {
    // Place your code here.
  }

  static float[] add(float[] result, float[] vecA, float[] vecB) {
    // Place your code here.
    return result;
  }

  static float[] subtract(float[] result, float[] vecA, float[] vecB) {
    // Place your code here.
    return result;
  }

  static float[] scalarMult(float[] result, float scalar, float[] vec) {
    // Place your code here.
    return result;
  }

  static float dist(float[] vecA, float[] vecB) {
    // Place your code here.
    return 0;
  }

  public static void main(String[] args) {
    float[] vec = new float[] { 3, 4 };
    System.out.println(" length of " + Arrays.toString(vec) + " is " + length(vec));
  }
}
