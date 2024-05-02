public class Analistas extends Funcionario
{
    private String formacao;

    public Analistas(String nome, int idade, String setor, String formacao)
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