package model;

public class Department {
    String name;
    String nameOfHead;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNameOfHead() {
        return nameOfHead;
    }
    public void setNameOfHead(String nameOfHead) {
        this.nameOfHead = nameOfHead;
    }
}
