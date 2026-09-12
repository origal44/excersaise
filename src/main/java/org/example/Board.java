package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@AllArgsConstructor
public class Board {
    private TileType[][] grid;
    private Player player;
    private Set<Position> boxes;
    private Set<Position> targets;
    @Setter
    private Policy policy;

    public void move(Direction direction) {
        if (policy.isLegalMove(this, direction)) {
            Position dest = new Position(player.getPosition().getX() + direction.getDx(),
                    player.getPosition().getY() + direction.getDy());

            if (boxes.contains(dest)) {
                Position Ndest = new Position(dest.getX() + direction.getDx(),
                        dest.getY() + direction.getDy());
                boxes.remove(dest);
                boxes.add(Ndest);
            }
            player.setPosition(dest);
        }
    }

    public void placeWall(Position pos) {
        grid[pos.getY()][pos.getX()] = TileType.WALL;
    }

    public void placeFloor(Position pos) {
        grid[pos.getY()][pos.getX()] = TileType.FLOOR;
    }

    public void placeBox(Position pos) {
        boxes.add(pos);
    }

    public void placeTarget(Position pos) {
        targets.add(pos);
    }

    public void setPlayer(Position pos) {
        player.setPosition(pos);
    }

    public void initGrid(int width, int height) {
        grid = new TileType[height][width];
        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++)
                grid[y][x] = TileType.FLOOR;
    }
}