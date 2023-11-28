# MVC + Facade + Singleton

## Diagrama

![MVC + Facade + Singleton](https://github.com/JoaoGRMira/bertoti/blob/main/Engenharia%20de%20Software%20III/MVC%20%2B%20Facade%20%2B%20Singleton/images/MVC%2BFacade%2BSingleton.png)

## Código

```java
public class Anual implements Plano {
    private View view;
    private Streaming streaming;

    public void assinarPlano() {
        System.out.println("Você assinou o plano anual.");
    }

  public void setView(View v){
    this.view = v;
  }
  
}
```

```java
public class Assinatura{
    private String plataforma;
    
    public Assinatura(String plataforma){
      this.plataforma = plataforma;
    }
    
    public String getPlataforma(){
      return this.plataforma;
    }  
}
```

```java
public class Mensal implements Plano {
    private View view;
    private Streaming streaming;

    public void assinarPlano() {
        System.out.println("Você assinou o plano mensal.");
    }

  public void setView(View v){
    this.view = v;
  }  
}
```

```java
import java.util.List;

public interface Observer {
  public void update(List<Assinatura> l); 
}
```

```java
public interface Plano{
    private View view;
    private Streaming streaming;
    
    public void assinarPlano();
  }
```

```java
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
```

```java
import java.util.List;

public interface Subject{
  public void registerObserver(Observer o);
  public void notifyObservers(List<Assinatura> l);
}
```

```java
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
```

```java
import java.util.List;

class Singleton implements Streaming {
    private String assinante;

    public Singleton(String assinante) {
        this.assinante = assinante;
    }

    public void update(Assinatura assinaturas) {
        System.out.println("A lista de assinaturas foi atualizada");      
    }
}
```

```java
import java.util.List;

public class Facade {
    private Streaming streaming;
    private View view;

    public Facade() {
        this.streaming = new Plano();
        this.view = new View(streaming);
    }

    public List<Assinatura> assinarPlano() {
        return streaming.assinaturas();
    }

    public List<Assinatura> setPlano() {
        return streaming.assinaturas();
    }
}
```
