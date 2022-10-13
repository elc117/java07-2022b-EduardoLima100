public class MyTurtle extends BaseTurtle {
    public MyTurtle(){
        super();
    }
    public void myDraw(){
        this.pen.up();
        this.moveTo(-2.5,-5);
        this.pen.down();
        this.face(0);
        this.setDelay(200);
        this.pen.setColor(255, 0, 0);
        this.forward(5);
        int i;
        for(i=0; i < 2; i++){
            this.face(90);
            this.forward(2);
            this.face(180);
            this.forward(3);
            this.face(90);
            this.forward(2);
            this.face(0);
            this.forward(3);
        }
        this.face(90);
        this.forward(2);
        this.face(180);
        this.forward(5);
        this.face(270);
        this.forward(10);       
    }
}
