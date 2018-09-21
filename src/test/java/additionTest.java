import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class additionTest {

    @Test
    public void add() {
        //Given
        Addition addition = new Addition();
        int expectedResult = 7;

        //When
        int result = addition.add(3, 4);

        //Then
        assertThat(result).isEqualTo(expectedResult);
    }
}