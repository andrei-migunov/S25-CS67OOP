public interface View {
    public void showMana(String name, int mana);
    public void showSpellResult(String name, boolean success);
    public void showSpellDetails(Spell s);
}