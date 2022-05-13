import java.util.Scanner;

public class CarvalhoTeixeiraQ1 {
    public static void main(String[] args){

        Scanner ler = new Scanner (System.in);

        System.out.print("Informe a idade: ");
        int idade = ler.nextInt();

        if(idade >= 18 && idade <= 65){
            System.out.println("Votar é obrigatório.");
        }
        else if(idade < 16){
            System.out.println("Não pode votar.");
        }
        else{
            System.out.println("Votar é facultativo.");
        }

    }
}