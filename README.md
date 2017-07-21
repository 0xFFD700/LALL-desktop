# 💡 LALL
### Minimalist Java desktop tool to control a LED strip with an Arduino over Bluetooth. 

 :heavy_exclamation_mark: hardcoded device adress

### Components
* [Arduino Uno](https://www.arduino.cc/en/Main/arduinoBoardUno)
* [Digital RGB LED Strip - 60 LED](https://www.adafruit.com/product/1138)
* [HC-06 4 Pin Serial Wireless Bluetooth RF Transceiver Module](https://www.sunfounder.com/bluetooth-transceiver-module-hc-06-rs232-4-pin-serial.html)
* Bluetooth enabled Laptop/Computer (does not support OSX)

### Setup
1. Connect the LED strip to the Arduino 
   * GND --> GND
   * D0/D1 --> ~6
   * 5V --> 5V
2. Connect Bluetooth module
   * +5V --> 3,3V
   * GND --> GND
   * TX -> ~10
   * RX --> ~11
3. Upload Arduino [code](https://github.com/0xFFD700/LALL-desktop/blob/master/ArduinoCode/ArduinoCode.ino) to the Arduino 
4. Change hardcoded [deviceadress](https://github.com/0xFFD700/LALL-desktop/blob/master/src/BlueCove_SP.java) (line 18)
5. Run LALL-desktop
