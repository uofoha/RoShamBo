package game;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PlayerTest {

    @Test
    public void shouldLoseAgainstPaperIfThrowsRock() {
        Player player1 = new Player(Item.Rock);
        Player player2 = new Player(Item.Paper);

        Player winner = player1.fight(player2);

        assertThat(winner, is(player2));
    }

    @Test
    public void shouldWinAgainstScissorsIfThrowsRock() {
        Player player1 = new Player(Item.Rock);
        Player player2 = new Player(Item.Scissors);

        Player winner = player1.fight(player2);

        assertThat(winner, is(player1));
    }

    @Test
    public void shouldWinAgainstPaperIfThrowsScissors() {
        Player player1 = new Player(Item.Scissors);
        Player player2 = new Player(Item.Paper);

        Player winner = player1.fight(player2);

        assertThat(winner, is(player1));
    }

    @Test
    public void shouldLoseAgainstRockIfThrowsScissors() {
        Player player1 = new Player(Item.Scissors);
        Player player2 = new Player(Item.Rock);

        Player winner = player1.fight(player2);

        assertThat(winner, is(player2));
    }

    @Test
    public void shouldLoseAgainstScissorsIfThrowsPaper() {
        Player player1 = new Player(Item.Paper);
        Player player2 = new Player(Item.Scissors);

        Player winner = player1.fight(player2);

        assertThat(winner, is(player2));
    }

    @Test
    public void shouldWinAgainstRockIfThrowsPaper() {
        Player player1 = new Player(Item.Paper);
        Player player2 = new Player(Item.Rock);

        Player winner = player1.fight(player2);

        assertThat(winner, is(player1));
    }
}
