import java.awt.*;
public class Shot extends GameObject{
    static int counter=0;
    public boolean toRemove;

    double posX, posY, speed = 10;
    static final int size = 6;

    public Shot(Player a) {
        this.posX = a.getPosX();
        this.posY = a.getPosY();
    }

    public void draw() {
    	StdDraw.setPenColor(StdDraw.GREEN);
        //StdDraw.point(posX, posY);
    	StdDraw.filledCircle(posX, posY, 0.005);
        speed = 50;
    }

    public int destroy(deneme e) {
        if(e.getPosX() == posX && e.getPosY() == posY) {
            toRemove=true;
            counter++;
        }
        return counter;
    }
    public void move(){
        draw();
        posY+=0.01;
        /*while(posY > 1) {  // 800 olmayacak
            posX+=0.01;
            posY+=0.01;
        }*/
    }


}
