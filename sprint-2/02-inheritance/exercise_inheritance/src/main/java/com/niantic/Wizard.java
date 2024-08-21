package com.niantic;

public class Wizard extends Character
{
    // Declare mana variable:
    private int mana;

    // Create constructor:
    public Wizard(String name, int health, int level, int experience, int mana)
    {
        super(name, health, level, experience);
        this.mana = mana;
    }

    // Create getter for mana:
    public int getMana()
    {
        return mana;
    }

    // Create "Cast Spell" ability:
    public void castSpell(Character target)
    {
        if (isDefeated())
        {
            System.out.println(this.name + " has been defeated and cannot cast spells!");
            return;
        }

        if (this.getMana() < 10)
        {
            System.out.println(this.name + " doesn't have enough mana to cast spells!");
            return;
        }

        System.out.println(this.name + " casts a spell at " + target.getName());
        target.takeDamage(attackDamage * 2);
    }

    // Create Regenerate Mana method:
    public void regenerateMana(int amount)
    {
        if (!isDefeated())
        {
            mana += amount;
        }
    }

    // Create overrides for wizard-specific methods:
    @Override
    public void levelUp()
    {
        super.levelUp();
        if (!isDefeated())
        {
            mana += 10;
        }
    }

    @Override
    public String specialAbility()
    {
        return "Cast Spells";
    }
}
