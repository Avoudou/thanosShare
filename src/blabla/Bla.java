package blabla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Bla {

	public static void main(String[] args) {
		String kiki = "Gia su  kiki";
		JFrame aframe = new JFrame();
		JPanel aPanel = new JPanel();
		JTextArea area = new JTextArea(kiki);
		aPanel.add(area);
		aframe.add(aPanel);
		aframe.setVisible(true);
		aframe.setSize(300, 300);

	}

}
