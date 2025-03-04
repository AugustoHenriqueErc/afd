import java.util.HashMap;

public class State
{
    HashMap<String, State> affordableStates;
    public State()
    {
        affordableStates = new HashMap<>();
    }

    public void setAffordableState(State state, String symbol)
    {
        affordableStates.put(symbol, state);

    }

    public State transition(String symbol)
    {
        return affordableStates.get(symbol);
    }
}