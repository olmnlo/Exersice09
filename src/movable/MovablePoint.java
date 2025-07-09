package movable;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int x_speed;
    private int y_speed;

    public MovablePoint(){
        x = 0;
        y = 0;
        x_speed = 0;
        y_speed = 0;
    }

    public MovablePoint(int x, int y, int x_speed, int y_speed) {
        this.x = x;
        this.y = y;
        this.x_speed = x_speed;
        this.y_speed = y_speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX_speed() {
        return x_speed;
    }

    public void setX_speed(int x_speed) throws RuntimeException {
        if (x_speed < 0){
            throw new RuntimeException("x_speed must be positive");
        }
        this.x_speed = x_speed;
    }

    public int getY_speed() {
        return y_speed;
    }

    public void setY_speed(int y_speed) throws RuntimeException{
        if (y_speed < 0){
            throw new RuntimeException("y_speed must be positive");
        }
        this.y_speed = y_speed;
    }

    @Override
    public void moveUp() {
        y += y_speed;
    }

    @Override
    public void moveDown() {
        y -= y_speed;
    }

    @Override
    public void moveRight() {
        x += x_speed;
    }

    @Override
    public void moveLeft() {
        x -= x_speed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", x_speed=" + x_speed +
                ", y_speed=" + y_speed +
                '}';
    }
}
