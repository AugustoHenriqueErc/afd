import java.util.HashMap;

public class State
{
    HashMap<String, State> affordableStates;
    public State
    {
        affordableStates = new HashMap<>();
    }

    public setAffordableStates(State state, String symbol)
    {
        states.put(symbol, state);

    }

    public State δ(String symbol)
    {
        return states.get(symbol);
    }
}