package rpg_diceroll;

import java.util.Random;

/**
 *
 * That is the code to generate the number of the dice 
 * 
 * 
 * 
 * @author caiop
 */
public class DiceRoll {
    
    int v; //v = last roll;
    
    public DiceRoll(){}
    
    Random rd = new Random();
    
    
    
    public int roll(int x){
        
        v = rd.nextInt(x) + 1;
        
        return v;
    }

    
    //Gets Sets
    public int getV() {
        return v;
    }
    public void setV(int v) {
        this.v = v;
    }
    
    
    
}
