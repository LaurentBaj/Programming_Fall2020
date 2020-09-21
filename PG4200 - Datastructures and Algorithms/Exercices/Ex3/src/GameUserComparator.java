package org.pg4200.ex03;

import java.util.Comparator;

public class GameUserComparator implements Comparator<GameUser> {

    GameUser laurent, magnus;

    @Override
    public int compare(GameUser o1, GameUser o2) {

        if (o1.getPoints() == o2.getPoints()) {
            return o1.getUserId().compareTo(o2.getUserId());
        }

        return o1.getPoints() - o2.getPoints();
    }
}
