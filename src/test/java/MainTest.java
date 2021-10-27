import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testMyMethod()
    {
        Main Obj = new Main();
        String input = "3, Fizz\n5, Bizz\n\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(" 1 2  Fizz 4  Bizz  Fizz 7 8  Fizz  Bizz 11  Fizz 13 14  Fizz  Bizz 16 17  Fizz 19  Bizz  Fizz 22 23  Fizz  Bizz 26  Fizz 28 29  Fizz  Bizz 31 32  Fizz 34  Bizz  Fizz 37 38  Fizz  Bizz 41  Fizz 43 44  Fizz  Bizz 46 47  Fizz 49  Bizz  Fizz 52 53  Fizz  Bizz 56  Fizz 58 59  Fizz  Bizz 61 62  Fizz 64  Bizz  Fizz 67 68  Fizz  Bizz 71  Fizz 73 74  Fizz  Bizz 76 77  Fizz 79  Bizz  Fizz 82 83  Fizz  Bizz 86  Fizz 88 89  Fizz  Bizz 91 92  Fizz 94  Bizz  Fizz 97 98  Fizz", Main.main(null));

    }
}