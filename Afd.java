import java.util HashMap;

public class Afd
{
    HashMap<State,String> states;
    StringBuilder alphabet;
    State initial;
    HashMap<State, String> finalStates;
    StringBuilder word;
    public Afd
    {
        states = new HashMap<>();
        alphabet = new StringBuilder();
        finalStates = new HashMap<>();

    }

    public void process(String word)
    {
        State actualState = initial;
        word = new StringBuilder(word);
        for(int i = 0; i < word.lenght();i++)
        {
            if(isSymbol(word.get(i))!= -1) actualState.δ(word.get(i)) = actualState;
        }
    }

    private int isSymbol(String Symbol)
    {
        return word.indexOf(Symbol);
    }




}