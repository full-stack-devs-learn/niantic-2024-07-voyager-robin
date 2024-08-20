package com.niantic.part_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTests
{
    // Test the parameterless constructor:
    @Test
    public void doesParameterlessConstructor_createDefaultRectangle()
    {
        //arrange; declare variables for expected and actual test values:
        int expectedHeight = 5;
        int expectedWidth  = 5;
        int actualHeight;
        int actualWidth;

        // act: create parameterless constructor and assign the
        //      width and height to the actual-value variables:
        Rectangle parameterlessRectangle = new Rectangle();

        actualWidth  = parameterlessRectangle.getWidth();
        actualHeight = parameterlessRectangle.getHeight();

        // assert: test to see if actual and expected values match:

        Assertions.assertEquals(actualWidth, expectedWidth,
                "The width and height of a Rectangle " +
                         "constructed with no parameters should be 5.");

        Assertions.assertEquals(actualHeight, expectedHeight,
                "The width and height of a Rectangle " +
                        "constructed with no parameters should be 5.");
    }

    @Test
    public void isAreaCalculatedCorrectly()
    {
        // arrange; declare variables for  test values, expected area and actual area:
        int testWidth;
        int testHeight;
        int expectedArea;
        int actualArea;

        // act; create Rectangle object with test values for dimensions, calculate area:
        testWidth  = 10;
        testHeight = 10;

        Rectangle testRectangle = new Rectangle(testWidth, testHeight);
        expectedArea            = testWidth * testHeight;
        actualArea              = testRectangle.getArea();

        // assert: check that actual and expected area are equal:
        assertEquals(expectedArea, actualArea, "Area should equal width * height.");
    }

    @Test
    public void isPerimeterCalculatedCorrectly()
    {
        // arrange; declare variables for test values, expected and actual perimeter:
        int testWidth;
        int testHeight;
        int expectedPerimeter;
        int actualPerimeter;

        // act; create Rectangle object with test values for dimensions, calculate perimeter:
        testWidth  = 10;
        testHeight = 10;

        Rectangle testRectangle = new Rectangle(testWidth, testHeight);
        expectedPerimeter            = (testWidth * 2) + (testHeight * 2);
        actualPerimeter              = testRectangle.getPerimeter();

        // assert: check that actual and expected area are equal:
        assertEquals(expectedPerimeter, actualPerimeter, "Perimeter should " +
                    "equal ([2 * width] + [2 * height]).");
    }

    @Test
    public void areAreaAndPerimeterPositive()
    {
        // arrange; declare variables for test, expected, and actual values:
        int testWidth;
        int testHeight;
        int expectedArea;
        int expectedPerimeter;
        int actualArea;
        int actualPerimeter;

        // act; create Rectangle object with test values for dimensions, set expected values,
        //      calculate actual values:
        testWidth         = -1;
        testHeight        = -1;
        expectedArea      =  0;
        expectedPerimeter =  0;

        Rectangle testRectangle = new Rectangle(testWidth, testHeight);

        actualPerimeter = testRectangle.getPerimeter();
        actualArea      = testRectangle.getArea();


        // assert: check that actual and expected area & perimeter are equal:
        assertEquals(expectedArea, actualArea, "Negative values for width and height " +
                                                        "should default to 0 Area");
        assertEquals(expectedPerimeter, actualPerimeter, "Negative values for width and height " +
                                                                  "should default to 0 Perimeter");
    }
}