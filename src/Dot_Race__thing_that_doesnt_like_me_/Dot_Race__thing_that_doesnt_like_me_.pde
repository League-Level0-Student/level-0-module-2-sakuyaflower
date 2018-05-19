int x = 0;
void setup() {
    size(800, 200);
}

void draw() {
  background(100,100,100);
  fill(#6E0595);
 ellipse(x,100,100,100);  
 if(mousePressed){
 x += 10;
playSound(); 
if (x>800);
}
}
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
}