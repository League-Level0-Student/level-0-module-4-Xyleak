int minX = (585 - 35);
int maxX = (585 + 35);
int minY = (590 - 35);
int maxY = (590 +35);
void setup () {
  PImage waldo = loadImage("waldo.jpg"); 

  size(1500, 1500);
  image(waldo, 0, 0);
  doh = minim.loadSample("homer-doh.wav");
  woohoo = minim.loadSample("homer-woohoo.wav");
}

void draw() {

  //int y = (590);
  //int x = (585);

  if (mousePressed) {
    if (mouseX > minX &&
      mouseX<maxX &&
      mouseY >minY &&
      mouseY <maxY ) {
      println("Waldo Found!");
      playWoohoo();
    }else playDoh();}
  }
 
void playWoohoo() {
  woohoo.stop();
  woohoo.trigger();
} 
void playDoh() {
  doh.stop();
  doh.trigger();
}
import ddf.minim.*;
Minim minim = new Minim(this);
AudioSample doh;
AudioSample woohoo;