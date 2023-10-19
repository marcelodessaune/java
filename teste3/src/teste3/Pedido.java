package teste3;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int pedidoId;
    private Date dataEmissao;
    private float valorTotalCalculado;

    public float getValorTotalCalculado() {
        return valorTotalCalculado;
    }

    public void setValorTotalCalculado(float valorTotalCalculado) {
        this.valorTotalCalculado = valorTotalCalculado;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }
    private List<ItemPedido> itens;

    public Pedido(int pedidoId, Date dataEmissao, float valorTotalCalculado) {
        this.pedidoId = pedidoId;
        this.dataEmissao = dataEmissao;
        this.valorTotalCalculado = valorTotalCalculado;
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }
}
