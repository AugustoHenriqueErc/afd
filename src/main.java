import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in,"ISO-8859-1");
        String word;

        //Criação de estados
        State q0 = new State();
        State q1 = new State();
        State q2 = new State();

        //Setando estados acessíveis

        q0.setAffordableState(q1, "0");
        q1.setAffordableState(q1, "1");
        q1.setAffordableState(q2, "0");

        //Criando afd teste, linguagem 0(1)*0
        Afd afd1 = new Afd();

        //Setando alfabeto
        afd1.setAlphabet("0");
        afd1.setAlphabet("1");

        //Setando grupo de estados
        afd1.setStates(q0);
        afd1.setStates(q1);
        afd1.setStates(q2);

        //Setando estado inicial
        afd1.setInitialState(q0);


        //Setando estado final
        afd1.setFinalStates(q2);

        //Afd processa a palavra
        word = scr.nextLine();
        afd1.proccess(word);

    }
}