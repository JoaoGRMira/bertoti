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