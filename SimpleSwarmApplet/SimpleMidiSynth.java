import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class SimpleMidiSynth {
  Synthesizer synthesizer = null;
  MidiChannel channel;

  SimpleMidiSynth() {
    try {
      synthesizer = MidiSystem.getSynthesizer();
      synthesizer.open();
    } catch (MidiUnavailableException e) {
      e.printStackTrace();
    }
    MidiChannel[] channels = synthesizer.getChannels();
    channel = channels[0];
  }

  void close() {
    synthesizer.close();
  }

  public static void main(String[] args) {
    SimpleMidiSynth synth = new SimpleMidiSynth();
    // Play some notes by calling
    // noteOn (int noteNumber int velocity )
    // on this midi synth ’s single available channel .
    // Remember to call noteOff (int noteNumber )
    // before sending the next noteOn .
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {}
    synth.close();
  }
}
