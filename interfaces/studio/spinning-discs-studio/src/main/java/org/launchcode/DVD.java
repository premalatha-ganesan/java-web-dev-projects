package org.launchcode;

public class DVD extends BaseDisc implements StorageDisk {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    private static final String DISC_TYPE = "DVD";

    public DVD(String discType, String capacity, String title, String contents) {
        super("DVD", "4.7GB", title, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("a DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void writeData(String data) {
        setContents(data);
        System.out.println("Writing data to DVD: " + data);
    }

    @Override
    public String readData() {
        return  getContents();
    }

    @Override
    public void loadDisc() {
        System.out.println("Loading DVD: " + getTitle());
    }

    @Override
    public String getDiscInfo() {
        return "Title: " + getTitle() +" ,Capacity: " + getCapacity() + " ,Contents: " + getContents() + " ,Disc Type: " + getDiscType();
    }

    @Override
    public String reWriteAble() {
        return "";
    }
}
