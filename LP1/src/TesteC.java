public class TesteC {
    public static void main(String[] args){
        Calçado calçadoA = new Calçado("Melissa",35,"feminino","sandalia",129);
        Calçado calçadoB = new Calçado("Nike",38,"feminino","tenis esportivo",299);
        Calçado calçadoC = new Calçado("Adidas",41,"masculino","tenis casual",179);
        Calçado calçadoD = new Calçado("Havainnas",42,"masculino","chinelo",42);
        Calçado calçadoE = new Calçado("Crocs",32,"feminino","crocs",189);

        Calçado[] calçados = new Calçado[5];
        calçados[0] = calçadoA;
        calçados[1] = calçadoB;
        calçados[2] = calçadoC;
        calçados[3] = calçadoD;
        calçados[4] = calçadoE;

        for(int i = 0; i < calçados.length; i++){
            calçados[i].mostrarNivel();
        }
    }
}
