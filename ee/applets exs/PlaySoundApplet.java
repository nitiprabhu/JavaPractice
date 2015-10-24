import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PlaySoundApplet extends Applet implements ActionListener{
  Button play,stop;
  AudioClip audioClip;

  public void init(){
  play = new Button("  Play Audio  ");
  add(play);
  play.addActionListener(this);
  stop = new Button("  Stop  ");
  add(stop);
  stop.addActionListener(this);

  audioClip = getAudioClip(getDocumentBase(),"TestSnd.wav");

    }
  
  public void actionPerformed(ActionEvent ae){
  Button source = (Button)ae.getSource();
  if (source.getLabel() == "  Play Audio  "){
  audioClip.play();
  }
  else if(source.getLabel() == "  Stop  "){
  audioClip.stop();
  }
  }
}