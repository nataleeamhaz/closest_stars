package edu.brown.cs.student.main;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import org.junit.Test;


public class neighborsTest {
Knearest k = new Knearest();
ArrayList<Star> s = new ArrayList<>();
Star star = new Star(1,"Lonely Star",5.0,-2.24,10.04);
public neighborsTest(){
    s.add(star);
}
@Test
public void nearCoordTest(){

    ArrayList<Star> compare = new ArrayList<>();
    compare.add(star);
    ArrayList<Star> n = k.neighborCoord(s, 1, 0.0, 0.0, 0.0);
    assertEquals(n, compare);

}
@Test
    public void nearStarTest(){
    Star star1 = new Star(0,"hi",0.0,1.0,3.0);
    Star star2 = new Star(1,"bye",4.0,5.0,6.0);
    Star star3 = new Star(2,"n",6.0,7.0,9.0);
    ArrayList<Star> compare = new ArrayList<>();
    compare.add(star1);
    compare.add(star2);
    compare.add(star3);
    ArrayList<Star> n = k.neighborStar(0, compare,2, 0.0, 0.0, 0.0);
    ArrayList<Star> end = new ArrayList<>();
    end.add(star2);
    end.add(star3);
    assertEquals(n, end);
}


}
