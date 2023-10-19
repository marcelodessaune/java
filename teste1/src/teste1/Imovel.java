package teste1;

public class Imovel {
    String nome;
    double imposto;
    int mesesAtraso;
    double multa;

    public Imovel(String nome, double imposto, int mesesAtraso) {
        this.nome = nome;
        this.imposto = imposto;
        this.mesesAtraso = mesesAtraso;
        calcularMulta();
    }

    public void calcularMulta() {
        if (this.mesesAtraso <= 5) {
            this.multa = this.imposto * 0.01;
        } else if (this.mesesAtraso >= 6 && this.mesesAtraso <= 8) {
            this.multa = this.imposto * 0.023;
        } else if (this.mesesAtraso >= 9 && this.mesesAtraso <= 10) {
            this.multa = this.imposto * 0.03;
        } else if (this.mesesAtraso >= 11 && this.mesesAtraso <= 12) {
            this.multa = this.imposto * 0.054;
        } else if (this.mesesAtraso > 12) {
            this.multa = this.imposto * 0.10;
        }
    }

    public void status(){
        System.out.println("=================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Valor do imposto: " + this.imposto);
        System.out.println("Quantidade de meses que atrasou: " + this.mesesAtraso);
        System.out.println("Percentual de Multa: " + this.multa);
    }
    
    public double getMulta() {
        return multa;
    }
}
