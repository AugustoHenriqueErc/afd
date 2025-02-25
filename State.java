import java.util.HashMap;

public class State
{
    HashMap<String, State> affordableStates;
    public State
    {
        affordableStates = new HashMap<>();
    }

    public setAffordableState(State state, String symbol)
    {
        states.put(symbol, state);

    }

    public State transition(String symbol)
    {
        return states.get(symbol);
    }
}