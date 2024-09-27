package org.launchcode;

public class CD extends BaseDisc implements StorageDisk {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    private static final String DISC_TYPE = "CD";

    public CD(String discType, String capacity, String title, String contents) {
        super("CD", "700MB", title, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("a CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void writeData(String data) {
        setContents(data);
        System.out.println("Writing data to CD: " + data);
    }

    @Override
    public String readData() {
        return  getContents();
    }

    @Override
    public void loadDisc() {
        System.out.println("Loading CD: " + getTitle());
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
