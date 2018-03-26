/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stores;

import Drinks.MEX.*;
import cocktail.Drink;

/**
 *
 * @author Bruno
 */
public class AntroMex extends Store{

    @Override
    protected Drink createDrink(int type) {
        
        switch(type){
            case 1:
                return new MartiniMex();
            case 2:
                return new MargaritaMex();
            case 3:
                return new DaiquiriMex();
            case 4:
                return new PinaColadaMex();
            default:
                return null;
        }
    }
    
}