package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberGameTest {

    @Test
    public void should_return_4A0B_when_generateResult_given_1234 (){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        int[] answer = {1,2,3,4};
        int[] number = {1,2,3,4};
//        when
        String result = guessNumberGame.generateResult(number, answer);
//        then
        assertEquals("4A0B", result);
    }

    @Test
    public void should_return_0A4B_when_generateResult_given_4321(){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        int[] answer = {1,2,3,4};
        int[] number = {4,3,2,1};
//        when
        String result = guessNumberGame.generateResult(number, answer);
//        then
        assertEquals("0A4B", result);
    }

    @Test
    public void should_return_0A0B_when_generateResult_given_5678(){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        int[] answer = {1,2,3,4};
        int[] number = {5,6,7,8};
//        when
        String result = guessNumberGame.generateResult(number, answer);
//        then
        assertEquals("0A0B", result);
    }

    @Test
    public void should_return_0A2B_when_generateResult_given_3456(){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        int[] answer = {1,2,3,4};
        int[] number = {3,4,5,8};
//        when
        String result = guessNumberGame.generateResult(number, answer);
//        then
        assertEquals("0A2B", result);
    }

    @Test
    public void should_return_1A3B_when_generateResult_given_1423(){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        int[] answer = {1,2,3,4};
        int[] number = {1,4,2,3};
//        when
        String result = guessNumberGame.generateResult(number, answer);
//        then
        assertEquals("1A3B", result);
    }
}
