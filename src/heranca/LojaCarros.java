package heranca;

public class LojaCarros extends Estabalecimento{
    private int estoqueDeCarros;
    private String salaDeEspera;
    private String lavaRapido;

    public int getEstoqueDeCarros() {
        return estoqueDeCarros;
    }

    public void setEstoqueDeCarros(int estoqueDeCarros) {
        this.estoqueDeCarros = estoqueDeCarros;
    }

    public String getSalaDeEspera() {
        return salaDeEspera;
    }

    public void setSalaDeEspera(String salaDeEspera) {
        this.salaDeEspera = salaDeEspera;
    }

    public String getLavaRapido() {
        return lavaRapido;
    }

    public void setLavaRapido(String lavaRapido) {
        this.lavaRapido = lavaRapido;
    }
}
