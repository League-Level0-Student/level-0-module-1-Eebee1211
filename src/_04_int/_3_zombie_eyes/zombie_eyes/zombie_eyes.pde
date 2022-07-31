
void setup() {
PImage face = loadImage("face.png");
//background(face);
size(500,500);
face.resize(500,500);
image(face, 0, 0);

}
void draw() {
fill(#11F5C5);
  ellipse(140,165,89,75); 
  ellipse(348,148,89,75); 
  fill(mouseX+40/2,mouseX/2,mouseY/2);
  //
  ellipse(140,165,32,32); 
  ellipse(348,148,32,32); 
  println("Mouse X: " + mouseX + "Mouse Y: " + mouseY);
  
  
}
