public class Professor extends Pessoa {

    private double salario;
    private String disciplina;

  
    Professor() {
    }

  
    Professor(String nome,
              int idade,
              String casado,
              String filhos,
              String voluntariado,
              String profissao,
              double salario,
              String disciplina) {

        super(nome, idade, casado, filhos, voluntariado, profissao);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    //set
public void setSalario(double salario) {
    this.salario = salario;
}

public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
}

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo: Professor");
        System.out.println("Disciplina: " + getDisciplina());
        System.out.println("Salário: R$ " + getSalario());
    }
}
