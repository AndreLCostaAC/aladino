package magicLamp;

public class Genie {
// Properties of Genie----------------------------------------------

    private int limitWishes;
    private String name;


    //Methods----------------------------------------------------------
    public Genie(int limitWishes){
        this.limitWishes = limitWishes;
    }

    public int limitWish(){
        return limitWishes;
    }
    public int grantWish() {
        if (limitWishes == 0) {
            return -1;
        } else return limitWishes--;
    }

    public int remainingWish() {
        return limitWishes - grantWish();
    }

    public static String genieCreator(){
        return "arroz";
    }
    //Getters+Setters--------------------------------------------------
    public int getLimitWishes(){
        return  limitWishes;
    }
    public int getGrantWish(){
        return grantWish();
    }
    public String getGenieCreator(){
        return genieCreator();
    }


}
