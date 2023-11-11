# Composite

## Diagrama

![Composite](https://github.com/JoaoGRMira/bertoti/blob/main/Engenharia%20de%20Software%20III/Composite/images/Composite.png)

## Código

```java
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
```

```java
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
```

```java
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
```

```java
public interface Streaming {
    void assinar();
    double getAssinaturaPreco();
}
```