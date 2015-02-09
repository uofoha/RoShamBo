package game;

public class Player {

    private Item item;

    public Player(Item item) {
        this.item = item;
    }

    public Player fight(Player opponent) {
        Item winningThrow = item.getWinner(opponent.item);
        return winningThrow == this.item ? this : opponent;
    }
}
