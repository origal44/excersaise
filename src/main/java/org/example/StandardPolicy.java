package org.example;


public class StandardPolicy implements Policy {
    @Override
    public boolean isLegalMove(Board board, Direction direction) {
        int x = board.getPlayer().getPosition().getX();
        int y = board.getPlayer().getPosition().getY();
        int dx = direction.getDx();
        int dy = direction.getDy();
        x += dx;
        y += dy;
        Position pos = new Position(x, y);


        TileType tileType = board.getGrid()[y][x];


        if(tileType == TileType.WALL) {
            return false;
        }
        else if( board.getBoxes().contains(pos)) {
            TileType nextTileType = board.getGrid()[y+dy][x+dx];
            Position Nextpos =new Position(x+dx, y+dy);
            if(nextTileType == TileType.WALL || board.getBoxes().contains(Nextpos)) {
                return false;
            }else{
                return true;
            }

        }


        return true;

    }
}
