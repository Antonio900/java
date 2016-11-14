package javaChapter10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListnerMouseEx extends JFrame{
	ListnerMouseEx(){
		setTitle("��ư�� Mouse �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Mouse Event �׽�Ʈ ��ư");
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
		btn.setBackground(Color.green); // ��ư ������ �׸�����
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
}