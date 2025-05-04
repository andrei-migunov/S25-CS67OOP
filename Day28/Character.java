public class Character {
    private String name;
    private int mana;
    private String elementAffinity; 

    public Character(String name, int mana, String elementAffinity) {
        this.name = name;
        this.mana = mana;
        this.elementAffinity = elementAffinity;
    }

    public boolean castSpell(Spell s) {
        int cost = s.getManaCost();
        if (s.getElement().equals(elementAffinity)) { //internal logic unknown to view
            cost -= 5; 
        }
        if (mana >= cost) {
            mana -= cost;
            return true;
        }
        return false;
    }

    public int getMana() {
        return mana;
    }

    public String getName() {
        return name;
    }
}