# Facade

## Diagrama

![Facade](https://github.com/JoaoGRMira/bertoti/blob/main/Engenharia%20de%20Software%20III/Facade/images/Facade.png)

## Código

```java
class Streaming {
    private StreamingBasico streamingBasico;
    private StreamingPremium streamingPremium;

    public Streaming() {
        streamingBasico = new StreamingBasico();
        streamingPremium = new StreamingPremium();
    }

    public void AssinarBasico(String planoBasico) {
        streamingBasico.AssinarBasico(planoBasico);
    }

    public void AssinarPremium(String planoPremium) {
        streamingPremium.AssinarPremium(planoBasico);
    }
}
```

```java
class StreamingBasico {
    public void AssinarBasico(String planoBasico) {
        System.out.println("Assinando o plano: " + planoBasico);
    }
}
```

```java
class StreamingPremium {
    public void AssinarPremium(String planoPremium) {
        System.out.println("Assinando o plano: " + planoPremium);
    }
}
```