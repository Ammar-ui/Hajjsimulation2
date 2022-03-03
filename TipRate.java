import java.util.Scanner;

public class TipRate{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the subtotal: ");  
        double subtotal = input.nextDouble();
        
        System.out.print("Enter the tip rate: ");
        double rate = input.nextDouble();
        
        double tip = (rate / 100) * subtotal;
        double total = tip + subtotal;
        
        System.out.println("The tip is " + tip + " and the total is " + total + " sr."); 
        
    }
}