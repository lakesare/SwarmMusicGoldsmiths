// From lakesare:
// We're not given the Interpret class code, however we are told:
// "It is now time to interpret particle positions as notes. Once more, keep your code tidy by defining a new class, an Interpreter class with a method void interpret(Swarm swarm). This class will contain a MidiSynth object. The purpose of interpret is to take particle positions and form notes from the position components."
import processing.core.PApplet;

public class Interpreter { 
  SimpleMidiSynth synth;

  Interpreter(int xMax, int noteDuration) {
    synth = new MidiSynth();
  }

  void interpret(SimpleSwarm swarm, PApplet pApplet) {
  }
}
