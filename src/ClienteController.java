import java.util.Scanner;

public class ClienteController {

    public static void main(String[] args) {

        int aux = Integer.parseInt(digita("quantas pessoas tu quer incluir? "));

        for (int i = 0; i < aux; i++) {
            Cliente cliente = criaCliente();
        }
    }

    public static Cliente criaCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome(digita("nome: "));
        return cliente;
    }

    public static String digita(String mens) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mens);
        return teclado.next();
    }// ======= final do digita =========
}
