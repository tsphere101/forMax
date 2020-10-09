void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(9,OUTPUT);
  pinMode(10,OUTPUT);
  pinMode(11,OUTPUT);
}

#define R 9
#define G 10
#define B 11

void emit_R()
{
  digitalWrite(R,HIGH);
  digitalWrite(G,LOW);
  digitalWrite(B,LOW);
}
void emit_Y()
{
  digitalWrite(R,HIGH);
  digitalWrite(G,HIGH);
  digitalWrite(B,LOW);
}
void emit_G()
{
  digitalWrite(R,LOW);
  digitalWrite(G,HIGH);
  digitalWrite(B,LOW);
}
void emit_C()
{
  digitalWrite(R,LOW);
  digitalWrite(G,HIGH);
  digitalWrite(B,HIGH);
}
void emit_B()
{
  digitalWrite(R,LOW);
  digitalWrite(G,LOW);
  digitalWrite(B,HIGH);
}
void emit_M()
{
  digitalWrite(R,HIGH);
  digitalWrite(G,LOW);
  digitalWrite(B,HIGH);
}




void loop() {

  
  
int Temp = analogRead(A0);
Serial.println(Temp);

if(Temp >= 0 && Temp <= 170) emit_R();
else if(Temp > 170 && Temp <= 340) emit_Y();
else if(Temp > 340 && Temp <= 510) emit_G();
else if(Temp > 510 && Temp <= 680) emit_C();
else if(Temp > 680 && Temp <= 850) emit_B();
else if(Temp > 850 && Temp <= 1023) emit_M();

}
