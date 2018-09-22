  boolean b = true;
PImage minecraft;
int y;
int x;
 PImage creeper;
void setup(){
  size(1900,1900);
  
minecraft = loadImage("creeper.png"); 
creeper=loadImage("creeperhead.png");
creeper.resize(20, 20);
minecraft.resize(width, height);
}




void draw(){

  


background(minecraft);


if(mousePressed){
  fill(255,0,0);
  ellipse(mouseX, mouseY, 15, 15);
  x = mouseX;
  b = false;
   y = mouseY;
  
System.out.println(mouseX);
System.out.println(mouseY);
System.out.println(x);
System.out.println(y);}
image(creeper, x,y);


 if(b){
  image(creeper, mouseX, mouseY);
  }


}