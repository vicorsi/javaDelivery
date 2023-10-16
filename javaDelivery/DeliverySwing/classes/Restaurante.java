package classes;

public class Restaurante {
    private String nome;
    private double localizacaoX;
    private double localizacaoY;

    public Restaurante(String nome, double localizacaoX, double localizacaoY){
        this.nome = nome;
        this.localizacaoX = localizacaoX;
        this.localizacaoY = localizacaoY;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

