package objektorienteringUppgift3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BackendGame extends JFrame implements ActionListener {
	
	private JPanel gamePanel = new JPanel();
	private JPanel knappPanel = new JPanel();
	private JButton nyttSpel = new JButton("Nytt spel");
	private JButton avsluta = new JButton("Avsluta");
	
	public BackendGame() {
		
		//Framens location och övre panelen
		setLocation(900, 500);
		setLayout(new BorderLayout());
		add(gamePanel, BorderLayout.NORTH);
		
		//nedre panelen
		add(knappPanel, BorderLayout.SOUTH);
		knappPanel.add(nyttSpel);
		knappPanel.add(avsluta);
		
		//almänna villkor
		setVisible(true);
		setDefaultCloseOperation(3);
		pack();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
