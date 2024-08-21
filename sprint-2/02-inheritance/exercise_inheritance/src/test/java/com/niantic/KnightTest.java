package com.niantic;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest
{
    //Test that Knights have a getArmor method
    @Test
    public void knight_getArmor_Works()
    {
        // arrange/act; create a new knight with predetermined armor:
        int testArmor = 5;
        Knight testKnight = new Knight("Boromir", 50, 1, 0, testArmor);

        // assert; ensure that the getArmor method doesn't return null.
        assertEquals(testKnight.getArmor(), testArmor, "\nKnight should have a getArmor() getter method");
    }

    @Test
    public void knight_armorReducesDamage()
    {
        // arrange; create a new knight with predetermined armor & health:
        int testHealth     = 50;
        int testArmor      =  5;
        int testDamage     = 10;
        int expectedHealth = testHealth - (testDamage - testArmor);
        Knight testKnight  = new Knight("Boromir", testHealth, 1, 0, testArmor);
        int actualHealth;
        // act; have the test knight take damage,
        // calculate expected health after damage:
        testKnight.takeDamage(testDamage);
        actualHealth = testKnight.getHealth();

        // assert
        assertEquals(actualHealth, expectedHealth, "\nKnight's armor should reduce incoming damage'");
    }

    @Test
    public void knight_levelUpIncreasesArmorAndLevel()
    {
        // arrange; create a new knight with predetermined armor:
        int testArmor     = 5;
        int testLevel     = 1;
        int expectedArmor = testArmor + 5;
        int expectedLevel = testLevel + 1;
        Knight testKnight = new Knight("Boromir", 50, 1, 0, testArmor);
        int actualArmor;
        int actualLevel;

        // act; level up the knight
        testKnight.levelUp();
        actualArmor = testKnight.getArmor();
        actualLevel = testKnight.getLevel();

        // assert; ensure that values increased properly.
        assertEquals(expectedLevel, actualLevel, "\nLeveling a Knight should increase level by 1.");
        assertEquals(expectedArmor, actualArmor, "\nLeveling a Knight should increase armor by 5.");

    }

    @Test
    public void knight_specialAbilityReturnsProperly()
    {
        // arrange; create a new knight, expected and actual variables:
        String expectedSpecial = "Armor Shield";
        Knight testKnight      = new Knight("Boromir", 50, 1, 0, 5);
        String actualSpecial   = testKnight.specialAbility();

        // act/assert; ensure that the special ability returns desired value.
        assertEquals(expectedSpecial, actualSpecial, "\nKnight should have a special ability called 'Armor Shield'.");
    }
}