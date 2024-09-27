package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        CD myCd = new CD("","","My Music", "Music I like");

        DVD myDvd = new DVD("","","My Movie","A movie i like");

        myCd.loadDisc();
        myCd.spinDisc();
        myCd.writeData("Music");
        System.out.println(myCd.readData());
        System.out.println(myCd.getDiscInfo());

        System.out.println("========================");

        myDvd.loadDisc();
        myDvd.spinDisc();
        myDvd.writeData("Movie");
        System.out.println(myDvd.readData());
        System.out.println(myDvd.getDiscInfo());
    }

}