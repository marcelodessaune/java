package teste3;

public class ItemPedido {
    private int itemPedidoId;
    private String item;
    private int quantidade;
    private float precoUnitario;

    public ItemPedido(int itemPedidoId, String item, int quantidade, float precoUnitario) {
        this.itemPedidoId = itemPedidoId;
        this.item = item;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public float calcularPrecoTotal() {
        return quantidade * precoUnitario;
    }
}
