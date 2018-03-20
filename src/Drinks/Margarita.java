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
public class Margarita extends Drink{
    
    public Margarita (){
        this.name = "Margarita";
        this.price = 50F;
        this.ingredients.add("1 medida de Tequila");
        this.ingredients.add("jugo de 1 limón");
        this.ingredients.add("1 medida de Cointreau");
    }
}
