/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail;

import Drinks.Drink;
import Stores.Antro;
import Stores.Store;
import java.util.Scanner;

/**
 *
 * @author alfre
 */
public class Cocktail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float total = 0;
        int cant, opc;
        Store antro = new Antro();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("-----Menu-----");
        System.out.println("1.- Martini");
        System.out.println("2.- Margarita");
        System.out.println("3.- Daiquiri");
        System.out.println("4.- Piña Colada");
        System.out.println("");
        
        System.out.println("¿How many drinks?");
        cant = scan.nextInt();
        
        if(cant > 0){
            int i = 0;
            do{
                System.out.println("Choose drink num."+(i+1));
                opc = scan.nextInt();
                
                if(opc > 0 && opc < 5){
                    i++;
                    Drink drink = antro.orderDrink(opc);
                    total += drink.getPrice();
                }else{
                    System.out.println("Sorry, thats not valid... try again.");
                }
            }while(i < cant);
            
            System.out.println("Total to pay: $" + total);
        }else{
            System.out.println("I can't sell you that many drinks LOL");
        }
    }
    
}
