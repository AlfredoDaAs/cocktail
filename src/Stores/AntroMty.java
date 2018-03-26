/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stores;

import Drinks.MTY.*;
import cocktail.Drink;

/**
 *
 * @author Bruno
 */
public class AntroMty extends Store{

    @Override
    protected Drink createDrink(int type) {
        
        switch(type){
            case 1:
                return new MartiniMty();
            case 2:
                return new MargaritaMty();
            case 3:
                return new DaiquiriMty();
            case 4:
                return new PinaColadaMty();
            default:
                return null;
        }
    }
    
}