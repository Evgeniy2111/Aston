package org.example;


import org.junit.jupiter.api.Test;

public class PrePayPageTest extends ConfingTest {

    @Test
    public void booleanStringTest() {
        PrePayPage prePayPage = new PrePayPage();
        prePayPage.booleanString();
    }

    @Test
    public void inputDataUserTest() {
        PrePayPage prePayPage = new PrePayPage();
        prePayPage.inputDataUser("297777777", "10");
    }
}
