package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessControllerTest {

    @Test
    public void should_return_0_when_given_isExit_given_process_controller_4A0B_and_times_between_0_6(){
        //given
        String result = "4A0B";
        int times = 5;
        ProcessController processController = new ProcessController();
        //when
        int status = processController.isExit(result, times);

        //then
        assertEquals(0, status);
    }

    @Test
    public void should_return_1_when_given_isExit_given_process_controller_1A1B_and_times_is_6(){
        //given
        String result = "1A1B";
        int times = 6;
        ProcessController processController = new ProcessController();
        //when
        int status = processController.isExit(result, times);

        //then
        assertEquals(1, status);
    }

    @Test
    public void should_return_2_when_given_isExit_given_process_controller_1A1B_and_times_between_0_6(){
        //given
        String result = "1A1B";
        int times = 5;
        ProcessController processController = new ProcessController();
        //when
        int status = processController.isExit(result, times);

        //then
        assertEquals(2, status);
    }
}
