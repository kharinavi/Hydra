package ru.kharina.study.hydra;

public class Head {
    private int eyeCount;
    private int earCount;

    public Head(int eyeCount, int earCount) {
        this.eyeCount = eyeCount;
        this.earCount = earCount;
    }

    public String printProperties(){
        return "Голова с " + earCount + " ушами и " + eyeCount + " глазами";
    }
}
