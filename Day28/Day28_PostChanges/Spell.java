public class Spell {

    private String name;
    private int manaCost;
    private String element; // New logical property

    public Spell(String name, int manaCost, String element) {
        this.name = name;
        this.manaCost = manaCost;
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getElement() {
        return element;
    }
}