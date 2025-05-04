public class View {
    public void showSpellResult(String name, boolean success) {
        if (success) {
            System.out.println(name + " successfully casts the spell!");
        } else {
            System.out.println(name + " doesn't have enough mana!");
        }
    }

    public void showMana(String name, int mana) {
        System.out.println(name + " has " + mana + " mana left.");
    }

    public void showSpellDetails(Spell s) {
        System.out.println(
                "Spell: " + s.getName() + " [Element: " + s.getElement() + ", Mana Cost: " + s.getManaCost() + "]");
    }
}