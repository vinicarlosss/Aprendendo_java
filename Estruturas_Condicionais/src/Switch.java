public class Switch {
    public static int semana(String dia){
        switch(dia){
            case "Segunda":
                return 2;
            case "Terça":
                return 3;
            case "Quarta":
                return 4;
            case "Quinta":
                return 5;
            case "Sexta":
                return 6;
            case "Sábado":
                return 7;
            case "Domingo":
                return 1;
            default:
                return 0;
        }
    }
    public static String numero(int number){
        switch (number){
            case 1:
            case 2:
            case 3:
                return "Certo";
            case 4:
                return"Errado";
            case 5:
                return "Talvez";
            default:
                return "Digite outro número";
        }
    }
}
