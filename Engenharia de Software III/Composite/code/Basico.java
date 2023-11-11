public class Basico implements Streaming {
  private String plataforma;
  private double preco;

  public Basico(String plataforma, double preco) {
    this.plataforma = plataforma;
    this.preco = preco;
  }

public void setBasico(Double preco, String plataforma){
    this.plataforma = plataforma
    this.preco = preco
}

  public double getAssinaturaPreco() {
    return this.preco;
  }

  @Override
  public void assinar() {
      System.out.println("Assinando o plano básico na plataforma " + this.plataforma + " por: R$" + this.valor);
  }
}