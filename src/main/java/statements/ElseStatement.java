package statements;

import base.Base;

import java.util.List;

public class ElseStatement extends Statement {
    private List<Base> statements;

    public ElseStatement(List<Base> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Base stat : statements) {

            builder.append(stat.toString());
            if (!stat.toString().endsWith("}"))
                builder.append(";");

        }
        return "else{" + builder + "}";
    }
}
