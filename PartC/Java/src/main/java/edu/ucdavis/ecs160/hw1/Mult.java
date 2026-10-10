package edu.ucdavis.ecs160.hw1;

public final class Mult extends BinaryExpr {
    public Mult(Expr left, Expr right) {
        super(left, right);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitMult(this);
    }
}
