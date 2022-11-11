package models;

public class Pokemon {
    private int id;
    private String name;
    private String type;
    private String blurb;
    private int entryNumber;

    public Pokemon() {}

    public Pokemon(String name, String type, String blurb, int entryNumber) {
        this.name = name;
        this.type = type;
        this.blurb = blurb;
        this.entryNumber = entryNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public int getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(int entryNumber) {
        this.entryNumber = entryNumber;
    }
}
