import java.awt.*;
public class Player extends GameObject {
	boolean exploding;
	int destroyed;

    Player(double posX, double posY, String path ) {
        super(posX, posY, path);
    }

    /*public Shot shoot() {
            return new Shot(posX + size / 2 - Shot.size / 2, posY - Shot.size);
    }*/

    public int destroy(deneme other) {
        if(super.getPosX() + super.width / 2 == other.getPosX() - other.width / 2 && super.getPosY() + super.height / 2 == other.getPosY() - other.height / 2) {
        	System.out.println("carp");
            destroyed = 1; 
        }
        else {
        	destroyed = 0;
        }
        return destroyed;

    }
    public void draw() {
    	//StdDraw.clear();
        StdDraw.picture(super.getPosX(), super.getPosY(), super.getPicturePath(), 0.08, 0.1);
        //Collision test
        StdDraw.rectangle(super.getPosX(), super.getPosY(), 0.04, 0.05);
        StdDraw.show();
        //StdDraw.pause(20);
    }
    public void move(){
        super.setPosX(StdDraw.mouseX());
    }
    public Shot shoot() {
    	return new Shot(this);
    	
    }
}
