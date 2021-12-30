import java.awt.*;
public class deneme extends GameObject {       //It means enemy
	deneme(double x, double y, String path){
		super(x, y, path);
	}
	public void move() {
		this.setPosY(getPosY() - 0.01);
	}
	
	public void draw() {
		StdDraw.picture(getPosX(), getPosY(), getPicturePath(), 0.08, 0.1);
		//Collision test
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.rectangle(getPosX(), getPosY(), 0.04, 0.05);
	}
	public int destroy(deneme a) {
		return 1;
	}
	public void animate() {
		
		draw();
		move();
	}
	
	public void spawn() {
		
	}
}
