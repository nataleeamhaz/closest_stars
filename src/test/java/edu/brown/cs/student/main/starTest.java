package edu.brown.cs.student.main;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
public class starTest{
    private Star _star;
    Double _y;
    Double _x;
    Double _z;
    public starTest(){
        _y = 2.0;
        _x = 1.0;
        _z = 3.0;
        _star = new Star(0, "hi",_x, _y, _z);

    }
    @Test
    public void idTest(){
        Integer out = _star.get_StarID();
        assertThat(out, is(0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void noID() {
       Star s = new Star(null, "hi",1.0, 2.0, 3.0);
       s.get_StarID();
    }
    @Test
    public void properNameTest(){
       String s =  _star.get_ProperName();
       assertEquals(s, "hi");
    }

    @Test
    public void xCoordTest(){
        assertEquals(_star.get_X(), _x);


    }
    @Test(expected = IllegalArgumentException.class)
    public void noCoord(){
        Star s = new Star(0, "l",null, 2.0, 3.0);
        s.get_X();

    }
    @Test
    public void yCoordTest(){
        assertEquals(_star.get_Y(), _y);


    }
    @Test
    public void zCoordTest(){
        assertEquals(_star.get_Z(), _z);


    }


}
