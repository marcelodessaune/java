package teste3;
import java.util.Date;

public class Teste3 {
    public static void main(String[] args) {

        Loja minhaLoja = new Loja(1, "Minha Loja", "1234567890", 1000000.0);

        Pedido pedido1 = new Pedido(1, new Date(), (float) 500.0);

        ItemPedido item1 = new ItemPedido(1, "Item 1", 5, (float) 20.0);
        ItemPedido item2 = new ItemPedido(2, "Item 2", 3, (float) 15.0);

        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);

        minhaLoja.adicionarPedido(pedido1);
       
        Funcionario f1 = new Funcionario ("Marcelo", "1234", 5000);
        
        f1.statusF();
        minhaLoja.status();
        
        
        Pedido pedidoConsultado = minhaLoja.consultarPedido(1);
        if (pedidoConsultado != null) {
            System.out.println("Valor total do pedido:R$ " + pedidoConsultado.getValorTotalCalculado());
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }
}
