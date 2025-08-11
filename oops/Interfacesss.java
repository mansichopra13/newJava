public class Interfacesss {
    public static void main(String[] args){
        Queen q= new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,daigonal(in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class Kind implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,daigonal(by one step)");
    }
}
/*for multiple inhertance example
 * interface herbivore{
 * 
 * }
 * interface carnivore{
 * 
 * }
 * class bear implements herbivore,carnivore{
 * 
 * }
 */