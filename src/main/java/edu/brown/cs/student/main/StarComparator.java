package edu.brown.cs.student.main;

import java.util.Comparator;



public class StarComparator implements Comparator<Star> {
    double _X;
    double _Y;
    double _Z;

    public StarComparator(double x, double y, double z) {
        _X = x;
        _Y = y;
        _Z = z;
    }


    /**
     * Returns a negative number, zero, or a positive number if the first argument is less than, equal to or greater than
     * the second argument respectively.
     */
    public double distance(double x, double y, double z) {
        double xDiff = _X - x;
        double yDiff = _Y - y;
        double zDiff = _Z - z;
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2) + Math.pow(zDiff, 2));
    }

    @Override
    public int compare(Star s1, Star s2) {
        double dis1 = (distance(s1.get_X(), s1.get_Y(), s1.get_Z()));
        double dis2 = (distance(s2.get_X(), s2.get_Y(), s2.get_Z()));
        if(dis1 == dis2){
            if(((int) (Math.random() * 2) == 1)){
                return 1;
            }
            else{
                return -1;
            }
        }
        return dis1 > dis2 ? 1: -1;


    }


}






