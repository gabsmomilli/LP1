public class TesteF {
    public static void main(String[] args){
        Profissional profissionalA = new Profissional("Gabi","desempregada",19);
        Profissional profissionalB = new Profissional("Roque","aposentado",64);
        Profissional profissionalC = new Profissional("Ramon","estagiario",19);
        Profissional profissionalD = new Profissional("Giu","programador",32);
        Profissional profissionalE = new Profissional("Felipe","uber",28);

        Profissional[] profissionais = new Profissional[5];
        profissionais[0] =profissionalA;
        profissionais[1] =profissionalB;
        profissionais[2] =profissionalC;
        profissionais[3] =profissionalD;
        profissionais[4] =profissionalE;

        for (int i = 0; i < profissionais.length; i++){
            profissionais[i].mostrarNivel();
        }

    }
}
