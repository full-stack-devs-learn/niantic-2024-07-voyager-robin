package com.niantic;

public class BackyardBasketball
{
    /*
     * Teams that play in the backyard league want to be able
     * to calculate their winning percentage.
     *
     * Each team knows how many games they have won and how many
     * games they have lost. When they call this function they
     * will provide their wins and losses.
     *
     * You need to perform the calculation and return their
     * winning percentage as a whole number.
     *
     * Example:
     * If a team has won 7 games and lost 3 games their winning
     * percentage is 70%.
     *
     * calculateWinningPercentage(7, 3) -> 70
     * calculateWinningPercentage(5, 5) -> 50
     * calculateWinningPercentage(5, 10) -> 33
     *
     */
    public int calculateWinningPercentage(int gamesWon, int gamesLost)

    {
        int totalGames        = gamesWon + gamesLost;

        int winningPercentage = (int)((double)gamesWon/(double)totalGames * 100);


        return winningPercentage;
    }


    /*
     * The calculatePointsScored function should calculate
     * the number of points a player scored in a game.
     *
     * shotPercentage = the percent of shots made
     * shotsTaken = the number of shots the player took
     * isThree = if true, the player shot a 3 pointer otherwise a 2
     *
     * calculatePointsScored(70, 10, false) -> 14
     * calculatePointsScored(70, 10, true) -> 21
     * calculatePointsScored(67, 15, false) -> 20
     *
     */

    public int calculatePointsScored(int shotPercentage, int shotsTaken, boolean isThree)

    {
        //Declare variables for the total number of successful shots, the point-per-shot value, and total points scored:
        int successfulShots, pointsPerShot, pointsScored;

        //Using the percentage of successful shots, determine how many of the total shots were successful:
        successfulShots = (int)(shotsTaken * (double)shotPercentage / 100);

        //Using the boolean provided by the user, determine the total points scored:
        if (isThree)
        {
            pointsPerShot = 3;
        }
        else
        {
            pointsPerShot = 2;
        }

        //calculate and return the total points scored:

        pointsScored = successfulShots * pointsPerShot;

        return pointsScored;
    }


    /*
     * Calculate the minimum number of shots that are required
     * to score the desired number of points.
     *
     * shotPercentage = the estimated % of shots that will go in (whole number)
     * desiredScore = the number of points you want to score
     * isThree = if true, the player will shoot a 3 pointer otherwise a 2
     *
     * Example:
     * If a player has a 50% scoring average, and he wants to score 10 points,
     * how many shots will he have to take (if he is NOT shooting 3 pointers)
     *
     * calculateShotsRequired(50, 10, false) -> 10
     *
     * calculateShotsRequired(50, 10, true) -> 8
     * calculateShotsRequired(75, 15, true) -> 7
     * calculateShotsRequired(80, 18, true) -> 8
     * calculateShotsRequired(67, 24, false) -> 18     *
     *
     */
    public int calculateShotsRequired(int shotPercentage, int desiredScore, boolean isThree)
    {
        //Declare variables to hold number of shots required, the point-per-shot value, and a double to hold
        // a working value for the shot percentage:
        int shotsRequired;
        int pointsPerShot;
        double accuracy = (double)shotPercentage / 100;

        //Determine point-per-shot value:
        if (isThree)
        {
            pointsPerShot = 3;
        }
        else
        {
            pointsPerShot = 2;
        }
        //Calculate how many shots will be necessary to come as close as possible to the target score without being
        //able to round up when division is performed (IDK if we're allowed to use the Math library at this point)
        shotsRequired = (int)((double)desiredScore / (double)pointsPerShot / accuracy);

        //Using the modulo operator, determine if there would have been remainders in the above division and increment
        //the amount of shots required every time that there would have been a remainder.

        if ((double)desiredScore % (double)pointsPerShot > 0)
        {
            shotsRequired++;
        }

        if (((double)desiredScore / (double)pointsPerShot) % accuracy > 0)
        {
            shotsRequired++;
        }

        return shotsRequired;
    }
}