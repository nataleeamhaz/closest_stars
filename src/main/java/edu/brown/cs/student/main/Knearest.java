package edu.brown.cs.student.main;

import java.util.ArrayList;
import java.util.Collections;

public class Knearest {
    public Knearest(){

    }

    public ArrayList<Star> neighborStar(int input, ArrayList<Star> stars, int k, double x, double y, double z){
        Collections.sort(stars, new StarComparator(x, y, z));
        ArrayList<Star> end = new ArrayList<>();
        int count = 0;
        int index = 0;
        while(count < k){
            if (stars.get(index).get_StarID() != input) {
                System.out.println(stars.get(index).get_StarID());
                end.add(stars.get(index));
                count ++;
            }
            index ++;
        }
        return end;

    }
    public ArrayList<Star> neighborCoord(ArrayList<Star> stars, int k, double x, double y, double z){
        Collections.sort(stars, new StarComparator(x, y, z));
        ArrayList<Star> end = new ArrayList<>();
        int count = 0;
        int index = 0;
        while(count < k){
            System.out.println(stars.get(index).get_StarID());
            end.add(stars.get(index));
            count ++;
            index ++;

        }
        return stars;
    }



}
