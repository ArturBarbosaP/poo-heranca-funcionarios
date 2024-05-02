public class Engenheiros extends Funcionario
{
    private String especializacao;

    public Engenheiros(String nome, int idade, String setor, String especializacao)
    {
        super(nome, idade, setor);
        this.especializacao = especializacao;
    }

    public String getEspecializacao()
    {
        return especializacao;
    }

    public void setEspecializacao(String especializacao)
    {
        this.especializacao = especializacao;
    }
}