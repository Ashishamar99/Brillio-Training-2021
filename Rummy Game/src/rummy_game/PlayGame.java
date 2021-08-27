package rummy_game;

import java.util.ArrayList;
import java.util.List;

public class PlayGame {
    public static void main(String[] args) {
        List<CARD> mycards = CARD.getPackOfCards();
        CARD.shuffleCards(mycards);

        System.out.println("Shuffled Cards -->");
        System.out.println(mycards);


        List<CARD> user1 = mycards.subList(0,8);
        List<CARD> user2 = mycards.subList(8,15);
        List<CARD> user3 = mycards.subList(15,22);

        List<CARD> users = new ArrayList<CARD>();
        for (int i=0, j=0, k=0; i<user1.size() && j<user2.size() && k<user3.size(); i++, j++, k++){
            users.add((CARD) user1.toArray()[i]);
            users.add((CARD) user2.toArray()[j]);
            users.add((CARD) user3.toArray()[k]);
        }


        mycards.removeAll(users);

        System.out.println("\nRemaining Cards -->");
        System.out.println(mycards);


    }
}
