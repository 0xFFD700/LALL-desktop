//include and initialize bluetooth and LED strip
#include <SoftwareSerial.h>
SoftwareSerial BT(10,11);

#include <Adafruit_NeoPixel.h>
Adafruit_NeoPixel strip = Adafruit_NeoPixel(60, 6, NEO_GRB + NEO_KHZ800);

void setup() {
  strip.begin();
  strip.setBrightness(50);
  strip.show();
  BT.begin(9600);
  BT.println("Connected");
}

//RGB colors
int R = 127, G = 127, B = 127;

//read slider
void loop() {
  if (BT.available() > 0) {
    whichSlider(BT.read());
  } 
}

//give feedback and set new RGB colors
void whichSlider (int slider) {
  BT.write(1); 
  BT.flush(); 
  while(!BT.available()) {
  }
  switch (slider) {
  case 1: 
    R = BT.read();
    break;
  case 2: 
    G = BT.read();
    break;
  case 3: 
    B = BT.read(); 
    break;
  case 4: 
    strip.setBrightness(BT.read());
    break;
  }
  setColor();
}

//set strip to new values
void setColor() {
  for (int j = 0; j <= 60; j++) {
    strip.setPixelColor(j, R, G, B);
  }
  strip.show();
}


