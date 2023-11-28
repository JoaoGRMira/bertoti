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