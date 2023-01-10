public class App {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.setName("Brulindo");
        aluno1.setAge(15);
        aluno1.setCpf("076.235.234.67");
        aluno1.curso.setName("Sistemas de Informação");
        aluno1.curso.setDuration(1200);

        System.out.println(aluno1);
        
        Aluno aluno2 = new Aluno();

        aluno2.setName("José");
        aluno2.setAge(60);
        aluno2.setCpf("012.655.208.01");
        aluno2.curso.setName("Automação");
        aluno2.curso.setDuration(500);

        System.out.println(aluno2);
    }
}
