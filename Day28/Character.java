import java.util.Random;

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

    public void swapAffinity() {
        String[] affinities = {"Fire", "Ice", "Poison", "Lightning","Force"};
        Random random = new Random();
        this.elementAffinity = affinities[random.nextInt(affinities.length)];
    }

    public String getAffinity() {
        return elementAffinity;
    }

    public String getName() {
        return name;
    }
}