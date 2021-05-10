package fr.univ_amu.iut.exercice4;


public class Robot {
    private GridPosition gridPosition;
    private Orientation orientation;

    public Robot(GridPosition gridPosition, Orientation orientation) {
        this.gridPosition = gridPosition;
        this.orientation = orientation;
    }

    public GridPosition getGridPosition() {
        return gridPosition;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void turnRight() {
        if(this.orientation == Orientation.NORTH)
            this.orientation = Orientation.EAST;
        else if(this.orientation == Orientation.EAST)
            this.orientation = Orientation.SOUTH;
        else if(this.orientation == Orientation.SOUTH)
            this.orientation = Orientation.WEST;
        else if(this.orientation == Orientation.WEST)
            this.orientation = Orientation.NORTH;
    }


    public void turnLeft() {
        if(this.orientation == Orientation.NORTH)
            this.orientation = Orientation.WEST;
        else if(this.orientation == Orientation.WEST)
            this.orientation = Orientation.SOUTH;
        else if(this.orientation == Orientation.SOUTH)
            this.orientation = Orientation.EAST;
        else if(this.orientation == Orientation.EAST)
            this.orientation = Orientation.NORTH;
    }

    public void advance() {
        throw new RuntimeException("Not yet implemented !");
    }
}

