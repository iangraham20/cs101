import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class PanelBall extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;
	// Positions on X and Y for the ball, player 1 and player 2
	private int ballX = 10, ballY = 100, player1X=10, player1Y=100, player2X=230, player2Y=100;
	Thread thread;
	int right=5;
	int left= -5; //to the left
	int upward=5; // upward
	int downward= -5; // down
	int width, height; // Width and height of the ball
	// Scores
	int contPlay1=0, contPlay2=0;
	boolean player1FlagArr,player1FlagAba, player2FlagArr, player2FlagAba;
	boolean game, gameOver;

	public PanelBall(){
		game=true;
		thread=new Thread(this);
		thread.start();
	}

	// Draw ball and ships
	public void paintComponent(Graphics gc){
		setOpaque(false);
		super.paintComponent(gc);

		// Draw ball
		gc.setColor(Color.black);
		gc.fillOval(ballX, ballY, 8,8);

		// Draw ships
		gc.fillRect(player1X, player1Y, 10, 25);
		gc.fillRect(player2X, player2Y, 10, 25);

		//Draw scores
		gc.drawString("Jugador1: "+contPlay1, 25, 10);
		gc.drawString("Jugador2: "+contPlay2, 150, 10);

		if(gameOver)
		gc.drawString("Game Over", 100, 125);
	}

	// Positions on X and Y for the ball
	public void drawBall (int nx, int ny) {
		ballX= nx;
		ballY= ny;
		this.width=this.getWidth();
		this.height=this.getHeight();
		repaint();
	}

	// Here we receive from the game container class the key pressed
	public void keyPressed(KeyEvent evt) {
	switch(evt.getKeyCode()) {
		// Move ship 1
		case KeyEvent.VK_W :
		player1FlagArr = true;
		break;
		case KeyEvent.VK_S :
		player1FlagAba = true;
		break;

		// Move ship 2
		case KeyEvent.VK_UP:
		player2FlagArr=true;
		break;
		case KeyEvent.VK_DOWN:
		player2FlagAba=true;
		break;
		}
	}

	// Here we receive from the game container class the key released
	public void keyReleased(KeyEvent evt) {
	switch(evt.getKeyCode()) {
		// Mover Nave1
		case KeyEvent.VK_W :
		player1FlagArr = false;
		break;
		case KeyEvent.VK_S :
		player1FlagAba = false;
		break;

		// Mover nave 2
		case KeyEvent.VK_UP:
		player2FlagArr=false;
		break;
		case KeyEvent.VK_DOWN:
		player2FlagAba=false;
		break;
		}
	}

	// Move player 1
	public void movePlayer1() {
		if (player1FlagArr == true && player1Y >= 0)
		player1Y += downward;
		if (player1FlagAba == true && player1Y <= (this.getHeight()-25))
		player1Y += upward;
		drawPlayer1(player1X, player1Y);
	}

	// Move player 2
	public void movePlayer2() {
		if (player2FlagArr == true && player2Y >= 0)
		player2Y += downward;
		if (player2FlagAba == true && player2Y <= (this.getHeight()-25))
		player2Y += upward;
		drawPlayer2(player2X, player2Y);
	}

	// Position on Y for the player 1
	public void drawPlayer1(int x, int y) {
		this.player1X=x;
		this.player1Y=y;
		repaint();
	}
	// Position on Y for the player 2
	public void drawPlayer2(int x, int y) {
		this.player2X=x;
		this.player2Y=y;
		repaint();
	}

	public void run() {
		// TODO Auto-generated method stub
		boolean izqDer=false;
		boolean arrAba=false;

		while(true) {
			if(game) {
			// The ball move from left to right
			if (izqDer) {
				// a la right
				ballX += right;
				if (ballX >= (width - 8)) {
				izqDer= false;
				}
			} else {
			// a la left
			ballX += left;
			if ( ballX <= 0) {
			izqDer = true;
			}
		}


		// The ball moves from up to down
		if (arrAba)
		{
		// hacia upward
		ballY += upward;
		if (ballY >= (height - 8))
		arrAba= false;

		}
		else
		{
		// hacia downward
		ballY += downward;
		if ( ballY <= 0)
		arrAba = true;
		}
		drawBall(ballX, ballY);

		// Delay
		try
		{
		Thread.sleep(50);
		}
		catch(InterruptedException ex)
		{

		}

		// Move player 1
		movePlayer1();

		// Move player 2
		movePlayer2();

		// The score of the player 1 increase
		if (ballX >= (width - 8))
		contPlay1++;

		// The score of the player 2 increase
		if ( ballX == 0)
		contPlay2++;

		// Game over. Here you can change 6 to any value
		// When the score reach to the value, the game will end
		if(contPlay1==6 || contPlay2==6){
		game=false;
		gameOver=true;
		}

		// The ball stroke with the player 1
		if(ballX==player1X+10 && ballY>=player1Y && ballY<=(player1Y+25))
		izqDer=true;

		// The ball stroke with the player 2
		if(ballX==(player2X-5) && ballY>=player2Y && ballY<=(player2Y+25))
		izqDer=false;
		}
		}
	}

}