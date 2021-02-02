package ListaDeExercicio01_Exercicio13;

public class ContaDias {

    public static int contaDias(int mes , int ano ) {

        int dias = 0;

        if (mes == 1) {
            dias = 31;
        }else if  (mes == 2) {
            dias = 28;
        }else if  (mes == 3) {
            dias = 31;
        }else if  (mes == 4) {
            dias = 30;
        }else if  (mes == 5) {
            dias = 31;
        }else if  (mes == 6) {
            dias = 30;
        }else if  (mes == 7) {
            dias = 31;
        }else if  (mes == 8) {
            dias = 31;
        }else if  (mes == 9) {
            dias = 30;
        }else if  (mes == 10) {
            dias = 31;
        }else if  (mes == 11) {
            dias = 30;
        }else {
            dias = 31;
        }

        // se o ano for maior que 400
        if(ano % 400 == 0){
            //System.out.println(ano + " bissexto.");

            if(mes ==2) {
                return dias + 1;
            }else{
                return dias;
                }

            // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            //System.out.println(ano + " é bissexto.");
            if(mes ==2) {
                return dias + 1;
            }else{
                return dias;
            }
        } else{
            //System.out.println(ano + " não é bissexto");
            return dias;
        }

}

}
