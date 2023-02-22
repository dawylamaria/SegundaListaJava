public class Ques1 {
    public static void main(String[] args) {

        String data = mesPorExtenso(2,5,2020);
        System.out.println(data);
    }

    public static String mesPorExtenso(int dia, int mes, int ano){

        String nomeMes = "";

        if(mes == 1){
            nomeMes = "Janeiro";

        } else if (mes ==2){
            nomeMes = "Fevereiro";

        }else if (mes == 3){
            nomeMes = "Março";

        }else if (mes == 4){
            nomeMes = "Abril";

        } else if (mes == 5){
            nomeMes = "Maio";

        } else if (mes == 6){
            nomeMes = "Junho";

        } else if (mes == 7){
            nomeMes = "Julho";

        } else if (mes == 8){
            nomeMes = "Agosto";

        } else if (mes == 9){
            nomeMes = "Setembro";

        } else if (mes == 10){
            nomeMes = "Outubro";

        } else if (mes == 11){
            nomeMes = "Novembro";

        } else if (mes == 12){
            nomeMes = "Dezembro";

        }
        return String.format("%d de %s de %d", dia, nomeMes, ano);
    }
}
