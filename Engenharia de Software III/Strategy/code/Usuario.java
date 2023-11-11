public class Usuario {
   
    private String nomePlaylist;
    private Playlist playlist;
    
    public Playlist(String nome, Playlist playlist){
        this.nomePlaylist = nome;
        this.playlist = playlist;
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }
    
    public void listar(){
        playlist.listar();
    }
    
    public void setPlaylist(Playlist playlist){
        this.playlist = playlist;
    }
}