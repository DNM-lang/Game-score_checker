// full Player class and fullName function

class Player(var name:String, var surName:String)

{

    var totalScore = 0

    var personalBestScore = 0

    fun fullName (): String{

        return name +" "+surName;

    }

}

//full Scores class and checkBest function

class Scores()

{

    fun checkBest(best:Int, current:Int): Int

    {

        if(best < current)

        {

            return current;

        }

        return best;

    }



}



fun main()

{

    // initalise Player objects

    val Player1 = Player("Nicola", "Tesla")

    val Player2 = Player("Thomas", " Edison " )

// create working variables

    val scoring = Scores()  // instance of the Scores class to allow access to checkBest function

    var lvlScore= 0 // variable to simulate Player level score



// Level 1

    lvlScore = 13 // insert simulated values for level score

    Player1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore

// suppy the parameters for the checkBest function by accessing the Player properties

    Player1.personalBestScore = scoring.checkBest(Player1.personalBestScore,lvlScore);



    lvlScore = 34

    Player2.totalScore += lvlScore;

    Player2.personalBestScore = scoring. checkBest(Player2.personalBestScore,lvlScore);



// Level 2

    lvlScore = 60 // insert simulated values for level score

    Player1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore

// suppy the parameters for the checkBest function by accessing the Player properties

    Player1.personalBestScore = scoring.checkBest(Player1.personalBestScore,lvlScore);



    lvlScore = 88 // insert simulated values for level score

    Player2.totalScore += lvlScore;

    Player2.personalBestScore = scoring. checkBest(Player2.personalBestScore,lvlScore);



// Level 3

    lvlScore = 99 // insert simulated values for level score

    Player1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore

// suppy the parameters for the checkBest function by accessing the Player properties

    Player1.personalBestScore = scoring.checkBest(Player1.personalBestScore,lvlScore);



    lvlScore = 10

    Player2.totalScore += lvlScore;

    Player2.personalBestScore = scoring.checkBest(Player2.personalBestScore,lvlScore);



// conditional check using an if statement to determine the winner

    if(Player1.totalScore > Player2.totalScore)

    {

// access the Player properties to construct the String to print

        println("The winner is "+ Player1.fullName() +  " with a Score of  "+Player1.totalScore);

        println("Personal Best Score is = " +Player1.personalBestScore);

    }

    else

    {

        println("The winner is "+ Player2.fullName() + " with a Score of "+Player2.totalScore);

        println("Personal Best Score is = " +Player2.personalBestScore);

    }

}
