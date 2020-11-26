package com.company;

public class Skelet extends Boss {
    private String arrows;

    public String getArrows() {
        return arrows;
    }

    public void setArrows(String arrows) {
        this.arrows = arrows;
    }

    public String printInfo() {
        return super.printInfo() + " Arrows: " + getArrows();
    }
}
