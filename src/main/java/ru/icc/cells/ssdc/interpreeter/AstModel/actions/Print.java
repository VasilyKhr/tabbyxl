package ru.icc.cells.ssdc.interpreeter.AstModel.actions;

import ru.icc.cells.ssdc.interpreeter.AstModelInterpreeter;

import java.util.ArrayList;
import java.util.List;

public class Print extends Action {

    public Print(int id, String name) {
        super(id, name);
    }

    private List<String> expression = new ArrayList<>();

    public List<String> getExpression() {
        return expression;
    }

    public void addPartToExpression(String part) {
        this.expression.add(part);
    }

    @Override
    public String generateAddSet() {

        StringBuilder code = new StringBuilder();

        code.append("System.out.println( ").append(AstModelInterpreeter.buildExpression(expression, "")).append(" )");

        return code.toString();
    }
}
