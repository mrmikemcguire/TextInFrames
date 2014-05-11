import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class TextInFrame extends JFrame
	{
	private JLabel text1;
	
	public static void main(String[]  args)
		{
		TextInFrame TextInFrame = new TextInFrame();
		TextInFrame.setSize(300,400);
		TextInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TextInFrame.setVisible(true);
		}
	
	public TextInFrame() 
		{
		super("Hello.");
		setLayout(new FlowLayout());

		text1 = new JLabel("Sentence");
		text1.setToolTipText("Magic");
		add(text1);
		}
	}

