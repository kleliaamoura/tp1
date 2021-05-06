package fr.univ_amu.iut.exercice2;

public class FizzBuzzer {

    public String computeString(int i) {
        if (i % 3 == 0 && i % 5 == 0)
            return "FizzBuzz";
        if (i % 5 == 0)
            return "Buzz";
        if (i % 3 == 0)
            return "Fizz";
        return String.valueOf(i);
    }

    public String[] computeList(int i) {
        String[] resultat = new String[i];
        for (int j = 0; j < i; j++)
            resultat[j] = computeString(j+1);
        return resultat;
    }
}