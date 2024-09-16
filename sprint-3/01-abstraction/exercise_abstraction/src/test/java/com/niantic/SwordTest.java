package com.niantic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class SwordTest extends ReflectionBase<Sword>
{
    @Test
    public void swordShouldExtendWeapon()
    {
        // arrange
        Sword testSword      = new Sword("Excalibur", 10);
        String swordSuper    = testSword.getClass().getSuperclass().toString();
        String expectedSuper = "class com.niantic.Weapon";

        // act/assert
        assertEquals(expectedSuper, swordSuper);
    }

    @Test
    public void attackDealsDefaultDamage()
    {
        // arrange
        int expectedDamage = 10;
        Sword testSword    = new Sword("Excalibur", expectedDamage);

        // act/assert
        assertEquals(expectedDamage, testSword.attack());
    }

    @Test
    public void attackChargesPower()
    {
        // arrange
        int expectedCharge = 10;
        Sword testSword    = new Sword("Excalibur", 10);

        // act/assert
        assertEquals(expectedCharge, testSword.attack());
    }

    @Test
    public void attackCannotChargePowerAboveFull()
    {
        // arrange
        int expectedCharge = 100;
        Sword testSword    = new Sword("Excalibur", 10);
        testSword.setPercentCharged(100);

        //act
        testSword.attack();

        // act/assert
        assertEquals(expectedCharge, testSword.getPercentCharged());
    }

    @Test
    public void powerAttack_belowFiftyCharge_dealsDefaultDamage()
    {
        // arrange
        int expectedDamage = 10;
        Sword testSword    = new Sword("Excalibur", expectedDamage);

        // act/assert
        assertEquals(expectedDamage, testSword.powerAttack());
    }

    @Test
    public void powerAttack_belowNinetyCharge_dealsDoubleDamage()
    {
        // arrange
        int expectedDamage = 20;
        Sword testSword    = new Sword("Excalibur", (expectedDamage/2));
        testSword.setPercentCharged(65);

        // act/assert
        assertEquals(expectedDamage, testSword.powerAttack());
    }

    @Test
    public void powerAttack_fullCharge_dealsQuadrupleDamage()
    {
        // arrange
        int expectedDamage = 20;
        Sword testSword    = new Sword("Excalibur", (expectedDamage/4));
        testSword.setPercentCharged(100);

        // act/assert
        assertEquals(expectedDamage, testSword.powerAttack());
    }

    @Test
    public void powerAttack_belowNinetyCharge_reducesChargeByFifty()
    {
        // arrange
        int expectedCharge = 10;
        Sword testSword    = new Sword("Excalibur", 10);
        testSword.setPercentCharged(expectedCharge + 50);
        int actualCharge;

        //act
        testSword.powerAttack();
        actualCharge = testSword.getPercentCharged();

        // act/assert
        assertEquals(expectedCharge, actualCharge);
    }

    @Test
    public void powerAttack_fullCharge_consumesTotalCharge()
    {
        // arrange
        int expectedCharge = 0;
        Sword testSword    = new Sword("Excalibur", 10);
        testSword.setPercentCharged(100);
        int actualCharge;

        //act
        testSword.powerAttack();
        actualCharge = testSword.getPercentCharged();

        // act/assert
        assertEquals(expectedCharge, actualCharge);
    }

    @Test
    public void getRangeReturnsOne()
    {
        // arrange
        int expectedRange = 1;
        Sword testSword    = new Sword("Excalibur", 10);

        // act/assert
        assertEquals(expectedRange, testSword.getRange());
    }
}
