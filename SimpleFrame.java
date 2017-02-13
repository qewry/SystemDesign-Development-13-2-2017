import javax.swing.*;
import java.awt.event.*; //code related to event handling

public class SimpleFrame extends JFrame {

		private JButton button = new JButton("Press me!");
		private JLabel label = new JLabel("Go on, press the button");
		private JPanel background = new JPanel();
		
		public SimpleFrame()
		{
			button.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							label.setText("Ouch ... that hurt! ");
							
						}
					});//edw enallaktika dimiourgw mia allh klassh ActionListener
			//ftiaxnw ena antikeimeno ActionListener kai mesa sth methodo actionPerformed orizw to text tou label
			background.add(button);//add button to background
			background.add(label);//add label to background	
			
			getContentPane().add(background);//add background to frame
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pack();
		}
}

//grammh 12-13 mexri 19
//enallaktika
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ActionListenImp implements ActionListener{

	JLabel label;
	
	public ActionListenImp(JLabel label1) {
		//this.label = label; auto 8a htan an to JLabel label1 htan JLabel label TO ORISMA EINAI TO ORISMA POU DINEIS OTAN FTIAXNEIS TON CONSTRUCTOR
		//					  ENW TO label einai h metavliti se auth thn class
		label=label1;
 	}
	
	public void actionPerformed(ActionEvent e) {
		
		label.setText("changed");
		
	}

}

