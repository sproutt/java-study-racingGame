package racingGame.util;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameUtilTest {

    @Test
    public void isMoveTest() {
        assertThat(RacingGameUtil.isMove(1)).isFalse();
        assertThat(RacingGameUtil.isMove(4)).isTrue();
        assertThat(RacingGameUtil.isMove(8)).isTrue();
    }

    @Test
    public void toWinnerPrintFormatTest() {
        String raw = "a, b, c, ";
        assertThat(RacingGameUtil.toWinnerPrintFormat(raw)).isEqualTo("a, b, c");
    }
}