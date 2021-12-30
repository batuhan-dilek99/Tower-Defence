import java.awt.*;
abstract public class GameObject {
	private double posX;
	private double posY;
	private Rectangle hitbox;
	private String picturePath;
	
	GameObject(){
		posX = 0;
		posY = 0;
		hitbox = null;
	}
	
	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	GameObject(double x, double y, String path){
		this.posX = x;
		this.posY = y;
		//hitbox = new Rectangle(x, y, 0.4, 0.4);
		this.picturePath = path;
	}
	
	abstract public void move();
	abstract public void draw();
	abstract public boolean destroy(deneme a);
}
