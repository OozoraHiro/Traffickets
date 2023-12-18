package com.marcangelolopez.traffickets.data;

public class ViolatorModel {
    public int violatorID;
    public String violatorTitle;
    public String violatorDesc;

    ViolatorModel(int noteID, String noteTitle, String noteDesc){
        this.violatorID = noteID;
        this.violatorTitle = noteTitle;
        this.violatorDesc = noteDesc;
    }

    @Override
    public String toString(){
        return "ViolatorModel{" +
                "violatorID=" + violatorID +
                ", violatorTitle='" + violatorTitle + '\'' +
                ", violatorDesc='" + violatorDesc + '\'' +
                '}';
    }
}
