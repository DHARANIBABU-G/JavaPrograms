import java.util.Scanner;    //import library files
class CheckSign{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);        //get the input
int a=scan.nextInt();           //store input in variable
if(a<0){     //check the negativity
System.out.println("Negative");    //print the output
}
else if(a==0){   //check the zero
System.out.println("Zero");
}
else{            //check positivity
System.out.println("Positive");
}
}
}
