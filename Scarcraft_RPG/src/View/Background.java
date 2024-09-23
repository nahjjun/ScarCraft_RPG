package View;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Background extends JPanel{
	private Toolkit kit;
	private int screenWidth;
	private int screenHeight;
	private Image backgroundImg;
	private int currentRow; // 화면 왼쪽 꼭짓점의 row 위치
	private int currentCol; // 화면 왼쪽 꼭짓점의 col 위치
	
	public Background() {
		kit = Toolkit.getDefaultToolkit();
		screenWidth = kit.getScreenSize().width;
		screenHeight = kit.getScreenSize().height-30;
		backgroundImg = kit.getImage("img/배경2.png");
		currentRow=500;
		currentCol=0;
	}
	
	public void setStartPoint(int row, int col) { currentRow=row; currentCol=col;}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// 배경 이미지를 왼쪽 꼭짓점 기준으로 화면 크기에 맞춰서 그린다.
		g.drawImage(backgroundImg, 0, 0, screenWidth, screenHeight, currentRow, currentCol, screenWidth, screenHeight, this); 
		
	}
	
	
	
	
}
