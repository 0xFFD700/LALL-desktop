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

int R = 127, G = 127, B = 127;

void loop() {
     if (BT.available() > 0) {
    whichSlider(BT.read());
  } 
}

void whichSlider (int slider) {
  switch (slider) {
  case 1: BT.write(1); BT.flush(); while(!BT.available()) {}  R = BT.read();
    break;
  case 2: BT.write(1); BT.flush(); while(!BT.available()) {}  G = BT.read();
    break;
  case 3: BT.write(1); BT.flush(); while(!BT.available()) {}  B = BT.read(); 
    break;
  case 4: BT.write(1); BT.flush(); while(!BT.available()) {} strip.setBrightness(BT.read());
    break;
  }
   setColor();
}

void setColor() {
  for (int j = 0; j <= 60; j++) {
    strip.setPixelColor(j, R, G, B);
  }
  strip.show();
}

