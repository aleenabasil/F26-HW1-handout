package edu.ucdavis.ecs160.hw1;

public final class Div extends BinaryExpr {
    public Div(Expr left, Expr right) {
        super(left, right);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitDiv(this);
}
}
