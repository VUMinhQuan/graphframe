package GraphPackage;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class GraphFrame extends JFrame {
	GraphComponent graphcomponent;
	JToolBar toolbar;
	JMenuBar menubar;

	public GraphFrame() {
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		this.setTitle("Graph");
		this.setSize(1000, 500);
		this.setVisible(true);
		graphcomponent = new GraphComponent();
		this.add(graphcomponent);

		// create Toolbar
		createToolbar();

	}

	// create Toolbar
	public void createToolbar() {
		toolbar = new JToolBar();
		toolbar.setLayout(new GridLayout(5, 1));
		addButtons(toolbar);
		this.add(toolbar, BorderLayout.WEST);
	}

	public void addButtons(JToolBar toolBar) {
		JButton button = new JButton("Cirlce");
		button.setActionCommand("Cirlce");
		button.setToolTipText("Cirlce");
		// button.setActionListener(this);
		toolbar.add(button);

		JButton button2 = new JButton("Rectangle");
		button.setActionCommand("Rectangle");
		button.setToolTipText("Rectangle");
		// button.setActionListener(this);
		toolbar.add(button2);
		
		//toolbar.addSeparator();
		
		JButton button3 = new JButton("Ellipse");
		button.setActionCommand("Ellipse");
		button.setToolTipText("Ellipse");
		// button.setActionListener(this);
		toolbar.add(button3);
		
		JButton button4 = new JButton("Exit");
		button.setActionCommand("Exit");
		button.setToolTipText("Exit");
		// button.setActionListener(this);
		toolbar.add(button4);

	}

}
