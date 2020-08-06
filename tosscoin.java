import java.util.Random;
import java.util.Scanner;

public class tosscoin{
public static void main(String[] args){

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
}
}
