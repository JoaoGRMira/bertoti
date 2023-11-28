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