package org.example;

public class Player {

    Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Player(Position position) {
        this.position = position;
    }
}

