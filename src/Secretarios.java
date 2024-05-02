public class Secretarios extends Funcionario
{
    private Diretores diretor_responsavel;

    public Secretarios(String nome, int idade, String setor, Diretores diretor_responsavel)
    {
        super(nome, idade, setor);
        this.diretor_responsavel = diretor_responsavel;
    }

    public Diretores getDiretor_Responsavel()
    {
        return diretor_responsavel;
    }

    public void setDiretor_Responsavel(Diretores diretor_responsavel)
    {
        this.diretor_responsavel = diretor_responsavel;
    }
}