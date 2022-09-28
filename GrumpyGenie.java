package magicLamp;

public class GrumpyGenie extends Genie {
    //Properties-------------------------------------------------------

    //Methods----------------------------------------------------------
    public GrumpyGenie(int limitWishes) {
        super(limitWishes);
        System.out.println("im a grumpy banana");
    }
    public int grantWish() {
        return super.grantWish();
    }

    public int remainingWish() {
        super.remainingWish();
        return -1;
    }
        //Getters+Setters------------------------------------------------

    @Override
    public int getLimitWishes() {
        return super.getLimitWishes();
    }
}
