package teste1;
public class Teste1 {

    public static void main(String[] args) {
        Municipio municipio = new Municipio();

        Imovel imovel1 = new Imovel("Proprietario1", 1000, 6);
        Imovel imovel2 = new Imovel("Proprietario2", 1500, 9);

        municipio.adicionarImovel(imovel1);
        municipio.adicionarImovel(imovel2);
        
        imovel1.status();
        imovel2.status();

    }
    
}
