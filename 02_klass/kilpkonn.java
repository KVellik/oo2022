public class kilpkonn{
    private int x, y, suund;
    //suund: 0 -> x++; 1 -> y++; 2 -> x--; 3 -> y--;
    public String toString(){
        return "("+x+", "+y+", suund "+suund+")";
    }

    public int kysiX(){return x;}
    public int kysiY(){return y;}
    public void edasi(){
        if (suund == 0){
            x++;
        }
        if (suund == 1){
            y++;
        }
        if (suund == 2){
            x--;
        }
        if (suund == 3){
            y--;
        }
    }

    public void keera(){
        if (suund == 0){
            suund++;
        }
        else if (suund == 1){
            suund++;
        }
        else if (suund == 2){
            suund++;
        }
        else if (suund == 3){
            suund = 0;
        }
    }
}