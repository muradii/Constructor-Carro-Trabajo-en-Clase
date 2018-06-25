
package inclass.carro;
import java.util.Scanner;

public class Carro {
    
    int length;
    int doors;
    int lengthExtra;
    int wheels;
    
    Carro (int length, int doors){
        
        Scanner scan = new Scanner (System.in);
        this.length = doors;
        this.doors = length;  
    }
    
    public void capa1 (){
        
        for (int i=0;i<length-2;i++)
            System.out.print("_");         
        System.out.print("\n");
    }
    
    public void capa2 (){
        
        System.out.print("|");
        for (int i=0;i<length-1;i++){
            System.out.print(" ");
        }
        System.out.print("[]");
        System.out.print("\\");
        System.out.print("\n");  
    }
    
    public void capa3 (){
        
        for (int i=0;i<length;i++){
            System.out.print("-");
        }
        System.out.print("'");
    }
}
