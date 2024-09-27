package org.launchcode;

public interface StorageDisk {
    void spinDisc();
    void writeData(String data);
    String readData();
    void loadDisc();
    String getDiscInfo();
    String reWriteAble();

}
