package edu.brown.cs.student.main;

public class Star {
    private Integer _StarID;
    private String _ProperName;
    private Double _X;
    private Double _Y;
    private Double _Z;
    public Star(Integer StarID, String ProperName, Double X, Double Y, Double Z ){
        _StarID = StarID;
        _ProperName = ProperName;
        _X = X;
        _Y = Y;
        _Z = Z;
    }
    public Integer get_StarID() throws IllegalArgumentException{
        if(_StarID == null){
            throw new IllegalArgumentException();
        }
        return _StarID;
    }
    public String get_ProperName(){
        if(_ProperName == null){
            throw new IllegalArgumentException();
        }
        return _ProperName;
    }


    public Double get_X(){
        if(_X == null){
            throw new IllegalArgumentException();
        }
        return _X;
    }
    public Double get_Y(){
        if(_Y == null){
            throw new IllegalArgumentException();
        }
        return _Y;
    }
    public Double get_Z(){
        if(_Z == null){
            throw new IllegalArgumentException();
        }
        return _Z;
    }


}
