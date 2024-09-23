package View;
import java.awt.*;
import javax.swing.JFrame;
public class MainFrame extends JFrame{
	private Background background;
	
	public MainFrame() {
		setTitle("StarCraft RPG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 툴킷을 가져오기
		Dimension screenSize = toolkit.getScreenSize();
		
		background = new Background();
		
		setPreferredSize(new Dimension(screenSize.width,screenSize.height-30));
		pack();
		setVisible(true);
	}
	
	public void playGame() { // 게임 시작 함수
		
		
		drawBackground(0,0);
	}
	
	public void drawBackground(int row, int col) {
		background.setStartPoint(row, col);
		this.add(background);
		repaint();
	}
	
	
}
