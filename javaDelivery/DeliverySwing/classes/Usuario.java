package classes;

public class Usuario {
    private String nome;
    private String senha;
    private String enderecoX;
    private String enderecoY;
    private String cpf;

    public Usuario(String nome, String enderecoX, String enderecoY, String cpf, String senha){
        this.nome = nome;
        this.enderecoX = enderecoX;
        this.enderecoY = enderecoY;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(){
        this.senha = senha;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(){
        this.cpf = cpf;
    }

    public String getEnderecoX() {
        return enderecoX;
    }

    public void setEnderecoX(String enderecoX) {
        this.enderecoX = enderecoX;
    }

    public String getEnderecoY() {
        return enderecoY;
    }

    public void setEnderecoY(String enderecoY) {
        this.enderecoY = enderecoY;
    }
}

