 
import ddf.minim.*;
  Minim minim;
  AudioSample sound;


int x = 250;
int speedX = 5;
int y =250;
int speedY = 3;
void setup(){
 
     minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
 size(500,500);
 background(0,0,0);
}

void draw(){
  
  
  
  fill(200,0,0);
  stroke(0,0,0);
  background(0,0,0);
  
  
  x+=speedX;
  
  ellipse(x,y,15,15);
 
  if(x>=500){
    speedX=-speedX;
  }
  if(x<=0){
    speedX=-speedX;
  }
  y+=speedY;
  if(y>=500){
    speedY=-speedY;
    sound.trigger();
  }
  if(y<=0){
    speedY=-speedY;
  }
  rect(mouseX,480,70,20);

    
    
    
    
}
    
  boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;
    }

    
    
