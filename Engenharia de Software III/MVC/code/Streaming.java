import java.util.List;

public class Streaming implements Subject{
  private List<Assinatura> assinaturas;
  private List<Observer> observers;
  
  public void registerObserver(Observer o){
    this.observers.add(o);
  }
  
  public void notifyObservers(List<Assinatura> l){
    this.observers.stream().forEach(ob -> {
      System.out.println("Plataforma assinada:");
      l.stream().forEach(p -> {
        System.out.println(p.getPlataforma());
      });
    });
  }
  
  public void realizarAssinatura(Assinatura a){
    this.assinaturas.add(a);
  }
 
  public Assinatura cancelarAssinatura(String plataforma){
    return this.assinaturas.stream().filter(r -> r.getPlataforma().equalsIgnoreCase(plataforma)).findFirst().get();
  }
}