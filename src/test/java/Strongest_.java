import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(org.junit.runners.Parameterized.class)
public class Strongest_ {

    private Strongest strongest;
    private final int[] array;
    private final int number;

    public Strongest_(int[] array, int number) {
        this.array = array;
        this.number = number;
    }

    @Before
    public void setUp() {
        strongest = new Strongest();
    }

    @Test
    public void execute() {
        assertThat(strongest.of(array)).isEqualTo(number);
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
                {new int[]{}, 0},
                {new int[]{1, 2, 3}, 0},
                {new int[]{1}, 0},
                {new int[]{2, 2}, 0},
                {new int[]{2, 1}, 0},
                {new int[]{-1, 0}, 0},
                {new int[]{1, 2}, 2},
                {new int[]{5, 10}, 8},
                {new int[]{48, 56}, 48},
        };
    }

}