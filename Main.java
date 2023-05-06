import java.util.*;
import java.io.*;
import civil.civil;
import cse.cse;
import ele.ele;
import mech.mech;

class Main {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);

    civil i=new civil();
    cse c= new cse();
    ele e=new ele();
    mech m=new mech();
    
    System.out.println("choose stream\n1.Civil Engineering Stream (CV/EV/TR/CC)\n2.CSE Stream Scheme (CSE/ISC/BT) \n3.Electrical Engg Science Streams (EEE/ECE/ETC/BM/IE/ML) \n4.Mechanical Engineering Streams ( AE/AS/AU/ME/IP/IM/CH/SX/TX)");
    int choice=s.nextInt();

    switch(choice){
      case 1: i.i();break;
      case 2: c.c();break;
      case 3: e.e();break;
      case 5: m.m();break;
      
      default:System.out.println("invalid choice!!");break;
    }
  }
}