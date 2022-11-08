package loesung;

public class Operator implements Node {

    private final Node leftValue;
    private final Node rightValue;
    private final OperatorType operatorType;

    public enum OperatorType {
        ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/"), POWER("^");

        private final String operatorType;

        OperatorType(String operatorType) {
            this.operatorType = operatorType;
        }

        @Override
        public String toString() {
            return this.operatorType;
        }
    }

    Operator(Node leftValue, Node rightValue, OperatorType operatorType) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
        this.operatorType = operatorType;
    }

    @Override
    public double getValue() {
        switch (this.operatorType) {
            case ADD:
                return this.leftValue.getValue() + this.rightValue.getValue();

            case SUBTRACT:
                return this.leftValue.getValue() - this.rightValue.getValue();

            case MULTIPLY:
                return this.leftValue.getValue() * this.rightValue.getValue();

            case DIVIDE:
                return this.leftValue.getValue() / this.rightValue.getValue();

            case POWER:
                return Math.pow(this.leftValue.getValue(), this.rightValue.getValue());

        }
        return Double.NaN;
    }

    @Override
    public String toString() {
        return this.operatorType + "(" + this.leftValue + ", " + this.rightValue + ")";
    }
}
