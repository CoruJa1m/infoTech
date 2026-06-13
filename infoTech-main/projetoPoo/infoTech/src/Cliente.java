import java.sql.Date;

public class Cliente extends Pessoa {

private String telefone;
private String cidade;
private String estado;





public Cliente() {
}



public Cliente(String nome, String cpf, Date dataNascimento, String telefone, String cidade, String estado) {
    super(nome, cpf, dataNascimento);
    this.telefone = telefone;
    this.cidade = cidade;
    this.estado = estado;
}



public String getTelefone() {
    return telefone;
}
public void setTelefone(String telefone) {
    this.telefone = telefone;
}
public String getCidade() {
    return cidade;
}
public void setCidade(String cidade) {
    this.cidade = cidade;
}
public String getEstado() {
    return estado;
}
public void setEstado(String estado) {
    this.estado = estado;
}




}