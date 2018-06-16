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

    public Double getCurrentMark() {
        return this.currentMark;
    }

    public void setCurrentMark(Double currentMark) {
        this.currentMark = currentMark;
    }

    public Double getGoalMark() {
        return this.goalMark;
    }

    public void setGoalMark(Double goalMark) {
        this.goalMark = goalMark;
    }

    public Double getExamWorth() {
        return this.examWorth;
    }

    public void setExamWorth(Double examWorth) {
        this.examWorth = examWorth;
    }

    public Double calculateNeededMark() {
        return Math.round(((goalMark - currentMark) / (examWorth / 100)) * 100) / 100.0;
    }
}
