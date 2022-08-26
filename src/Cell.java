public class Cell {

    private String name;
    private boolean doorIsOpen;
    private int securityCode;

    public String getName() {
        return name;
    }

    public boolean getDoorIsOpen() {
        return doorIsOpen;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setDoorIsOpen (int securityCode) {
        if (this.securityCode == securityCode) {

        }

    }

    public Cell(String name, boolean doorOpenClose, int securityCode) {
        this.name = name;
        this.doorIsOpen = doorOpenClose;
        this.securityCode = securityCode;

    }

}
