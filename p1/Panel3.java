import javax.swing.*;
import java.awt.*;

public class Panel3 extends JPanel {
	JButton calculate_button=new JButton("calculate %");
	private JLabel reminder_label=new JLabel("Please spend money carefully",
			SwingConstants.CENTER);
	Panel3() {
		this.setLayout(new BorderLayout());
		this.add(calculate_button,BorderLayout.CENTER);
		this.add(reminder_label,BorderLayout.SOUTH);
	}

}
