package magicLamp;

public class FriendlyGenie extends Genie {
    //Properties-------------------------------------------------------
    //Methods----------------------------------------------------------

    public FriendlyGenie(int limitWishes) {
       super(limitWishes);
        System.out.println("im Frindly banana");
    }
    public int grantWish() {
        return super.grantWish();
    }

    public int remainingWish() {
        super.remainingWish();
        return -1;

    }
//Getters+Setters------------------------------------------------
    }

