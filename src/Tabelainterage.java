
import java.util.Scanner;

public class Tabelainterage {
    public static void main(String[] args) throws Exception {
        vetorcarros vetor = new vetorcarros(50);

        carros c1 = new carros("Ferrari","04","Ferrari","oi9k23l");
        carros c2 = new carros("Fusca","32","Volkswagen","eicjeed");
        carros c3 = new carros("Fiorino","53","Fiat","9j32ck");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);


        Scanner leia = new Scanner(System.in);
        String nome,num,m,p;
        int posicao;
        int resp ;

        do {


            System.out.println("""
                    Bem vindo ao gerenciador de estacionamento:Escolha uma das alternativas
                    (D)ados dos carros
                    (B)uscar carros
                    (M)udar dados do carro
                    (A)dicionar carro
                    (R)emover carro
                    (S)air""");

            String input = leia.next();

            switch (input) {
                case "D", "d":
                    System.out.println("Os dados dos carros são: " + vetor);
                    break;
                case "B", "b":
                    System.out.println("Digite a posição do carro(a partir do 0): ");
                    posicao = leia.nextInt();
                    System.out.println("A posicao do carro é; " + vetor.buscar(posicao));
                    break;
                case "m","M" :
                    System.out.println("Digite a posição a ser alterada :");
                    posicao = leia.nextInt();
                    System.out.println("Digite o nome do carro : ");
                     nome = leia.next();
                    System.out.println("Digite o numero do carro : ");
                    num = leia.next();
                    System.out.println("Digite a marca do carro :");
                    m = leia.next();
                    System.out.println("Digite a placa do carro : ");
                    p = leia.next();


                    carros porta = new carros(nome, num, m, p);
                    vetor.alterarCarro(posicao,porta);
                    break;
                case "A", "a":
                    System.out.println("Digite o nome do carro : ");
                     nome = leia.next();
                    System.out.println("Digite o numero do carro : ");
                    num = leia.next();
                    System.out.println("Digite a marca do carro :");
                     m = leia.next();
                    System.out.println("Digite a placa do carro : ");
                     p = leia.next();

                    carros porta1 = new carros(nome, num, m, p);
                    vetor.adiciona(porta1);
                    System.out.println("Dados dos carros: " + vetor);
                    break;
                case "R", "r":
                    System.out.println("Digite a posição do carro a ser removido(a partir do 0): ");
                    posicao = leia.nextInt();
                    vetor.remove(posicao);
                    System.out.println("Dados dos carros: " + vetor);
                    break;
                case "S","s" :
                    return;
            }

            System.out.println("Deseja Continuar explorando 0 para sim e 1 para não!!!");
            resp = leia.nextInt();

        }while(resp != 1);



    }
}
