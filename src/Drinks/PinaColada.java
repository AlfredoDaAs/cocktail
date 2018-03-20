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
public class PinaColada extends Drink{
    
    public PinaColada (){
        this.name = "Piña Colada";
        this.price = 48F;
        this.ingredients.add("1 medida de Ron");
        this.ingredients.add("Crema de Coco");
        this.ingredients.add("Jugo de Piña");
    }
}
