package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    List<Token> tokens = new ArrayList<>();

    public Board(int tokenCount) {
        for (int i = 0; i < tokenCount; i++) {
            tokens.add(new Token(i));
        }
    }

     //Jucătorii au acces la tablă și pot apela această funcție
     //Când un jucător apelează funcția, acesta va primi un indicativ RANDOM, iar indicativul Board-ului va fi eliminat
     //Este sincronizat astfel încât un singur jucător să poată obține un jeton la un moment dat

    public synchronized Token getToken() {
        if(tokens.size() > 0) {
            int number = new Random().nextInt(tokens.size());
            Token aux = tokens.get(number);
            tokens.remove(number);
            return aux;
        }else{
            return null;
        }
    }
    //Atunci când un jucător apelează funcția, va primi un token random în schimb pentru unul dintre token-ul lor
    //Este sincronizat astfel încât un singur jucător să poată schimba un jeton la un moment dat

    public synchronized Token exchangeToken(Token token) {
        if(tokens.size() > 0) {
            int number = new Random().nextInt(tokens.size());
            Token aux = tokens.get(number);
            tokens.remove(number);
            tokens.add(token);
            return aux;
        }else{
            tokens.add(token);
            return null;
        }
    }
}