public class TesteA {
    public static void main (String[] args){
        Pessoa PessoaA = new Pessoa("Gabi", 19,"491.884.458-90",988730554);
        Pessoa PessoaB = new Pessoa ("Ramon", 19,"147.852.369-21",982050442);
        Pessoa PessoaC = new Pessoa("Carla",34,"123.456.789-12",988909888);
        Pessoa PessoaD = new Pessoa("Giu",32,"145.555.789-85",981593578);
        Pessoa PessoaE = new Pessoa("Felipe",11,"743.636.458-45",982356248);

        Pessoa[] pessoas = new Pessoa[5];
        pessoas[0] = PessoaA;
        pessoas[1] = PessoaB;
        pessoas[2] = PessoaC;
        pessoas[3] = PessoaD;
        pessoas[4] = PessoaE;

        for (int i = 0; i < pessoas.length; i++){
            pessoas[i].mostrarNivel();
        }
    }
}
