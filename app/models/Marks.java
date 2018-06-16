package models;

public class Marks {

    public Double currentMark;
    public Double goalMark;
    public Double examWorth;

    public Marks(){

    }


    public Marks(double currentMark, double goalMark, double examWorth){
        this.currentMark = currentMark;
        this.goalMark = goalMark;
        this.examWorth = examWorth;
    }

}
