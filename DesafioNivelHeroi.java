import java.util.EnumMap;
import java.util.Scanner;

public class DesafioNivelHeroi {

    public static void main(String[] args) {
        String nomeHeroi = "";
        float quantidadeXp = 0f;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do herói: ");
        nomeHeroi = scanner.nextLine();
        System.out.print("Digite a quantidade de XP: ");
        quantidadeXp = Float.parseFloat(scanner.nextLine());

        if (quantidadeXp < 1000) {
            System.out.println(nomeHeroi + " é um herói de Ferro.");
        } else if (quantidadeXp <= 2000) {
            System.out.println(nomeHeroi + " é um herói de Bronze.");
        } else if (quantidadeXp <= 5000) {
            System.out.println(nomeHeroi + " é um herói de Prata.");
        } else if (quantidadeXp <= 7000) {
            System.out.println(nomeHeroi + " é um herói de Ouro.");
        } else if (quantidadeXp <= 8000) {
            System.out.println(nomeHeroi + " é um herói de Platina.");
        } else if (quantidadeXp <= 9000) {
            System.out.println(nomeHeroi + " é um herói Ascendente.");
        } else if (quantidadeXp <= 10000) {
            System.out.println(nomeHeroi + " é um herói Imortal.");
        } else {
            System.out.println(nomeHeroi + " é um herói Radiante.");
        }
    }
}
