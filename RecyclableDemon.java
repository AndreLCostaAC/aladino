package magicLamp;

public class RecyclableDemon extends Genie{

    //Properties-------------------------------------------------------

    //Methods----------------------------------------------------------
    public RecyclableDemon(int limitWishes) {
        super(limitWishes);
        System.out.println("Im demon banana");
        }
    public int grantWish() {
        return super.grantWish();
    }

    //Getters+Setters--------------------------------------------------
}
