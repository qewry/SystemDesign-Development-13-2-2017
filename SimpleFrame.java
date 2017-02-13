import javax.swing.*;

public class SimpleFrame extends JFrame {

		private JButton button = new JButton("Press me!");
		private JLabel label = new JLabel("Go on, press the button");
		private JPanel background = new JPanel();
		
		public SimpleFrame()
		{
			
			background.add(button);//add button to background
			background.add(label);//add label to background
			
			
			getContentPane().add(background);//add background to frame
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pack();
		}
}
