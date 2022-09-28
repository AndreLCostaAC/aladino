package magicLamp;

public class Lamp {
    //Properties-------------------------------------------------------
    private int limitGenies;
    private int numOfRubs;



    //Methods----------------------------------------------------------
    //GERADOR DE GENIUS-----
    public Genie rubEffect() {
        int genius = (int) (Math.random() * 2);
        if (genius == 0 && numOfRubs < limitGenies) {
           FriendlyGenie friendly = new FriendlyGenie(3);
            return friendly;
        }
        if(genius ==1 && numOfRubs <limitGenies){
            GrumpyGenie grumpy = new GrumpyGenie(1);
            return grumpy;
        }
        RecyclableDemon demon = new RecyclableDemon(2);
        return demon;
    }


    public Lamp(int limitGenies){
        this.limitGenies = limitGenies;
        this.numOfRubs = numOfRubs;
    }
    public int getRubs() {
        return numOfRubs;
    }
    public Genie getRubEffect(){
        return rubEffect();
    }



    public void rechargeGenies(){
    }

    //Getters+Setters--------------------------------------------------



}

