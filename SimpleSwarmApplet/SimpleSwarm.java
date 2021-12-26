import java.util.ArrayList;
import processing.core.PApplet;

public class SimpleSwarm {
  int D, L;
  float speed, particleDiam;
  private ArrayList particles;

  public SimpleSwarm(int numParticles, int dim, int xMax) {
    D = dim;
    L = xMax;
    particles = new ArrayList();
    for (int p = 0; p < numParticles; p++) {
      float[] x = new float[D];
      float[] v = new float[D];
      for (int d = 0; d < D; d++) {
        x[d] = (float)(L * Math.random());
        v[d] = (float)(Math.random() - 0.5f);
      }
      VecMaths.clamp(v, speed);
      particles.add(new Particle(x, v, particleDiam));
    }
  }

  void wrap(float[] vec) {
    // Code to make the particle reappear on the opposite edge.
  }

  void reflect(float[] pos, float[] vel) {
    // Code to make the particle reflect at the edge.
  }

  void draw(PApplet pApplet) {
    for (int p = 0; p < particles.size(); p++) {
      Particle particle = (Particle) particles.get(p);
      for (int n = 0; n < particles.size(); n++) {
        if (n == p)
          continue;
        Particle neighbour = (Particle) particles.get(n);
        // Particle interaction code goes here.
      }
      wrap(particle.position);
      // reflect ( particle .position , particle . velocity );

      pApplet.ellipse(particle.position[0], particle.position[1],
        particleDiam, particleDiam);
    }
  }

  public Particle getParticle(int p) {
    return (Particle) particles.get(p);
  }

  public int getNumParticles() {
    return particles.size();
  }
}
