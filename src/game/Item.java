package game;


public enum Item {

    Rock("Scissors"), Paper("Rock"), Scissors("Paper");
    private String winsAgainst;


    Item(String winsAgainst) {
        this.winsAgainst = winsAgainst;
    }

    public Item getWinner(Item opponentThrow) {
        if(this.winsAgainst.equals(opponentThrow.name())) {
            return this;
        }

        return opponentThrow;
    }
}
