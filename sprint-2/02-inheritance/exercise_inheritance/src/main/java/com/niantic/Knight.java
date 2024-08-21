package com.niantic;

public class Knight extends Character
{
    // Declare variable for holding knight-specific value:
    int armor;

    // Declare constructor:
    public Knight(String name, int health, int level, int experience, int armor)
    {
        super(name, health, level, experience);
        this.armor = armor;
    }

    // Declare getter for armor:
    public int getArmor()
    {
        return armor;
    }

    // Create overrides for knight-specific actions:
    @Override public void takeDamage(int damage)
    {
        int finalDamage;

        if (armor >= damage)
        {
            finalDamage = 0;
        }
        else
        {
            finalDamage = damage - armor;
        }

        this.health -= finalDamage;

        if (isDefeated())
        {
            health = 0;
            System.out.println(this.name + " has been defeated!");
        }
        else
        {
            System.out.println(this.name + "'s armor deflects " + (damage-finalDamage) + " damage!");
            System.out.println(this.name + " now has " + this.health + " health remaining.");
        }
    }

    @Override
    public void levelUp()
    {
        super.levelUp();
        if (!isDefeated())
        {
            armor += 5;
        }
    }

    @Override
    public String specialAbility()
    {
        return "Armor Shield";
    }
}
