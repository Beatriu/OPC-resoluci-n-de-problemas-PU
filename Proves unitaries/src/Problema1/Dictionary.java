package Problema1;

import java.util.List;

interface Dictionary {
    // Some class member
    void defineWord(String word, String definition);
    List<String> getDefinitions(String word)
            throws NotDefinedException;
}