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

}
