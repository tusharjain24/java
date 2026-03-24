package accessmodifiers;

public class School {
    public String name;
    private int fees;
    protected String address;
    String principalName;

    public School(String name, int fees, String address, String principalName) {
        this.name = name;
        this.fees = fees;
        this.address = address;
        this.principalName = principalName;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
