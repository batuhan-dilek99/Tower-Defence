import java.awt.*;
public class deneme extends GameObject {
	deneme(double x, double y, String path){
		super(x, y, path);
	}
	public void move() {
		this.setPosY(getPosY() - 0.01);
	}
	
	public void draw() {
		StdDraw.picture(getPosX(), getPosY(), getPicturePath(), 0.08, 0.1);
	}
	public boolean destroy(deneme a) {
		return true;
	}
	public void animate() {
		//StdDraw.clear();
		draw();
		move();
		StdDraw.show();
		//StdDraw.pause(20);
	}
	
	public void spawn() {
		
	}
}
