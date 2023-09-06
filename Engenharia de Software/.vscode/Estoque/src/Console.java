import java.util.List;

public class Console{
    private String nome;
    private Especificacao espec;
    List<Console> Lista;

    public Console(String nome, Especificacao espec) {
        this.nome = nome;
        this.espec = espec;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Especificacao getEspec() {
        return espec;
    }
    public void setEspec(Especificacao espec) {
        this.espec = espec;
    }
}
   
