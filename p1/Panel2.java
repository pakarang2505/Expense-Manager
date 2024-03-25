import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel2 extends JPanel implements ActionListener,ItemListener {
	JPanel fill_panel=new JPanel();
	
	String category []= {"food","transportation","grocery",
			"utility","medical & healthcare","entertainment"};
	JComboBox<String> cate_box=new JComboBox<String>(category);
	
	JTextField input_amount=new JTextField(15);
	
	JButton add_button=new JButton("add");
	
	JPanel category_panel=new JPanel();
	
	Food food_panel=new Food(Color.PINK);
	Transportation transport_panel=new Transportation(Color.ORANGE);
	Grocery grocery_panel=new Grocery(Color.CYAN);
	Utility utility_panel=new Utility(Color.YELLOW);
	Health health_panel=new Health(Color.GREEN);
	Entertain entertain_panel=new Entertain(Color.LIGHT_GRAY);

	
	
	
	
	Panel2() {
		fill_panel.setLayout(new GridLayout(1,3));
		fill_panel.add(cate_box);
		fill_panel.add(input_amount);
		fill_panel.add(add_button);
		
		category_panel.setLayout(new GridLayout(3,2));
		category_panel.add(food_panel);
		category_panel.add(transport_panel);
		category_panel.add(grocery_panel);
		category_panel.add(utility_panel);
		category_panel.add(health_panel);
		category_panel.add(entertain_panel);
		
		this.setLayout(new BorderLayout());
		this.add(fill_panel,BorderLayout.NORTH);
		this.add(category_panel,BorderLayout.CENTER);
		cate_box.addItemListener(this);
		add_button.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e) {}
	
	public void itemStateChanged(ItemEvent e) {
		if ((String)cate_box.getSelectedItem()=="food")
		{food_panel.amount=food_panel.amount+Double.parseDouble(input_amount.getText());
	}
	}

}
