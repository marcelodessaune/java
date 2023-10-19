package teste3;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Loja {
    private int lojaId;
    private String nomeFantasia;
    private String cnpj;
    private double valorDeMercado;
    private List<Pedido> pedidos;

    public Loja(int lojaId, String nomeFantasia, String cnpj, double valorDeMercado) {
        this.lojaId = lojaId;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.valorDeMercado = valorDeMercado;
        this.pedidos = new ArrayList<>();
    }
      public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
       public Pedido consultarPedido(int pedidoId) {
        for (Pedido pedido : pedidos) {
            if (pedido.getPedidoId() == pedidoId) {
                return pedido;
            }
        }
        return null;
    }
       public void status(){
        System.out.println("=================");
        System.out.println("Nome da Loja: " + this.nomeFantasia);
        System.out.println("Valor de Mercado dela:R$ " + this.valorDeMercado);
       }
}
