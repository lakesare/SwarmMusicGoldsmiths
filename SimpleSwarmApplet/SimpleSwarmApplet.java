import processing.core.PApplet;

public class SimpleSwarmApplet extends PApplet {
  private static final long serialVersionUID = 1L;
  int D, L, numParticles;
  SimpleSwarm swarm;

  public void setup() {
    size(L, L);
    swarm = new SimpleSwarm(numParticles, D, L);
    smooth();
    noStroke();
  }

  public void draw() {
    background(0);
    fill(255);
    swarm.draw(this);
  }
}
