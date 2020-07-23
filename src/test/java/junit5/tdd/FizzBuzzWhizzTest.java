package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzWhizzTest {

    @Test
     void should_return_1_when_count_of_given_1(){
         //given
         FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
         int number = 1;

         //when
         String result = fizzBuzzWhizz.countOf(number);

         //then
         assertEquals("1", result);
     }
}
