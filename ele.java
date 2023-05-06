package ele;
import java.util.*;

public class ele{
 double s1,s2,s3,s4,s5,s6,s7,s8;
  double r1,r2,r3,r4,r5,r6,r7,r8;
  double res;

  Scanner c3=new Scanner(System.in);

public void e(){
    System.out.print("BMATC101:");
    s1=c3.nextDouble();
    if(s1>=90){
      r1=10*4;
    }
    else if (s1>=80){
      r1=9*4;
    }
    else if (s1>=70){
      r1=8*4;
    }
    else if (s1>=60){
      r1=7*4;
    }
    else if (s1>=50){
      r1=6*4;
    }
    else if (s1>=40){
      r1=5*4;
    }
    else if (s1>=35){
      r1=4*4;
    }else{
      r1=0;
    }
    System.out.print("BPHYE102/ BCHEE102:");
     s2=c3.nextDouble();
    if(s2>=90){
      r2=10*4;
    }
    else if (s2>=80){
      r2=9*4;
    }
    else if (s2>=70){
      r2=8*4;
    }
    else if (s2>=60){
      r2=7*4;
    }
    else if (s2>=50){
      r2=6*4;
    }
    else if (s2>=40){
      r2=5*4;
    }
    else if (s2>=35){
      r2=4*4;
    }else{
      r2=0;
    }
    System.out.print("BEEE103/ BCEDK103:");
     s3=c3.nextDouble();
    if(s3>=90){
      r3=10*3;
    }
    else if (s3>=80){
      r3=9*3;
    }
    else if (s3>=70){
      r3=8*3;
    }
    else if (s3>=60){
      r3=7*3;
    }
    else if (s3>=50){
      r3=6*3;
    }
    else if (s3>=40){
      r3=5*3;
    }
    else if (s3>=35){
      r3=4*3;
    }else{
      r3=0;
    }
    System.out.print("BESCK104x:");
     s4=c3.nextDouble();
    if(s4>=90){
      r4=10*3;
    }
    else if (s4>=80){
      r4=9*3;
    }
    else if (s4>=70){
      r4=8*3;
    }
    else if (s4>=60){
      r4=7*3;
    }
    else if (s4>=50){
      r4=6*3;
    }
    else if (s4>=40){
      r4=5*3;
    }
    else if (s4>=35){
      r4=4*3;
    }else{
      r4=0;
    }
    System.out.print("BETCK105x/ BPLCK105x:");
     s5=c3.nextDouble();
    if(s5>=90){
    r5=10*3;
    }
    else if (s5>=80){
      r5=9*3;
    }
    else if (s5>=70){
      r5=8*3;
    }
    else if (s5>=60){
      r5=7*3;
    }
    else if (s5>=50){
      r5=6*3;
    }
    else if (s5>=40){
      r5=5*3;
    }
    else if (s5>=35){
      r5=4*3;
    }else{
      r5=0;
    }
    System.out.print("BENGK106:");
    s6=c3.nextDouble();
    if(s6>=90){
      r6=10*1;
    }
    else if (s6>=80){
      r6=9*1;
    }
    else if (s6>=70){
      r6=8*1;
    }
    else if (s6>=60){
      r6=7*1;
    }
    else if (s6>=50){
      r6=6*1;
    }
    else if (s6>=40){
      r6=5*1;
    }
    else if (s6>=35){
      r6=4*1;
    }else{
      r6=0;
    }
    System.out.print("BKSKK107/BKBKK107/BICOK107:"); 
    s7=c3.nextDouble();
    if(s7>=90){
      r7=10*1;
    }
    else if (s7>=80){
      r7=9*1;
    }
    else if (s7>=70){
      r7=8*1;
    }
    else if (s7>=60){
     r7=7*1;
    }
    else if (s7>=50){
      r7=6*1;
    }
    else if (s7>=40){
      r7=5*1;
    }
    else if (s7>=35){
     r7=4*1;
    }else{
      r7=0;
    }
    System.out.print("BIDTK158/BSFHK158:");
    s8=c3.nextDouble();
    if(s8>89){
     r8=10*1;
    }
    else if (s8>79){
      r8=9*1;
    }
    else if (s8>69){
      r8=8*1;
    }
    else if (s8>59){
      r8=7*1;
    }
    else if (s8>49){
      r8=6*1;
    }
    else if (s8>39){
      r8=5*1;
    }
    else if (s8>34){
      r8=4*1;
    }else{
      r8=0;
    }
    res=(r1+r2+r3+r4+r5+r6+r7+r8)/20;
    System.out.println("SGPA ="+res);
    
  }
}
