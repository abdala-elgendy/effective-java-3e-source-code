package effectivejava.chapter4.item17;

public final class ImmutablePoint {
/*
* No setters or methods to modify the fields
* Fields are private and final
* The class is final, so it cannot be subclassed
* */
// we can't modify x and y
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" + "x=" + x + ", y=" + y + '}';
    }
    public static void main(String[] args) {
        ImmutablePoint p1 = new ImmutablePoint(2, 3);
        System.out.println(p1.getX() + " " + p1.getY() );

    }
}

