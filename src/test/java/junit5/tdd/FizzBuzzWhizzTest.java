package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzWhizzTest {

    @Test
    void should_return_1_when_count_of_given_1() {
        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int number = 1;

        //when
        String result = fizzBuzzWhizz.countOf(number);

        //then
        assertEquals("1", result);
    }

    @Test
    void should_return_Fizz_when_count_of_given_3() {
        //given
        int number = 3;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String result = fizzBuzzWhizz.countOf(number);

        //then
        assertEquals("Fizz", result);
    }

    @Test
    void should_return_Buzz_when_count_of_given_5() {
        //given
        int number = 5;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String result = fizzBuzzWhizz.countOf(number);

        //then
        assertEquals("Buzz", result);
    }
}
