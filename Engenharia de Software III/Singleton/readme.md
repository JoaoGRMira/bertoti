# Singleton

## Diagrama

![Singleton](https://github.com/JoaoGRMira/bertoti/blob/main/Engenharia%20de%20Software%20III/Singleton/images/Singleton.png)

## Código

```java
public static class Streaming {
	private static Streaming streaming;
	private Streaming(){}
	public void Streaming getInstance(){
		if(streaming==null){
			streaming = new Streaming;
		}
		return streaming;
	}

	public assinar(String assinatura) {
        System.out.println("Assinando: " + assinatura);
    }
}
```