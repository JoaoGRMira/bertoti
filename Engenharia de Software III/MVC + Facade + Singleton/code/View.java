import java.util.List;

public class View implements Observer{
  private Plano plano;
  private List<Assinatura> assinaturas;
  
  public void setPlano(Assinatura a){
    this.plano = a;
  }
  
  public void update(List<Assinatura> l){
    this.assinaturas = l;
  }
}