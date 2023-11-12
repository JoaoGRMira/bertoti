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