package edu.ucdavis.ecs160.hw1;

public final class Add extends BinaryExpr {
    public Add(Expr left, Expr right) {
        super(left, right);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitAdd(this);
    }
}
