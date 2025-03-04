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
        for(State state: states)
        {
            if(state == finalState)
            {
                finalStates.add(state);
                break;
            }
            else throw new IllegalArgumentException("Afd does not have this state");
        }

    }
    public void setInitialState(State initialState)
    {

        for(State state: states)
        {
            if(state == initialState)
            {
                this.initialState = state;
                break;
            }
            else throw new IllegalArgumentException("Afd does not have this state");
        }
    }



    public void process(String word)
    {
        State currentState = initialState;
        char[] wordCharArray = word.toCharArray();
        String str = "";
        StringBuilder sb = new StringBuilder();
        boolean accepted = false;

      for(char c: wordCharArray)
       {
            sb.append(c);
       }

        for(int i = 0; i < sb.length();i++)
        {
            str = str + sb.toString();
            if(isSymbol(str))
            {
                currentState = currentState.transition(str);
                str ="";
                accepted = true;
            }
            else accepted = false;
        }

        if(accepted) System.out.print("Accepted");
        else System.out.print("Denied");
    }

    private boolean isSymbol(String symbol)
    {
        for(String a: alphabet)
        {
            if(a.equals(symbol)) return true;
            else return false;
        }
        return true;
    }




}