import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TenMinWalkTest {


    @Test
    void should_return_false_if_array_is_empty() {
        assertThat(TenMinWalk.isValid(new char[] {})).isFalse();
    }

    @Test
    void should_return_false_if_array_length_less_than_10() {
        assertThat(TenMinWalk.isValid(new char[] {'s','w','e','n'})).isFalse();
    }

    @Test
    void should_return_false_if_array_length_more_than_10() {
        assertThat(TenMinWalk.isValid(new char[] {'s','w','e','n','s','w','e','n','s','w','e','n'})).isFalse();
    }

    @Test
    void should_return_false_if_the_input_was_nothing_but_directions() {
        assertThat(TenMinWalk.isValid(new char[] {'f','f','h','k','m','n','s','w','w','w'})).isFalse();
    }

    @Test
    void should_return_true_if_north_south_result_will_be_0() {
        assertThat(TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'})).isTrue();
    }

    @Test
    void should_return_false_if_the_north_south_length_array_will_be_8() {
        assertThat(TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s'})).isFalse();
    }

    @Test
    void should_return_false_if_the_north_south_length_array_will_be_12() {
        assertThat(TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s','n','s'})).isFalse();
    }

    @Test
    void should_return_true_if_east_west_result_will_be_0() {
        assertThat(TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e'})).isTrue();
    }
    @Test
    void should_return_false_if_the_west_east_length_array_will_be_8() {
        assertThat(TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e'})).isFalse();
    }

    @Test
    void should_return_false_if_the_west_east_length_array_will_be_12() {
        assertThat(TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'})).isFalse();
    }

}
