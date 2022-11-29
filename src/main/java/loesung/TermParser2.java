package loesung;

import java.util.ArrayList;
import java.util.List;

public class TermParser2 {
    private final String input;
    private ArrayList<String> stack;
    private ArrayList<String> output;
    private String temp;

    public TermParser2(String input) {
        this.input = input;
    }

    public String[] parse2 () {
        temp = input;
        for (int i = 0; i <input.length() ; i++) {
            //input comma change on dots
            temp = temp.replace(",",".");
            //temp deletes space between
            temp = temp.replace(" ","");
            // Wenn Token eine Zahl ist, dann geht es zur Ausgabe
            if (CharacterLists.NUMBERS.contains(temp.charAt(i))) {
                stack.add(String.valueOf(temp.charAt(i)));
            }
            // Check if token is operator
            if (CharacterLists.OPERATORS.contains(temp.charAt(i))) {
                //if stack not clear and stack-start operator
                if (stack.size() > 0 &&  CharacterLists.OPERATORS.contains(stack.get(stack.size()-1))) {
                    // if operator <= than stack-start = stack-start to output
                    ArrayList<String> smalloperators = new ArrayList<>();
                    smalloperators.add(0,"+");
                    smalloperators.add(1,"-");
                    ArrayList<String> bigoperators = new ArrayList<>();
                    bigoperators.add(0,"*");
                    bigoperators.add(1,"/");
                   /* if (String.valueOf(temp.charAt(i)) == stack.get(stack.size()-1)
                        || String.valueOf(temp.charAt(i)) ==smalloperators.get(0)
                        && String.valueOf(temp.charAt(i)) ==smalloperators.get(1)
                        && String.valueOf(temp.charAt(i)) ==
                    )
                    {

                    }*/
                }
                //check if token a open-bracket is
                if (temp.charAt(i) == '(') {
                    output.add(String.valueOf(temp.charAt(i)));
                }
                //Check if token a close-bracket is
                if (temp.charAt(i) == ')') {

                }
            }

        }


        return null;
    }



}
