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