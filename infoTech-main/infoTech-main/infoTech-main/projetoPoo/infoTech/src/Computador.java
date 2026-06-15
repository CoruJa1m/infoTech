import java.sql.Date;

public class Computador extends Equipamento {
private String placaMae;
private String processador;
private String placaVideo;
private String armazenamento;
private String monitor;






public Computador() {
}

public Computador(String nomeEquip, String modeloEquip, Date dataChegada, String nomeCliente, String problematEquip,
        String placaMae, String processador, String placaVideo, String armazenamento, String monitor) {
    super(nomeEquip, modeloEquip, dataChegada, nomeCliente, problematEquip);
    this.placaMae = placaMae;
    this.processador = processador;
    this.placaVideo = placaVideo;
    this.armazenamento = armazenamento;
    this.monitor = monitor;
}

public String getPlacaMae() {
    return placaMae;
}
public void setPlacaMae(String placaMae) {
    this.placaMae = placaMae;
}
public String getProcessador() {
    return processador;
}
public void setProcessador(String processador) {
    this.processador = processador;
}
public String getPlacaVideo() {
    return placaVideo;
}
public void setPlacaVideo(String placaVideo) {
    this.placaVideo = placaVideo;
}
public String getArmazenamento() {
    return armazenamento;
}
public void setArmazenamento(String armazenamento) {
    this.armazenamento = armazenamento;
}
public String getMonitor() {
    return monitor;
}
public void setMonitor(String monitor) {
    this.monitor = monitor;
}



}
