import ddf.minim.*;
AudioSample woohooSound;
boolean playSound = true;

PImage donkey;
PImage tail;
int x=0;
int y=0;
void setup(){
  Minim minim = new Minim(this);
  woohooSound = minim.loadSample("homer-woohoo.wav");
  
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");
  
  size(639, 574);
  donkey.resize(639, 574);
  tail.resize(100,100);
  
  textSize(24);
  text("Pin The Tail On This Donkey Or He Will Be In Pain" ,100,20);
}

void draw(){
  background(0,0,0);
image(tail, x, y);
image(tail, x-10, y-20);
rect(0,0,30,30);

//rect(454,75, 40, 40);


if(mousePressed) {
  System.out.println(mouseX + " " + mouseY); 
  if(dist(mouseX, mouseY, 567, 165) < 30){ 
    textSize (24); 
  text("Congrats", 392, 50);
  if(playSound){
    woohooSound.trigger();
    playSound = false;
  }
x= mouseX;
y= mouseY;

}

else{
x= mouseX;
y= mouseY;}

if(dist(0, 0, mouseX, mouseY) < 30){ background (donkey);
}
}
  
  
  
}