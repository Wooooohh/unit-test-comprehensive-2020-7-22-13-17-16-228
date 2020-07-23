package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberGameTest {

    @Test
    public void should_return_4A0B_when_generateResult_given_1234 (){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new FixedAnswerGenerator());
        int[] answer = guessNumberGame.generateAnswer();
        int[] number = {1,2,3,4};
//        when
        String result = guessNumberGame.generateResult(number, answer);
//        then
        assertEquals("4A0B", result);
    }

    @Test
    public void should_return_0A4B_when_generateResult_given_4321(){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new FixedAnswerGenerator());
        int[] answer = guessNumberGame.generateAnswer();
        int[] number = {4,3,2,1};
//        when
        String result = guessNumberGame.generateResult(number, answer);
//        then
        assertEquals("0A4B", result);
    }

    @Test
    public void should_return_0A0B_when_generateResult_given_5678(){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new FixedAnswerGenerator());
        int[] answer = guessNumberGame.generateAnswer();
        int[] number = {5,6,7,8};
//        when
        String result = guessNumberGame.generateResult(number, answer);
//        then
        assertEquals("0A0B", result);
    }

    @Test
    public void should_return_0A2B_when_generateResult_given_3456(){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new FixedAnswerGenerator());
        int[] answer = guessNumberGame.generateAnswer();
        int[] number = {3,4,5,8};
//        when
        String result = guessNumberGame.generateResult(number, answer);
//        then
        assertEquals("0A2B", result);
    }

    @Test
    public void should_return_1A3B_when_generateResult_given_1423(){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new FixedAnswerGenerator());
        int[] answer = guessNumberGame.generateAnswer();
        int[] number = {1,4,2,3};
//        when
        String result = guessNumberGame.generateResult(number, answer);
//        then
        assertEquals("1A3B", result);
    }

    @Test
    public void should_return_1A1B_when_generateResult_given_7514(){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new FixedAnswerGenerator());
        int[] answer = guessNumberGame.generateAnswer();
        int[] number = {7,5,1,4};
//        when
        String result = guessNumberGame.generateResult(number, answer);
//        then
        assertEquals("1A1B", result);
    }

    @Test
    public void should_return_1A0B_0A2B_1A2B_0A0B_0A4B_4A0B_when_play_game_given_1567_2478_0324_5678_4321_1234(){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new FixedAnswerGenerator());
        int[][] number = {{1,5,6,7},{2,4,7,8},{0,3,2,4},{5,6,7,8},{4,3,2,1},{1,2,3,4}};
        String expected = "1A0B\n0A2B\n1A2B\n0A0B\n0A4B\n4A0B";
//        when
        String result = guessNumberGame.playGame(number);
//        then
        assertEquals(expected, result);

    }

    @Test
    public void should_return_1A0B_0A2B_1A2B_0A0B_0A4B_4A0B_when_play_game_given_1567_2478_0324_5678_4321_1f932(){
//        given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new FixedAnswerGenerator());
        int[][] number = {{1,5,6,7},{2,4,7,8},{0,3,2,4},{5,6,7,8},{4,3,2,1},{1,-1,3,2}};
        String expected = "1A0B\n0A2B\n1A2B\n0A0B\n0A4B\nWrong Input，Input again";
//        when
        String result = guessNumberGame.playGame(number);
//        then
        assertEquals(expected, result);

    }
}
