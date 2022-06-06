/*
 * File: Wordle.java
 * -----------------
 * This module is the starter file for the Wordle assignment.
 * BE SURE TO UPDATE THIS COMMENT WHEN YOU COMPLETE THE CODE.
 */

import edu.willamette.cs1.wordle.WordleDictionary;
import edu.willamette.cs1.wordle.WordleGWindow;
import java.lang.Math;

public class Wordle {

    public void run() {
        gw = new WordleGWindow();
        word = WordleDictionary.FIVE_LETTER_WORDS[(int) (Math.random() * WordleDictionary.FIVE_LETTER_WORDS.length)];
        gw.addEnterListener((s) -> enterAction(s));
    }

/*
 * Called when the user hits the RETURN key or clicks the ENTER button,
 * passing in the string of characters on the current row.
 */

    public void enterAction(String s) {
        if (s.length() != 5) {
            gw.showMessage("Too short");
            return;
        }
        int currentRow = gw.getCurrentRow();
        s = s.toLowerCase();
        
        if (s.equals(word)) {
            found = true;
        } else {
            boolean isInList = false;
            for (int i = 0; i < WordleDictionary.FIVE_LETTER_WORDS.length; i++) {
               if (WordleDictionary.FIVE_LETTER_WORDS[i].equals(s)) {
                  isInList = true;
                  break;
               }
            }
            if (!isInList) {
               gw.showMessage("Not in word list");
               return;
            }
        }        
        for (int i = 0; i < s.length(); i++) {
            if (word.indexOf(s.charAt(i)) == i) {
               gw.setSquareColor(currentRow, i, gw.CORRECT_COLOR);
               gw.setKeyColor(s.substring(i, i+1).toUpperCase(), gw.CORRECT_COLOR);
            } else if (word.indexOf(s.charAt(i)) != -1) {
               gw.setSquareColor(currentRow, i, gw.PRESENT_COLOR);
               if (gw.getKeyColor(s.substring(i, i+1).toUpperCase()) != gw.CORRECT_COLOR) {
                  gw.setKeyColor(s.substring(i, i+1).toUpperCase(), gw.PRESENT_COLOR);
               }
            } else {
               gw.setSquareColor(currentRow, i, gw.MISSING_COLOR);
               gw.setKeyColor(s.substring(i, i+1).toUpperCase(), gw.MISSING_COLOR);
            }
        }
        
        if (found) {
            gw.showMessage("Congrats. You found the word!");
            return;
        } else if (currentRow < 5) {
            gw.setCurrentRow(currentRow+1);
        } else {
            gw.showMessage("Out of guesses. The word was '" + word + "'.");
        }
    }

/* Startup code */

    public static void main(String[] args) {
        new Wordle().run();
    }

/* Private instance variables */

    private WordleGWindow gw;
    private String word;
    private boolean found = false;
}
