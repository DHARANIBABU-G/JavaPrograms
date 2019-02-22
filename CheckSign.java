import java.util.Scanner;
class CheckSign{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
if(a<0){     //check the negativity
System.out.println("Negative"); 
}
else if(a==0){   //check the zero
System.out.println("Zero");
}
else{            //check positivity
System.out.println("Positive");
}
}
}
