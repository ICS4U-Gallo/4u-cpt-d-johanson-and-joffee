package models;

public class Marks {

    public Double currentMark;
    public Double examMark;
    public Double examWorth;

    public Marks(){

    }


    public Marks(double currentMark, double examMark, double examWorth){
        this.currentMark = currentMark;
        this.examMark = examMark;
        this.examWorth = examWorth;
    }

}
