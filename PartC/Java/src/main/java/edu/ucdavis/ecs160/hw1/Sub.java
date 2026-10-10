package edu.ucdavis.ecs160.hw1;

public final class Sub extends BinaryExpr {
    public Sub(Expr left, Expr right) {
        super(left, right);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitSub(this);}
}
