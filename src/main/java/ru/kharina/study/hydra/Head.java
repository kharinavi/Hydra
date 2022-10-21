package ru.kharina.study.hydra;

public class Head {
    private int eyeCount;
    private int earCount;

    public int getEyeCount() {
        return eyeCount;
    }

    public void setEyeCount(int eyeCount) {
        this.eyeCount = eyeCount;
    }

    public int getEarCount() {
        return earCount;
    }

    public void setEarCount(int earCount) {
        this.earCount = earCount;
    }

    public String printProperties(){
        return "Голова с " + earCount + " ушами и " + eyeCount + " глазами";
    }
}
