package racingGame.utils;

import org.junit.Test;
import racing.utils.Splitter;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class SplitterTest {
    @Test
    public void 문자열나누기() {
        assertThat(Splitter.splitCarNames("jason,marge,rokkie"), is(new String[]{"jason", "marge", "rokkie"}));
    }
}
