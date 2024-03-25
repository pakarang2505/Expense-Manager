import javax.swing.*;
import java.awt.*;

public class Panel1 extends JPanel {
	Object obj=new Object();
	JLabel total_label=new JLabel("Total Expense: B",SwingConstants.CENTER);
	
	Panel1(){
		this.setLayout(new BorderLayout());
		this.add(total_label,BorderLayout.NORTH);
		
	}
	protected void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(200, 100, 250, 250);
	}
}
