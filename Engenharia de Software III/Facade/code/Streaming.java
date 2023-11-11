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