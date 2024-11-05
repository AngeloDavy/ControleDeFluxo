package desafio;

public class Contador {

    public void contar(int paramentroUm, int paramentroDois) throws ParametrosInvalidosExeception{

        int contagem = paramentroDois - paramentroUm;

        for (int x = 0; x <= contagem ; x++){
            System.out.println("Imprimindo o número" + " " + x);
        }

    }

}
