import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Creating Grid
    stroke(0, 0, 0);
    for(int lineX = 20; lineX <= 200; lineX += 20){
      line(lineX, 0, lineX, 200);
    }
    for(int lineY = 20; lineY <= 200; lineY += 20){
      line(0, lineY, 200, lineY);
    }

    // drawing Circles
    stroke(0, 0, 0);
    fill (212, 15, 125);

    for (int circleY = 30; circleY <= 200; circleY += 35) {
      for (int circleX = 230; circleX <= 400; circleX += 35) {
        ellipse(circleX, circleY, 21, 21);
      }
    }

    // Gradient
    double colour = 0;

    for(int lineX = 0; lineX <= 200; lineX ++){
      line (lineX, 200, lineX, 400);
      
      colour += 1.25;
      stroke ((int)colour, (int)colour, (int)colour);
      
    }

    // draw flower
    fill(220, 93, 52);
    stroke(0, 0, 0);

    pushMatrix(); 
    translate(300, 300); 

    // draw petals
    for (int i = 0; i < 5; i++) {
      rotate(PI / 4); // Rotate by 45 degrees for each petal
      ellipse(0, 0, 125, 20); // Draw petal
    }

    popMatrix(); 

    // Draw middle part of the flower
    fill(38, 108, 45);
    ellipse(300, 300, 40, 40);

  }
}