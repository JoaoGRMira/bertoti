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