import java.util.Random;
import java.util.Scanner;

public class tosscoin{
public static void main(String[] args){
    System.out.println("Who are you?");
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    System.out.println("Hello, "+str+"!");

    int head=0,tail=0;
    Random r = new Random();
    for(int i=0;i<3;i++){
        int coin=r.nextInt(2);
        if(coin==0){
        System.out.println("Round " +(i+1)+":"+ " Head");
        head++;
        }
        if(coin==1){
            System.out.println("Round "+(i+1)+" Tail");
            tail++;
        }
    }
    System.out.println("Heads: "+head+", Tails: "+tail);
    if(head>tail) System.out.println(str+" won!");
    if(head<tail) System.out.println(str+" lost!");
}
}
