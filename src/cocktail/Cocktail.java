/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail;

import Stores.AntroGDL;
import Stores.AntroMEX;
import Stores.AntroMTY;
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
        Store antro;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What store is this?");
        System.out.println("1.- Guadalajara");
        System.out.println("2.- CDMX");
        System.out.println("3.- Monterrey");
        
        cant = scan.nextInt();
        
        if(cant == 1){
            antro = new AntroGDL();
        }
        else if(cant == 2){
            antro = new AntroMEX();
        }
        else if(cant == 3){
            antro = new AntroMTY();
        }
        else{
            System.out.println("Default store chosen (GDL)...");
            antro = new AntroGDL();
        }
        
        if(cant == 1){
            System.out.println("-----Menu GDL-----");
        }
        else if(cant == 2){
            System.out.println("-----Menu CDMX-----");
        }
        else if(cant == 3){
            System.out.println("-----Menu MTY-----");
        }
        else{
            System.out.println("-----Menu GDL-----");
        }
        
        System.out.println("1.- Martini");
        System.out.println("2.- Margarita");
        System.out.println("3.- Daiquiri");
        System.out.println("4.- Piña Colada");
        System.out.println("");
        
        System.out.println("How many drinks?");
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
