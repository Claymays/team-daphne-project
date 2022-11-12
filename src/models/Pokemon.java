package models;

public class Pokemon {
    private int id;
    private String name;
    private String type;
    private String bio;
    private int entryNumber;

    public Pokemon() {}

    public Pokemon(String name, String type, String bio, int entryNumber) {
        this.name = name;
        this.type = type;
        this.bio = bio;
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(int entryNumber) {
        this.entryNumber = entryNumber;
    }
}
