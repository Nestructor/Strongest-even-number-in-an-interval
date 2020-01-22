import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Strongest_ {

    private Strongest strongest;

    @Before
    public void setUp() {
        strongest = new Strongest();
    }

    @Test
    public void given_empty_array_should_return_0() {
        assertThat(strongest.of(new int[]{})).isEqualTo(0);
    }

    @Test
    public void given_less_or_more_than_two_elements_should_return_0() {
        assertThat(strongest.of(new int[]{1, 2, 3})).isEqualTo(0);
        assertThat(strongest.of(new int[]{1})).isEqualTo(0);
    }

    @Test
    public void given_second_element_less_or_equal_than_previous_should_return_0() {
        assertThat(strongest.of(new int[]{2, 2})).isEqualTo(0);
        assertThat(strongest.of(new int[]{2, 1})).isEqualTo(0);
    }

    @Test
    public void given_first_number_negative_should_return_0() {
        assertThat(strongest.of(new int[]{-1, 0})).isEqualTo(0);
    }

    @Test
    public void given_1_2_should_return_0() {
        assertThat(strongest.of(new int[]{1, 2})).isEqualTo(2);
    }

    @Test
    public void given_5_10_should_return_0() {
        assertThat(strongest.of(new int[]{5, 10})).isEqualTo(8);
    }

    @Test
    public void given_48_56_should_return_0() {
        assertThat(strongest.of(new int[]{48, 56})).isEqualTo(48);
    }

}
