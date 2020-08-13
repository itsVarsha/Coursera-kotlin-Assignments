package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(Secret: String, Guess: String): Evaluation {
   println("$Secret.. $Guess")
var secret=Secret;
    var guess=Guess;
    var rightPosition = 0;
    var rightCh: String  =""
    var wrongCh: String=""
    var wrongPosition = 0;

  var i:Int = 0;

       var len=secret.length
while (i<len) {//guess

    if(guess[i]==secret[i])
    {//secret=AABC, guess=ADFA   R: 1, w: 1
        rightPosition++     // R: 1, W: 2
        rightCh+= guess[i]
        secret = secret.removeRange(i,i+1)
        guess=guess.removeRange(i,i+1)
        len=secret.length;
        ; continue
    }
    i++;
}
    i=0;

    while(i<len)//guess
    {// secret=ABC, guess=DFA
    var ii:Int=0; //secret
        while(ii<len) {
            if (guess[i]!='*' && guess[i] == secret[ii]) {

                wrongPosition++;wrongCh += guess[i];
                secret = secret.replaceFirst(secret[ii],'*')
                guess=guess.replaceFirst(guess[i],'*')
                println(guess+"  " + secret)

            }
            ii++;
        }
        i++;
}


    print(rightPosition)
    println(":"+rightCh)

println(wrongPosition.toString() + ":" + wrongCh)

  return (Evaluation(rightPosition,wrongPosition))
}
