package com.epam;

import com.epam.App;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest{
    private String originalName;
    private String comparableName;

    @Before
    public void getName(){
        this.originalName = new App().getName();
        this.comparableName = "Евгений Онегин";
    }

    @Test
    public void testForPlagiarism(){
        assertEquals("ДЗ списане)", originalName, comparableName);
    }
}
