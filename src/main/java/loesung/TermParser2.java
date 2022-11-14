package loesung;

public class TermParser2 {
    private final String input;
    private String[] stack;
    private String output;
    private String temp;

    public TermParser2(String input) {
        this.input = input;
    }

    public String[] parse2 () {
        temp = input;
        for (int i = 0; i <input.length() ; i++) {
            // Wenn Token eine Zahl ist, dann geht es zur Ausgabe
            if (CharacterLists.NUMBERS.contains(input.charAt(i))) {
                output += input.charAt(i);
            }
            // Wenn

        }


        return null;
    }



}
