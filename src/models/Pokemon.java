package models;

public class Pokemon {
    private String name;
    private String type;
    private String bio;
    private String entryNumber;
    private boolean found;

    public Pokemon() {}

    public Pokemon(String name, String type, String bio, String entryNumber) {
        this.name = name;
        this.type = type;
        this.bio = bio;
        this.entryNumber = entryNumber;
        this.found = false;
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

    public String getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }
}
