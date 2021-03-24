package desafiomv.controlemvrestapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Cliente")
public class ClienteModel {

    @Id
    public Integer codigo;

    @Column(nullable = false, length = 50)
    public String nome;

    @Column(nullable = false, length = 10)
    public String login;

    @Column(nullable = false, length = 10)
    public String senha;

    @Column(nullable = false, length = 11)
    public Integer cpf;

    @Column(nullable = false, length = 9)
    public Integer conta;

    @Column(nullable = false, length = 50)
    public String endereco;

    @Column(nullable = false, length = 20)
    public String email;




    public String getLogin() {

        return login;
    }

    public void setLogin(String login) {

        this.login = login;
    }

    public String getSenha() {

        return senha;
    }

    public void setSenha(String senha) {

        this.senha = senha;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
