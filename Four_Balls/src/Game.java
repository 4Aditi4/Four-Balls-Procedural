import processing.core.PApplet;

public class Game extends PApplet
{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x1=0,x2=0,x3=0,x4=0;


    public static void main(String[] args) {
        PApplet.main("Game");
    }
       public void settings()
        {
            super.settings();
            size(WIDTH, HEIGHT); //ctrl+alt+c for extracting constant
        }

    @Override
    public void setup() {
        super.setup();

    }

    @Override
    public void draw() {

       // paintBlack()
        drawCircle();

    }

    private void drawCircle() {
        ellipse(x1,HEIGHT/5,DIAMETER,DIAMETER);
        x1++;
        ellipse(x2,HEIGHT/5*2,DIAMETER,DIAMETER);
        x2+=2;
        ellipse(x3,HEIGHT/5*3,DIAMETER,DIAMETER);
        x3+=3;
        ellipse(x4,HEIGHT/5*4,DIAMETER,DIAMETER);
        x4+=4;
    }

    private void paintBlack() //ctr+alt+M for creating the method
    {
        background(255);
    }
}
