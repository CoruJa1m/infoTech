import java.sql.Date;

public class Celular extends Equipamento {
private String marca;
private String modelo;




public Celular() {
}




public Celular(String nomeEquip, String modeloEquip, Date dataChegada, String nomeCliente, String problematEquip,
        String marca, String modelo) {
    super(nomeEquip, modeloEquip, dataChegada, nomeCliente, problematEquip);
    this.marca = marca;
    this.modelo = modelo;
}




public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}


}
