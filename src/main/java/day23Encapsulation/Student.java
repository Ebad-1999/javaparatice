package day23Encapsulation;

public class Student {

    public String stname = "Ahmad Khan";
    private String stId = "asfja54555saj5/ask";
    private String address = "dflkgslkg";
    private boolean seccessful = true;

    public String getStId() {
        return stId;
    }

    public String getAddress() {
        return address;
    }

    public boolean isSeccessful() {
        return seccessful;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSeccessful(boolean seccessful) {
        this.seccessful = seccessful;
    }
}
