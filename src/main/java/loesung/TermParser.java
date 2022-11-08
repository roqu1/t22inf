package loesung;

import java.util.*;


public class TermParser {
    private String input;
    private String[] arr;

    public TermParser(String input) {
        this.input = input;
    }

    //Remove spaces from input
    public String[] parse () {
        input = input.replaceAll(" ","");

        String temp = input;

        for (int i = 0; i < input.length(); i++) {
            //check if there is a minus and a number after that
            if (input.charAt(i) == '-' && CharacterLists.NUMBERS.contains(input.charAt(i+1))) {
                // check if there's in one more operator in front of minus or if minus is the first char
                if (input.charAt(0) == '-' || CharacterLists.OPERATORS.contains(input.charAt(i-1))) {
                    i++;
                }
            }
            // operator or bracket
            if (CharacterLists.OPERATORS.contains(input.charAt(i)) || input.charAt(i) == '(' || input.charAt(i) == ')') {
                temp = temp.replace(String.valueOf(input.charAt(i))," " + input.charAt(i)+ " ");
            }

            // comma changes into dots
            temp = temp.replace(',','.');
            // split everything after space
            arr = temp.split(" ");
            // the arr will be imported in a new arraylist
            ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
            //deletes the clear String
            list.removeIf(s -> (s.equals("")));

            arr = list.toArray(arr);
        }
        return null;
    }






    /*public static void parse(String input) {

    }
    public static String parceToString(String infixNotation) throws Exception {
        List<String> outputStack = new LinkedList<>();
        char lastChar = infixNotation.charAt(0);
        Stack<Character> operatorStack = new Stack<>();

        //komma auf punkt ersetzen und leertaster entfernen
        infixNotation = infixNotation.replace(",",".");
        infixNotation = infixNotation.replace(" ","");

        //jedes Char dürchgehen
        for (int i = 0; i < infixNotation.length(); i++) {
            char charnow = infixNotation.charAt(i);

            if (charnow == "-" && lastChar == "(") {
                char
            }


        }
    } */
}
