package GraphPackage;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.geom.RectangularShape;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;

@SuppressWarnings("serial")
public class GraphComponent extends JComponent implements MouseInputListener {
	public GraphComponent graphComponent;
	List<RectangularShape> listShape;
	
	public void addRectangularShape(RectangularShape rectangle )
	{
		listShape.add(rectangle);
		repaint();
	}
	
	public GraphComponent() {
		// TODO Auto-generated constructor stub
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		this.setPreferredSize(new Dimension(500, 500));
		this.setVisible(true);
		
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
