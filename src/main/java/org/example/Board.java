package org.example;

import java.util.Set;

// Board מחזיק את כל מצב הלוח, ומחזיק Player (בלי כפילות של playerPosition).
// Board הוא ה-receiver של MoveCommand - כאן חי ההיגיון שמבצע את התנועה.
// אבל הוא לא מחליט לבד מה מותר - הוא מתייעץ עם Policy (Strategy Pattern),
// שמוזרקת אליו מבחוץ דרך ה-constructor (Dependency Injection).
public class Board {
    private TileType[][] grid;
    private Player player;
    private Set<Position> boxes;
    private Set<Position> targets;
    private Policy policy;   // החוזה - לא מימוש ספציפי!

    public Board(TileType[][] grid, Player player, Set<Position> boxes,
                 Set<Position> targets, Policy policy) {
        this.grid = grid;
        this.player = player;
        this.boxes = boxes;
        this.targets = targets;
        this.policy = policy;
    }

    // ה-receiver של MoveCommand.
    public void move(String direction) {
        if (policy.isLegalMove(this, direction)) {
            // TODO: לבצע את התנועה בפועל -
            //  לעדכן את מיקום השחקן, ואת הקופסה אם דוחפים אותה
        }
        // אם המהלך לא חוקי - פשוט לא עושים כלום
    }

    // getters / setters לפי הצורך
    public TileType[][] getGrid() {
        return grid;
    }

    public Player getPlayer() {
        return player;
    }

    public Set<Position> getBoxes() {
        return boxes;
    }

    public Set<Position> getTargets() {
        return targets;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }
}
