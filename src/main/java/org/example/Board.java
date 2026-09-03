package org.example;

import java.util.Set;

public class Board {
    private TileType[][] grid;
    private Player player;
    private Set<Position> boxes;
    private Set<Position> targets;
    private Policy policy;

    public Board(TileType[][] grid, Player player, Set<Position> boxes,
                 Set<Position> targets, Policy policy) {
        this.grid = grid;
        this.player = player;
        this.boxes = boxes;
        this.targets = targets;
        this.policy = policy;
    }

    public void move(Direction direction) {
        if (policy.isLegalMove(this, direction)) {

            Position dest = new Position(player.getPosition().getX() + direction.getDx(), player.getPosition().getY()+ direction.getDy());


            if(boxes.contains(dest)) {
                Position Ndest = new Position(dest.getX()+direction.getDx(), dest.getY()+direction.getDy());
                boxes.remove(dest);
                boxes.add(Ndest);

            }
            player.setPosition(dest);

        }

    }


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
