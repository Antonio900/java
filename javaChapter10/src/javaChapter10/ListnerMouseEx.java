package javaChapter10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListnerMouseEx extends JFrame{
	ListnerMouseEx(){
		setTitle("버튼에 Mouse 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.YELLOW);
		MyMouseListner listener = new MyMouseListner();
		btn.addMouseListener(listener);
		add(btn);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListnerMouseEx();
	}

}
class MyMouseListner implements MouseListener{
	public void mouseEntered(MouseEvent e){
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent e){
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.YELLOW);
	}
	public void mouseClicked(MouseEvent e) {	
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.green); // 버튼 누를때 그린으로
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
}