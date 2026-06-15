import java.sql.Date;

public class Funcionario extends Pessoa {
private String Cargo;
private int Salario;
private Date DataAdmissao;





public Funcionario() {
}



public Funcionario(String nome, String cpf, Date dataNascimento, String cargo, int salario, Date dataAdmissao) {
    super(nome, cpf, dataNascimento);
    Cargo = cargo;
    Salario = salario;
    DataAdmissao = dataAdmissao;
}



public String getCargo() {
    return Cargo;
}
public void setCargo(String cargo) {
    Cargo = cargo;
}
public int getSalario() {
    return Salario;
}
public void setSalario(int salario) {
    Salario = salario;
}
public Date getDataAdmissao() {
    return DataAdmissao;
}
public void setDataAdmissao(Date dataAdmissao) {
    DataAdmissao = dataAdmissao;
}


}
