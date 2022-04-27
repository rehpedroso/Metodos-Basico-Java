package calculadora;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("\nExercício calculadora:\n");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("\n\nExercício mensagem:\n");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(30); //Hora inválida;

        //Empréstimo
        System.out.println("\n\nExercício empréstimo:\n");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
