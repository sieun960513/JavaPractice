public class node {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int setX(int x) {
        return this.x = x;
    }

    public int getY() {
        return y;
    }

    public int setY(int y) {
        return this.y = y;
    }

    public node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public node getCenter(node other) {
        return new node((this.x + other.getX() / 2), (this.y + other.getY() / 2));
    }
}