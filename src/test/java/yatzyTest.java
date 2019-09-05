import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class yatzyTest {
    @Test
    void shouldCalculateForOnes() {
        assertEquals(0, scoreOnes("ONES", new int[] { 2, 3, 4, 5, 6 }));
        assertEquals(3, scoreOnes("ONES", new int[] { 2, 1, 4, 1, 1 }));
        assertEquals(5, scoreOnes("ONES", new int[] { 1, 1, 1, 1, 1 }));
    }

    private int scoreOnes(String category, int[] dice) {
        int dieValue = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                dieValue++;
            }
        }
        return dieValue;
    }

    @Test
    void shouldCalculateForTwos() {
        assertEquals( 0, scoreTwos("TWOS", new int[] { 1, 3, 4, 5, 6}));
        assertEquals( 6, scoreTwos("TWOS", new int[] { 2, 2, 2, 5, 6}));
        assertEquals( 10, scoreTwos("TWOS", new int[] { 2, 2, 2, 2, 2}));
    }

    private int scoreTwos(String category, int[] dice) {
        int dieValue = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 2) {
                dieValue+=2;
            }
        }
        return dieValue;
    }

    @Test
    void shouldCalculateForThrees() {
        assertEquals( 0, scoreThrees("THREES", new int[] { 1, 2, 4, 5, 6}));
        assertEquals( 3, scoreThrees("THREES", new int[] { 3, 3, 3, 5, 6}));
        assertEquals( 5, scoreThrees("THREES", new int[] { 3, 3, 3, 3, 3}));
    }

    private int scoreThrees(String category, int[] dice) {
    }
}


