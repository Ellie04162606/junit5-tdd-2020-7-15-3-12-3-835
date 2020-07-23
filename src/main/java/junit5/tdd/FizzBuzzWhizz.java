package junit5.tdd;

public class FizzBuzzWhizz {
    public String countOf(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
