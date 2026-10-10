package edu.ucdavis.ecs160.hw1;

public abstract sealed class BinaryExpr implements Expr permits Add, Sub, Mult, Div {
    private final Expr left;
    private final Expr right;

    protected BinaryExpr(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    public Expr getLeft() {
        return left;
    }

    public Expr getRight() {
        return right;
    }
}
