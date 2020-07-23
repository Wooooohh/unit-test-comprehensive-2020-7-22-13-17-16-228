package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberGameTest {

    @Test
    public void should_return (){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        int[] answer = {1,2,3,4};
        int[] number = {1,2,3,4};
//        when

        String result = guessNumberGame.generateResult(number, answer);

//        then
        assertEquals("4A0B", result);
    }
}
