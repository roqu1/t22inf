package uml;

import javafx.scene.Node;

public class Operator extends Node {
    private final Operatortype operatortype;
    private final Node leftValue;
    private final Node rightValue;

    public Operator(Operatortype operatortype, Node leftValue, Node rightValue) {
        this.operatortype = operatortype;
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }



    public enum Operatortype {
        ADD{
            @Override
            double getValue(uml.Node leftvalue, uml.Node rightvalue){
                return leftvalue.getValue()+ rightvalue.getValue();
            }
        },
        SUBTRACT{
            @Override
            double getValue(uml.Node leftvalue, uml.Node rightvalue){
                return leftvalue.getValue() - rightvalue.getValue();
            }
        },
        MULTIPLY{
            @Override
            double getValue(uml.Node leftvalue, uml.Node rightvalue){
                return leftvalue.getValue() * rightvalue.getValue();
            }
        },
        DIVIDE{
            @Override
            double getValue(uml.Node leftvalue, uml.Node rightvalue){
                return leftvalue.getValue() / rightvalue.getValue();
            }
        },
        POWER{
            @Override
            double getValue(uml.Node leftvalue, uml.Node rightvalue){
                return Math.pow(leftvalue.getValue(),rightvalue.getValue());
            }
        };

        abstract double getValue(uml.Node leftvalue, uml.Node rightvalue);


    }

}
