package com.company.Organized;

public class shirt {
    int collarSize, sleeveLength;
    String material;

    public shirt(int collarSize, int sleeveLength){
        this.collarSize = collarSize;
        this.sleeveLength = sleeveLength;
    }
    public void display(){
        System.out.println("CollarSize  :  " +  collarSize +   "   " +  "Sleevelength  :  " + sleeveLength);
    }
}
