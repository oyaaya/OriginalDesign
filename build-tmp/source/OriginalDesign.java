import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
size(400, 400);
}
public void draw()
{ 

background(100,100,200);
fill(0, 0, 0);
rect(96,227,207,241,213);//body
fill(255, 220-mouseY, 178);
ellipse(200,169,235,279);//head
fill(255, 255, 255);
ellipse(249,134,100,90);//right eye
ellipse(149,134,100,90);//left eye
fill(0, 0, 0);
ellipse(249,134,15+mouseY/5,15+mouseY/5);
ellipse(149,134,15+mouseY/5,15+mouseY/5);
noFill();
curve(250,255,221,120,282,124,232,278);//righteyebrow
curve(219,214,118,124,177,116,234,268);//lefteyebrow
fill(0, 0, 0);
ellipse(198,185,4,4);//nose
fill(225, 0, 0);
arc(199,222,56,mouseY,0,PI);//tongue
fill(0,0,0);
rect(160, 20, 80, 80,100);
};



  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
