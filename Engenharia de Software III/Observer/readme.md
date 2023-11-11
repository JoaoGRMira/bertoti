# Observer

## Diagrama

![Observer](https://github.com/JoaoGRMira/bertoti/blob/main/Engenharia%20de%20Software%20III/Observer/images/Observer.png)

## Código

```java
import java.util.ArrayList;
import java.util.List;

public class DadosDesenvolvedor {
    private List<Observer>:observers;
    private nomeDesenvolvedor:String
    
    public DadosDesenvolvedor(){
        this.observers = new ArrayList<>();
        this.nomeDesenvolvedor = String
    }

    public void setNomeDesenvolvedor(String nome){
        this.teamNome = nome
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    
    public void postDesenvolvedor(String nome){
        setNomeDesenvolvedor(nome)
        notify(nome)
    }

    public void notify(String nome){
        this.observers.stream().forEach(item -> {
           item.update(nome) ;
        });
    }
    
}
```

```java
public class Dev implements Observer {

    public void update(String nome){
        System.out.println('O dev se chama: '+nome)
    }
}
```

```java
public class Master implements Observer {

    public void update(String nome){
        System.out.println('O master se chama: '+nome)
    }
}
```

```java
public interface Observer {
    public void update(String nome);
}
```