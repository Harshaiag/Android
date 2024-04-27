package uk.ac.le.co2103.part2;

public class ShoppingList {

    private int listId;
    private String name;
    private int image;

    public ShoppingList(int listId, String name, int image) {
        this.listId = listId;
        this.name = name;
        this.image = image;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
