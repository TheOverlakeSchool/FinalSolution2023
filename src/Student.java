public class Student {
    private int veracrossID;
    private String name;
    private static final int ASCII_I = 73; // used forthe final where Inara should be printed first

    Student(int veracrossID, String name) {
        this.veracrossID = veracrossID;
        this.name = name;
    }

    public int getVeracrossID() {
        return veracrossID;
    }

    public void setVeracrossID(int veracrossID) {
        this.veracrossID = veracrossID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int hashCode() {
        return Math.abs(name.charAt(0) - ASCII_I);
    }

    public String toString() {
        return name;
    }
}
