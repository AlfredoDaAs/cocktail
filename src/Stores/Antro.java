/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stores;

import Drinks.Daiquiri;
import Drinks.Drink;
import Drinks.Margarita;
import Drinks.Martini;
import Drinks.PinaColada;

/**
 *
 * @author alfre
 */
public class Antro extends Store{

    @Override
    protected Drink createDrink(int type) {
        
        switch(type){
            case 1:
                return new Martini();
            case 2:
                return new Margarita();
            case 3:
                return new Daiquiri();
            case 4:
                return new PinaColada();
            default:
                return null;
        }
    }
    
}
