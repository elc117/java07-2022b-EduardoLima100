public class MyMain {
	public static void main(String[] args) {

		MyTurtle t = new MyTurtle();
		
		Pen p = new Pen();
		t.setPen(p);

		TurtleView view = new SwingTurtleView();
		t.setView(view);

		view.initialize();
		t.myDraw();

	}
} 