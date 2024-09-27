package org.launchcode;

public class LPs extends BaseDisc implements StorageDisk {

    private static final String DISC_TYPE = "LPs";

    public LPs(String discType, String capacity, String title, String contents) {
        super(discType, capacity, title, contents);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void writeData(String data) {

    }

    @Override
    public String readData() {
        return "";
    }

    @Override
    public void loadDisc() {

    }

    @Override
    public String getDiscInfo() {
        return "";
    }
}
