package module;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CardMachine {
    private final int maxCount = 52;

    public void drawCard(int n) {
        if (n < 1 || n > 52) {
            System.out.println("Please enter a valid number(1 ~ 52)");
            return;
        }

        Set<Integer> randomArr = getRandomArray(n);
        for (int randomVal : randomArr) {
            Card card = new Card();
            card.setCardName(getTypeFromNum(randomVal) + mappedNumToString(randomVal));
            card.printCardName();
        }
    }

    public Set<Integer> getRandomArray(int n) {
        Random random = new Random();
        Set<Integer> randomSet = new HashSet<>();

        while (randomSet.size() < n) {
            randomSet.add(random.nextInt(maxCount) + 1);
        }

        return randomSet;
    }

    public CardType getTypeFromNum(int num) {
        int remains = num % 4;
        switch (remains) {
            case 0:
                return CardType.values()[0];
            case 1:
                return CardType.values()[1];
            case 2:
                return CardType.values()[2];
            case 3:
                return CardType.values()[3];
            default:
                return null;
        }
    }

    public String mappedNumToString(int num) {
        int remains = num % 13;
        if (remains >= 2 && remains <= 10) {
            return remains + "";
        } else {
            switch (remains) {
                case 1:
                    return "A";
                case 11:
                    return "J";
                case 12:
                    return "Q";
                case 0:
                    return "K";
                default:
                    return "Invalid input range!";
            }
        }
    }
}
