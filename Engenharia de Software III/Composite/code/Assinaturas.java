import java.util.ArrayList;
import java.util.List;

public class Assinaturas implements Streaming {
  private List<Streaming> streamings;
  private double preco;

  public Assinaturas() {
    this.streamings = new ArrayList<>();
    this.preco = 0.00;
  }

  @Override
  public void assinar() {
    System.out.println("Preço da assinatura: R$"+this.preco);
  }

  @Override
  public double getAssinaturaPreco(){
    return this.preco;
  }

  public void addStreamings(Streaming streaming) {
    streamings.add(streaming);
    this.preco += streaming.getAssinaturaPreco();
  }

  public void removerStreaming(Streaming streaming) {
    streamings.remove(streaming);
    this.preco -= streaming.getAssinaturaPreco();
  }

  public List<Streaming> getStreamings() {
    return streamings;
  }
}