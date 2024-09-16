package com.niantic;

public class Sword extends Weapon
{
    public Sword(String name, int damage)
    {
        super(name, damage);
    }

    @Override
    public int attack()
    {
        // Attacking with a sword deals default damage and charges 10%:
        percentCharged += 10;
        if (getPercentCharged() > 100)
        {
            percentCharged = 100;
        }
        return getDamage();
    }

    @Override
    public int powerAttack()
    {
        if(getPercentCharged() < 50)
        {
           System.out.println("You don't have enough charge for a Power Attack!");
           return attack();
        }
        else if(getPercentCharged() >= 50 && getPercentCharged() <= 90)
        {
            setPercentCharged(getPercentCharged()-50);
            return (getDamage() * 2);
        } else
        {
            setPercentCharged(0);
            return (getDamage() * 4);
        }
    }

    @Override
    public int getRange()
    {
        return 1;
    }
}
