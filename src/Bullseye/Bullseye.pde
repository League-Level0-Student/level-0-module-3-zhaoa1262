void setup () {
 size (1000, 1000);
 
}

void draw () {
  int s = 0;
 for(int i = 0; i<8; i++) {
  s = s + 100;
 ellipse (500, 500, 800 - s, 800 - s);
  }
}

// 8 ellipses total