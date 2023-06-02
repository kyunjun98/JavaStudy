package Day22.com.ict.edu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Ex05_Main extends JFrame {
	Ex05_Canvas canvas = new Ex05_Canvas();
	public Ex05_Main() {
		
		super("원 찍기");
		add(canvas);
		
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 마우스 이벤트
		// ItemListener, ActionListener처럼 오버라이딩 메서드가 하나가 아닌
		// 2개 이상이면 불필요한 메서드까지 오버라이딩 하게 된다.
		// 이러한 단점을 고친 것이 Adapter()이다.
		/*
		canvas.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		*/
		
		canvas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				canvas.x = e.getX();
				canvas.y = e.getY();
				canvas.repaint();
			}
		});
	}
	public static void main(String[] args) {
		new Ex05_Main();
	}
}