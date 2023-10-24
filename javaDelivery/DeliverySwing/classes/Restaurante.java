package classes;

public class Restaurante {
    private String nome;
    private String cnpj;
    private String senha;
    private double localizacaoX;
    private double localizacaoY;

    public Restaurante(String nome, String cnpj, String senha, double localizacaoX, double localizacaoY){
        this.nome = nome;
        this.cnpj=cnpj;
        this.senha=senha;
        this.localizacaoX = localizacaoX;
        this.localizacaoY = localizacaoY;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }
    public double getLocalizacaoX() {
        return localizacaoX;
    }

    public void setLocalizacaoX(double localizacaoX) {
        this.localizacaoX = localizacaoX;
    }

    public double getLocalizacaoY() {
        return localizacaoY;
    }

    public void setLocalizacaoY(double localizacaoY) {
        this.localizacaoY = localizacaoY;
    }
}

