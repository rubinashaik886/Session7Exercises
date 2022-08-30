public class Cell {

    private String name;
    private boolean doorIsOpen;
    private int securityCode = 7386;
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setDoorIsOpen(int securityCode) {
        if (this.securityCode == securityCode & doorIsOpen == true) {
            System.out.println("Door is being closed");
        } else if (this.securityCode == securityCode & doorIsOpen == false) {
            System.out.println("Door is being open");
        } else if (this.securityCode != securityCode) {
            System.out.println("Error: wrong security code");
        }

    }



    public Cell(String name, boolean doorOpenClose, int securityCode) {
        this.name = name;
        this.doorIsOpen = doorOpenClose;
        this.securityCode = securityCode;

    }

}
