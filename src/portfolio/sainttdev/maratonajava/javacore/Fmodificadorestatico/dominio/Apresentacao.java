package portfolio.sainttdev.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Apresentacao {
    private static String organizacao = "Max Titanium";
    private String palestrantes;
    private double data;
    private static int idadeMinima = 14;

    static {
        System.out.println("OLÁ!");
    }

    static {
        System.out.println("TUDO BEM?!");
    }

    static{
        System.out.println("Sejam todos bem-vindos a palestra 'COMO CRESCER SEM TER QUE UTILIZAR ANABOLIZANTES?'!");
        System.out.println("=====================================================================================");
    }

    public void imprime(){
        System.out.println("Nós, empresários "+organizacao+" oferecemos a palestra de crescimento natural,");
        System.out.println("Com: "+palestrantes+".");
        System.out.println("No dia "+data+".");
        System.out.println("Você deve ter no mínimo "+idadeMinima+" anos para assistir à esta palestra!");
        System.out.println("--------------------------");
    }

    public Apresentacao (String palestrantes, double data){
        Apresentacao.organizacao = organizacao;
        this.palestrantes = palestrantes;
        this.data = data;
    }

    public String getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(String organizacao) {
        Apresentacao.organizacao = organizacao;
    }

    public String getPalestrantes() {
        return palestrantes;
    }

    public void setPalestrantes(String palestrantes) {
        this.palestrantes = palestrantes;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        Apresentacao.idadeMinima = idadeMinima;
    }
}
