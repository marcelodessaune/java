package teste1;
import java.util.ArrayList;
import java.util.List;

public class Municipio {
    List<Imovel> imoveis = new ArrayList<>();

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }
}
