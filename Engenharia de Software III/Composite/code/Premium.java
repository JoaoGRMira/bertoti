public class Premium implements Streaming {
  private String plataforma;
  private double preco;

  public Premium(String plataforma, double preco) {
    this.plataforma = plataforma;
    this.preco = preco;
  }

public void setPremium(Double preco, String plataforma){
    this.plataforma = plataforma
    this.preco = preco
}

  public double getAssinaturaPreco() {
    return this.preco;
  }

  @Override
  public void assinar() {
      System.out.println("Assinando o plano premium na plataforma " + this.plataforma + " por: R$" + this.valor);
  }
}