import java.util ArraList;
import java.util HashMap;

public class Afd
{
    ArrayList<State> states;
    ArrayList<String> alphabet;
    State initialState;
    ArrayList<State> finalStates;
    String word;
    public Afd(State initialState)
    {
        states = new ArrayList<>();
        alphabet = new ArrayList<>();
        finalStates = new ArrayList<>();
    }

    public void setAlphabet(String symbol)
    {
        alphabet.add(symbol);
    }

    public void setStates(State state)
    {
        states.add(state);
    }

    public void setFinalStates(State finalState)
    {
        for(State state: states)
        {
            if(state == finalState) finalStates.add(state);
            else throw new IllegalArgumentException("Afd does not contain this state");
        }

    }



    public void process(String word)
    {
        State actualState = initial;
        word = word.toCharArray();
        for(int i = 0; i < word.lenght();i++)
        {
        }
    }

    private int isSymbol(String symbol)
    {

    }




}