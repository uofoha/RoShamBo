package game;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GameTest {

    @Test
    public void shouldWinIfPlayingAgainstScissors() {
        Player player1 = new Player(Item.Rock);
        Player player2 = new Player(Item.Scissors);

        Game game = new Game(player1, player2);
        Player winner = game.start();

        assertThat(winner, is(player1));
    }

    @Test
    public void shouldLoseIfPlayingAgainstPaper() {
        Player player1 = new Player(Item.Rock);
        Player player2 = new Player(Item.Paper);

        Game game = new Game(player1, player2);
        Player winner = game.start();

        assertThat(winner, is(player2));
    }
}
