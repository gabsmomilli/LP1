public class TesteB {
    public static void main (String[] args) {
        Aluno alunoA = new Aluno("Gabi", 19, "14785236912", "Banco de dados");
        Aluno alunoB = new Aluno("Fernanda", 27, "74754736912", "Banco de dados");
        Aluno alunoC = new Aluno("Ramon", 19, "45236987125", "Analis de Sistemas");
        Aluno alunoD = new Aluno("Nathan", 21, "65231478965", "Banco de dados");
        Aluno alunoE = new Aluno("Bruno", 18, "36985214789", "Projetos de EStruturas Aeronauticas");

        Aluno[] alunos = new Aluno[5];
        alunos[0] = alunoA;
        alunos[1] = alunoB;
        alunos[2] = alunoC;
        alunos[3] = alunoD;
        alunos[4] = alunoE;

        for (int i = 0; i < alunos.length; i++){
            alunos[i].mostrarNivel();
        }
    }
}
