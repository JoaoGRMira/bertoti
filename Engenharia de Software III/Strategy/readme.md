# Strategy

## Diagrama

![Strategy](https://github.com/JoaoGRMira/bertoti/blob/main/Engenharia%20de%20Software%20III/Strategy/images/Strategy.png)

## Código

```java
public interface Listagem {
    
    void listar();
}
```

```java
public class ListagemAlbuns implements Show {
    
    public void listar(){
        System.out.println("Listagem de álbuns.");
    }
}
```

```java
public class ListagemPlaylists implements Show {
    
    public void listar(){
        System.out.println("Listagem de playlists comuns.");
    }
}
```

```java
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
```