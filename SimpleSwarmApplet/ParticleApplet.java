import processing.core.PApplet;

public class ParticleApplet extends PApplet {
  private static final long serialVersionUID = 1L;
  int D, L;
  float speed, particleDiam;
  Particle particle;

  public void setup() {
    size(L, L);
    float[] x = new float[D];
    float[] v = new float[D];
    for (int d = 0; d < D; d++) {
      x[d] = (float)(L * Math.random());
      v[d] = (float)(Math.random() - 0.5f);
    }
    VecMaths.clamp(v, speed);
    particle = new Particle(x, v, particleDiam);
    smooth();
    noStroke();
  }

  public void draw() {
    background(0);
    // Place your code here.
    fill(255);
    ellipse(particle.position[0], particle.position[1], particle.diam, particle.diam);
  }

  public static void main(String args[]) {
    PApplet.main(new String[] {
      " SimpleSwarmMusic "
    });
  }
}
