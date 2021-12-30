import java.awt.*;
import java.util.Random;
public class PlayGround {
	public deneme[] enemies = new deneme[5];
	public Player player;
	Color color;
	PlayGround(){
		for (int i = 0; i < 5; i++) {
			Random r = new Random();
			enemies[i] = new deneme(r.nextDouble(), 1, "images/enemy.png");
		}
		StdDraw.setCanvasSize(800, 600);
		player = new Player(0.5, 0.2, "images/player.png");
		color = new Color(29,17,53);
	}
	
	
	
	public void draw() {
		int i = 0;
		while(true) {
			StdDraw.clear(color);
			for (deneme e : enemies) {
				e.animate();
			}
			player.draw();
			player.move();
			if(enemies[i].getPosY() < 0) {
				if(i < 4) { 
					i++;
					continue;
				}
				else {
					i = 0;
					for (int j = 0; j < 5; j++) {
						Random rand = new Random();
						enemies[j].setPosX(rand.nextDouble());
						enemies[j].setPosY(1);
					}
					continue;
				}
			}
			StdDraw.pause(30);
		}
	}
	
}
