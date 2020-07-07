package the_exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener{

	private static JTextField text1, text2;
	
	private static JButton btn;
	
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.setLayout(null);
		
		text1 = new JTextField();
		text1.setBounds(100,20,165,25);
		panel.add(text1);
		
		text2 = new JTextField();
		text2.setBounds(100,50,165,25);
		text2.setEditable(false);
		panel.add(text2);
		
		btn = new JButton("write");
		btn.setBounds(10,80,80,25);
		panel.add(btn);
		btn.addActionListener(new  Gui());

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String content1 = text1.getText();
		text2.setText(content1);
		
	}

}
