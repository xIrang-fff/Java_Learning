//package f09211;

import java.awt.*;
import java.applet.*;
public class MyFirstJava extends Applet{
        public static void main(String args[]){
        System.out.println("My first Java!");
        }
    public void init(){
    }
    public void paint(Graphics g){
    g.drawString("My first Java!",25,25);
    }
}
