package com.epam;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AppTest{
    @Test
    public void testForPlagiarism(){
        String name = new App().getName();
        assertThat("ДЗ списане)", name, is("Богдан Пухальський"));
    }
}
