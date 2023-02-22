//questao 3

public class Ques3 {
    public static void main(String[] args) {

        double soma = somaImposto(10,45);
        System.out.println(soma);

    }
    public static double somaImposto( double taxaImposto, double custo){
        return custo + (custo * taxaImposto / 100);
    }
}
