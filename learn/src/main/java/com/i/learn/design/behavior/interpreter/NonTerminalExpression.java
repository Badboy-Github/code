package com.i.learn.design.behavior.interpreter;

/**
 * 非终结符表达式
 */
public class NonTerminalExpression implements AbstractExpression {

    private TerminalExpression expression1;

    private TerminalExpression expression2;

    public NonTerminalExpression(TerminalExpression expression1, TerminalExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public Object interpret(String info) {
        // 非终结符处理
        return null;
    }

}
