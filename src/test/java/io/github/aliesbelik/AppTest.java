package io.github.aliesbelik;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
    @Before
    public void setUp() {
    }

    @Test
    public void testAlwaysTrue() {
        Assert.assertTrue(true);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(49, App.multiply(7, 7));
    }

    @Test
    public void testHelloWorld() {
        App.main(null);
        Assert.assertTrue(true);
    }
}
