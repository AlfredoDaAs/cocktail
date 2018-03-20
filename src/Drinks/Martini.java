/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drinks;

/**
 *
 * @author alfre
 */
public class Martini extends Drink{
    
    public Martini (){
        this.name = "Martini";
        this.price = 40F;
        this.ingredients.add("1 medida de Vodka");
        this.ingredients.add("1 medida de Vermouth");
        this.ingredients.add("1 aceituna");
    }
}
