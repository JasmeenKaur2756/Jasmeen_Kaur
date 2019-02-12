/*
 * Modifier: Jasmeen Kaur Bhatia
 * Student id: 991512713
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args) {
        System.out.print("Enter the number of picked card: ");
        Scanner k1 = new Scanner(System.in);
        int num = k1.nextInt();
        System.out.print("Enter the suit of picked card: ");
        Scanner k2 = new Scanner(System.in);
        String clr = k2.nextLine();

        int va;
        int b;
        Card[] magicHand = new Card[7];
        int[] val = new int[7];
        String[] mg = new String[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            va = (int) (1 + Math.random() * 13);
            c.setValue(va);
            val[i] = c.getValue();
            //System.out.println(va);
            b = (int) (Math.random() * 3);
            c.setSuit(Card.SUITS[b]);
            mg[i] = c.getSuit();
            System.out.println("Number is: " + va + " Suit is: " + mg[i]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

        int isValue = 0;
        for (int i = 0; i < val.length; i++) {
            if (num == val[i]) {
                isValue = 1;
                break;
            }

            int isValid = 0;
            for (int j = 0; j < mg.length; j++) {
                if (clr.equals(mg[i])) {
                    isValid = 1;
                    break;
                }
            }
            
            if(isValid==1 && isValue==1){
            System.out.println("Card Matched");
            }
            else
                System.out.println("Card not matched");
            
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
