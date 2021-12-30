import java.awt.*;
public class Player extends GameObject {
	boolean exploding, destroyed;

    Player(double posX, double posY, String path ) {
        super(posX, posY, path);
    }

    /*public Shot shoot() {
            return new Shot(posX + size / 2 - Shot.size / 2, posY - Shot.size);
    }*/

    public boolean destroy(deneme other) {
        if(super.getPosX() == other.getPosX() && super.getPosY() == other.getPosY()) {
            destroyed = true; 
        }
        else {
        	destroyed = false;
        }
        return destroyed;

    }
    public void draw() {
    	//StdDraw.clear();
        StdDraw.picture(super.getPosX(), super.getPosY(), super.getPicturePath(), 0.08, 0.1 );
        StdDraw.show();
        //StdDraw.pause(20);
    }
    public void move(){
        super.setPosX(StdDraw.mouseX());
    }
}
