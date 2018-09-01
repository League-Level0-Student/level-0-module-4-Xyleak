PImage name;
void setup(){
size(1000,1000);
 name = loadImage("Easy_Name.png");
name.resize(1000,1000);

}

int y = 428;
int x = 419;
int x2 =581;
int y2 =428;
void draw(){
 image(name,0, 0 );
 /* float leftEyeX = mouseX;
  if(leftEyeX > 450){
    leftEyeX = 450;
  }
  if(leftEyeX < 430){
    leftEyeX = 430;
  }
  */

     //y=mouseY;
     x = mouseX;
     if(mouseX < 396){
       x = 396+15;
     }
     else if(mouseX > 437){
      x = 437-15;
       
     }
  y= mouseY;
  if(mouseY < 398){
    y = 398+15;
  }
  else if(mouseY > 470){
    y = 470-15;
  }
  
x2 = mouseX;
     //y=mouseY;
     if(mouseX < 559){
       x2 = 559+15;
     }
     else if(mouseX > 612){
      x2 = 612-15;
       
     }
  y2= mouseY;
  if(mouseY < 400){
    y2 = 398+15;
  }
  else if(mouseY > 470){
    y2 = 470-15;
  }
     fill(0,0,0);
     ellipse(x,y,30,30);
     
      fill(0,0,0);
     ellipse(x2,y2,30,30);
     
if(mousePressed){
System.out.println(mouseX +","+ mouseY);

}
}