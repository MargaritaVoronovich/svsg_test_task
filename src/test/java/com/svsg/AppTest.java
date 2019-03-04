package com.svsg;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.Java6Assertions.assertThatThrownBy;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testException() {
        assertThatThrownBy(() -> {
            App.getMinAvailableServer(null);
        });
    }

    @Test
    public void testEmptyList() {
        assertThat(App.getMinAvailableServer(Collections.emptyList())).isEqualTo(1);
    }

    @Test
    public void testSingletonListOne() {
        assertThat(App.getMinAvailableServer(Collections.singletonList(1))).isEqualTo(2);
    }

    @Test
    public void testSingletonListTwo() {
        assertThat(App.getMinAvailableServer(Collections.singletonList(2))).isEqualTo(1);
    }

    @Test
    public void testListStartingFromOne() {
        assertThat(App.getMinAvailableServer(Arrays.asList(1, 2, 4, 6, 8))).isEqualTo(3);
    }

    @Test
    public void testListStartingFromFour() {
        assertThat(App.getMinAvailableServer(Arrays.asList(4, 6, 8))).isEqualTo(1);
    }
}
