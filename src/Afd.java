import java.util.ArrayList;

public class Afd
{
    ArrayList<State> states;
    ArrayList<String> alphabet;
    State initialState;
    ArrayList<State> finalStates;
    String word;
    public Afd()
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
        boolean found = false;
        for(State s: states)
        {
            if(s == finalState)
            {
                finalStates.add(s);
                found = true;
                break;
            }
        }
        if(!found) throw new IllegalArgumentException("Afd does not have this state");

    }
    public void setInitialState(State initialState)
    {
        boolean found = false;
        for(State s: states)
        {
            if(s == initialState)
            {
                this.initialState = s;
                found = true;
                break;
            }
        }
        if(!found) throw new IllegalArgumentException("Afd does not have this state");
    }

    private boolean isSymbol(String symbol)
    {
        for(String a: alphabet)
        {
            if(a.equals(symbol)) return true;
        }
        return false;
    }

    private boolean isFinalState(State state)
    {
        for(State s:finalStates)
        {
            if(s == state) return true;
        }
        return false;
    }

    public void proccess(String word)
    {
        char[] wordChar = word.toCharArray();
        String symbol = String.valueOf(wordChar[0]);
        State currentState = initialState;
        boolean accepted = false;
        for(int i= 0; i < wordChar.length; i++)
        {
            if(isSymbol(symbol)) currentState = currentState.transition(symbol);
            else symbol = symbol + String.valueOf(wordChar[i+1]);
            if(i == wordChar.length-1 && isSymbol(symbol) && isFinalState(currentState)) accepted = true;
        }
        if(accepted) System.out.println("Accepted");
        else System.out.println("Denied");
    }
}