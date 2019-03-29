int x1 = 200;
int x2 = 600; 

int speed1 = +1;
int speed2 = -1;


void setup () {
  
 size (800, 500);
 
}


void draw () {
  background(200,200,200);
  int s = 0;
 for(int i = 0; i<50; i++) {
  s = s + 10;
  int t = 400 - s;
  noFill();
 ellipse (x1, 250, t, t);
 }
 
 int x = 0;
 for(int v = 0; v<50; v++) {
  x = x + 10;
  int h = 400 - x;
  noFill();
 ellipse (x2, 250, h, h);
 }


 x1+=speed1;
 if(x1>600 || x1<200) {
 speed1 = -speed1;
 }
 

 x2+=speed2;
 if(x2>600 || x2<200) {
 speed2 = -speed2;
 }
 }
 
 
 
 
 
 
 
 
 
 
 
 

 