import java.util.Scanner;
import java.util.ArrayList;

public class Estoque {
    
    ArrayList<Console> estoqueConsoles = new ArrayList<Console>();
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Estoque criaestoque = new Estoque();
        criaestoque.adicionar();

    }
    public void adicionar() {
        System.out.println("Insira quantos numeros de consoles deseja adicionar ao estoque:");
        int numeroAdicionar = sc.nextInt();   
        for (int i = 0; i<numeroAdicionar;i+=1){
            sc.nextLine();
            System.out.print("Insira o nome do console: ");
            String nome = sc.nextLine();
            System.out.print("Insira o marca do console: ");
            String marca = sc.nextLine();
            System.out.print("Insira o modelo do console: ");
            String modelo = sc.nextLine();
            System.out.print("Insira o hd(gigas de memória) do console: ");
            double hd = sc.nextDouble();
            sc.nextLine();
            System.out.print("Insira a cor do console: ");
            String cor = sc.nextLine();
            Especificacao espec = new Especificacao(marca, modelo, hd, cor);
            Console item = new Console(nome,espec);
            estoqueConsoles.add(item);
            System.out.println(estoqueConsoles);

        }
    }
}
