public class Ciclista extends Atleta{

    private String modalidade;
    private double distancia;
    public Ciclista(String nome, int numero, int idade, String genero, String modalidade, double distancia) {
        super(nome, numero, idade, genero);
        this.modalidade = modalidade;
        this.distancia = distancia;
    }

    public String getModalidade() { return modalidade; }
    public void setModalidade(String modalidade) { this.modalidade = modalidade; }
    public double getDistancia() { return distancia; }
    public void setDistancia(double distancia) { this.distancia = distancia; }

    public String toString() {
        String retorno = super.toString();
        retorno += "Modalidade: "    + this.modalidade    + "\n";
        retorno += "Distância: "     + this.distancia     + "km\n";
        return retorno;
    }
    @Override
    public boolean iniciarAtividade(){
        if(this.getDistancia() < 0) {
            return false;
        }
        else {
            return true;
        }
    }

}