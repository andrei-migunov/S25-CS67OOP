import java.util.Random;

public class Weapon 
{
    protected String name;
    protected Random DamageGenerator;

    public Weapon(String n)
    {
        name = n;
        DamageGenerator = new Random();
    }

    public int damage()
    {
        int damageAmount = DamageGenerator.nextInt(2);
        System.out.println(this+" deals "+damageAmount+" damage!");
        return damageAmount;
    }

    public String toString()
    {
        String weaponInfo = name+"(Weapon)";
        return weaponInfo;
    }
}
