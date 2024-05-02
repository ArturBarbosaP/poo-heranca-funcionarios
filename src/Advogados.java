public class Advogados extends Funcionario
{
    private String formacao;

    public Advogados(String nome, int idade, String setor, String formacao)
    {
        super(nome, idade, setor);
        this.formacao = formacao;
    }

    public String getFormacao()
    {
        return formacao;
    }

    public void setFormacao(String formacao)
    {
        this.formacao = formacao;
    }
}