public class Aluno extends Pessoa{

private int aulas; 
private double matricula;
private double notaFinal;
private String curso;


Aluno(){

}

Aluno(String nome,
            int idade,
            String casado,
            String filhos,
            int aulas,
            String voluntariado,
             String alunoProfessor,
            double matricula,
            double notaFinal,
            String curso ){

 super ( nome, idade, casado,  filhos ,voluntariado,alunoProfessor )  ;            
 this.aulas = aulas;
 this.matricula = matricula;
 this.notaFinal = notaFinal;
 this.curso = curso;
 

}

public int getAulas(){
    return aulas;
}

public double getMatricula(){
    return matricula;
}

public double getNotaFinal(){
return notaFinal;

}


public String getCurso(){
    return curso;
}


//set
public void setAulas(int aulas) {
    this.aulas = aulas;
}

public void setMatricula(double matricula) {
    this.matricula = matricula;
}

public void setNotaFinal(double notaFinal) {
    this.notaFinal = notaFinal;
}

public void setCurso(String curso) {
    this.curso = curso;
}



  @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + getCurso());
        System.out.println("Aulas: " + getAulas());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nota Final: " + getNotaFinal());
    }
}

