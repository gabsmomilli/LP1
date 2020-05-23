public class TesteD {
    public static void main (String[] args){
        InstrumentoMusical instrumentoA = new InstrumentoMusical("violão",6,"aurburn",199);
        InstrumentoMusical instrumentoB = new InstrumentoMusical("ukulele",4,"tagima",150);
        InstrumentoMusical instrumentoC = new InstrumentoMusical("violoncelo",4,"prowinds",1444);
        InstrumentoMusical instrumentoD = new InstrumentoMusical("guitarra",6,"strinberg",975);
        InstrumentoMusical instrumentoE = new InstrumentoMusical("berimbau",1,"comtemporanea",150);

        InstrumentoMusical[] instrumentos = new InstrumentoMusical[5];
        instrumentos[0] = instrumentoA;
        instrumentos[1] = instrumentoB;
        instrumentos[2] = instrumentoC;
        instrumentos[3] = instrumentoD;
        instrumentos[4] = instrumentoE;

        for (int i = 0; i < instrumentos.length; i++){
            instrumentos[i].mostrarNivel();
        }
    }
}
