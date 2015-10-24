import javax.swing.*;

class SwingDemo
{
	SwingDemo()
	{
		JFrame jfrm = new JFrame("A simple Swing Application");
		jfrm.setSize(300,300); // sets the dimension of window
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jlb = new JLabel("Swing menas powerful GUIs.");
		JButton jb = new JButton("ok");
		jfrm.add(jlb);
		jfrm.add(jb);

		jfrm.setVisible(true);
	}
public static void main(String args[])
	{
		SwingUtilities.invokeLater( new Runnable() 
		{
			public void run()
			{
				new SwingDemo();
			}
		});
	}
}
