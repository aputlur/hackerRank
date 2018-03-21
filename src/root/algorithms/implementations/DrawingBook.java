package root.algorithms.implementations;

public class DrawingBook {


    static int simpleSolution(int n, int p) {

        return Math.min(p / 2, n / 2 - p / 2);
    }

    public static void main(String[] args) {

        System.out.println("simple Solution -> "+ simpleSolution(29,14));
    }
}
