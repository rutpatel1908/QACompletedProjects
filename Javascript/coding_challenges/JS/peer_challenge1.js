var opponentMove = ["Rock", "Scissors", "Paper"];
  var player = {};
  player["Rock"] = ["draws against", "crushes", "is covered by"];
  player["Scissors"] = ["is crushed by", "draws against", "cuts"];
  player["Paper"] = ["covers", "is cut by", "draws against"];
  var winCheck = {};
  winCheck["Rock"] = ["You draw", "You win", "Computer wins"];
  winCheck["Scissors"] = ["Computer wins", "You draw", "You win"];
  winCheck["Paper"] = ["You win", "Computer wins", "You draw"];
  var count = 0;
  var playerWinCount = 0;
  var opponentWinCount = 0;
  var drawCount = 0;
  var outcome;
  var rockCount = 0;
  var scissorCount = 0;
  var paperCount = 0;
  var mostCommon;
  var mostCommonCount;
  
  var x;

  function makeMove() {

    x = document.getElementById('choice').value;

    var theirMove = opponentMove[Math.floor((Math.random() * 3))];
    document.getElementById("moveText").innerHTML = "Player picks: " + x;
    document.getElementById("opponentMove").innerHTML = "Opponent picks: " + theirMove;
    document.getElementById("combatText").innerHTML = x + " " + player[x][opponentMove.indexOf(theirMove)] + " " + theirMove;
    outcome = winCheck[x][opponentMove.indexOf(theirMove)];
    document.getElementById("resultText").innerHTML = outcome;
    count++;
    document.getElementById("gameCount").innerHTML = "Number of games played: " + count;
    
    if(outcome === "You win") {
      playerWinCount++;
      document.getElementById("playerText").innerHTML = "Number of player wins: " + playerWinCount;
    }
    else if(outcome === "Computer wins") {
      opponentWinCount++;
      document.getElementById("opponentText").innerHTML = "Number of opponent wins: " + opponentWinCount;
    }
    else {
      drawCount++;
      document.getElementById("drawText").innerHTML = "Number of draws: " + drawCount;
    }
    
    document.getElementById("percentageText").innerHTML = "Player win rate: " + (playerWinCount/count)*100 + "%, " + 
                            "Opponent win rate: " + (opponentWinCount/count)*100 + "%, " + 
                            "Draw rate: " + (drawCount/count)*100 + "%";  
    
    if(x === "Rock" || theirMove === "Rock") {
      if(x === "Rock" && theirMove === "Rock") {
        rockCount += 2;
      }
      else {
        rockCount++;
      }
    }
    if(x === "Scissors" || theirMove === "Scissors") {
      if(x === "Scissors" && theirMove === "Scissors") {
        scissorCount += 2;
      }
      else {
        scissorCount++;
      }
    }
    if(x === "Paper" || theirMove === "Paper") {
      if(x === "Paper" && theirMove === "Paper") {
        paperCount += 2;
      }
      else {
        paperCount++;
      }
    } 
    if(rockCount > scissorCount && rockCount > paperCount) {
      mostCommon = "Rock";
      mostCommonCount = rockCount;
    }
    else if(scissorCount > rockCount && scissorCount > paperCount) {
      mostCommon = "Scissors";
      mostCommonCount = scissorCount;
    }
    else if(paperCount > rockCount && paperCount > scissorCount) {
      mostCommon = "Paper";
      mostCommonCount = paperCount;
    }
    else {
      mostCommon = "None";
    }
    
    document.getElementById("mostCommonText").innerHTML = "The most commonly picked choice is " + mostCommon + " -- " + (mostCommonCount/(count*2))*100 + "%";
  }