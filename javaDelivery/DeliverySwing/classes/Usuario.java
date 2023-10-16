package classes;

public class Usuario {
    private String nome;
    private String senha;
    private String endereco;
    private String cpf;

    public Usuario(String nome, String endereco, String cpf, String senha){
        this.nome = nome;
        this.endereco = endereco;
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
    public  String getEndereco(){
        return endereco;
    }
    public void setEndereco(){
        this.endereco = endereco;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(){
        this.cpf = cpf;
    }
}

