package polimorfismo;

public class DocesImplementacao implements EstabelecimentoService{
    @Override
    public void imprimeInformcoes() {
        System.out.println("Sobremesa");
    }
}
