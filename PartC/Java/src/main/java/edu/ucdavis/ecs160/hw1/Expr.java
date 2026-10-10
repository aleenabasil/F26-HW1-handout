package edu.ucdavis.ecs160.hw1;

public sealed interface Expr permits Num, BinaryExpr {
    <T> T accept(Visitor<T> visitor);

    interface Visitor<T> {
        T visitNum(Num num);
        T visitAdd(Add add);
        T visitSub(Sub sub);
        T visitMult(Mult mult);
        T visitDiv(Div div);
    }
}
