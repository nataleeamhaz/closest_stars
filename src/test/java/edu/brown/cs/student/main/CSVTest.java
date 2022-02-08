package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

public class CSVTest {
    @Test
    public void listSize() throws IOException {
        ArrayList<Star> s = new ArrayList<>();
        csvReader c = new csvReader(s);
        c.csvReader("/Users/nataleeamhaz/Desktop/onboarding/data/stars/one-star.csv");
        int out = c.starsSize();
        assertEquals(out, 1);
    }
    @Test
    public void noCSV(){
        ArrayList<Star> s = new ArrayList<>();
        csvReader c = new csvReader(s);
        assertEquals(c.noFile(""), null);
    }
    @Test(expected = IOException.class)
    public void csvFormat() throws IOException {
        ArrayList<Star> s = new ArrayList<>();
        csvReader c = new csvReader(s);
        c.csvReader("/Users/nataleeamhaz/Desktop/onboarding/data/stars/one.csv");
    }
}

