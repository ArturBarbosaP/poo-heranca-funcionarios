public class Diretores extends Funcionario
{
    private String nivel;

    public Diretores(String nome, int idade, String setor, String nivel)
    {
        super(nome, idade, setor);
        this.nivel = nivel;
    }

    public String getNivel()
    {
        return nivel;
    }

    public void setNivel(String nivel)
    {
        this.nivel = nivel;
    }
}