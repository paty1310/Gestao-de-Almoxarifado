package almoxarifado;

public class Localizacao {
   private String descricao;
   private int setor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSetor() {
        return setor;
    }

    public void setSetor(int setor) {
        this.setor = setor;
    }
   public String definicaoDeArmazenamento() {
        return "Armazenado no setor " + setor + " - " + descricao;
    }
}