package jp.ac.uryukyu.ie.e185731;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    void TestAnswerNumber(){

        Game ga = new Game();
        assertEquals(1,ga.answerNumber());//とりあえずやってみよう！
    }
}