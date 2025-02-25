public class main
{
    public static void main(String[] args)
    {
        //Criação de estados
        State q0 = new State();
        State q1 = new State();
        State q2 = new State();

        //Setando estados acessíveis

        q0.setAffordableState(q1, 0);
        q1.setAffordableState(q1, 1);
        q1.setAffordableState(q2, 0);


    }
}