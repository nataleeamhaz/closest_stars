package edu.brown.cs.student.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class csvReader {
    ArrayList<Star> _stars;
    public csvReader(ArrayList<Star> stars){
    _stars = stars;
    }
    public void csvReader (String path) throws IOException {
        if (path != null) {
            String read;
            _stars.clear();
            try {
                BufferedReader csv = new BufferedReader(new FileReader(path));
                csv.readLine();
                while ((read = csv.readLine()) != null) {
                    String[] data = read.split(",");

                    Star s = new Star(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]), Double.parseDouble(data[3]),
                            Double.parseDouble(data[4]));
                    _stars.add(s);
                }
                System.out.println("Read " + starsSize() + " stars from " + path);


            } catch(IOException e){
                System.err.println("ERROR:");
                throw new IOException();
            }
        }
        else{
            System.err.println("ERROR:");
            noFile(path);
        }
    }
    public int starsSize(){
        return _stars.size();
    }
    public ArrayList noFile(String path){
        if(path == null){
            return null;
        }
        return null;
    }
}
