import java.util.Scanner;

class BatistaMoraisQ5{

    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.print("Digite um numero entre 1 e 7: ");
        int diaSemana = scan.nextInt();

        System.out.print("Dia da semana correspondente e: ");
        switch(diaSemana){

            case 1:
            System.out.println("Domingo");
            break;
            
            case 2:
            System.out.println("Segunda-feira");
            break;

            case 3:
            System.out.println("Terca-feira");
            break;

            case 4:
            System.out.println("Quarta-feira");
            break;

            case 5:
            System.out.println("Quinta-feira");
            break;

            case 6:
            System.out.println("Sexta-feira");
            break;

            case 7:
            System.out.println("Sabado");
            break;
            
        }




    }
}
