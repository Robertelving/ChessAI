package model;

/**
 *
 * @author RobertElving
 */
public enum Type {
      
    PAWN(5), ROOK(20),KNIGHT(25), BISHOP(30), QUEEN(50), KING(100);
    private int worth;
    
    private Type(int value){
        this.worth = value;
    }

    public int getWorth() {
        return worth;
    }
 
}
