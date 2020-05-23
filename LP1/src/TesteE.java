class TesteE {
    public static void main (String[] args){
        Lugar estado = new Lugar("SP");
        Lugar cidadeA = new Lugar("Sao jose dos campos", estado);
        Lugar cidadeB = new Lugar("Jacarei", estado);
        Lugar cidadeC = new Lugar("Caçapava", estado);
        Lugar cidadeD = new Lugar("Campos do Jordão", estado);
        Lugar cidadeE = new Lugar("Guaratingueta", estado);

        Lugar[] cidades = new Lugar[5];
        cidades[0]= cidadeA;
        cidades[1]= cidadeB;
        cidades[2]= cidadeC;
        cidades[3]= cidadeD;
        cidades[4]= cidadeE;

        for (int i = 0; i < cidades.length; i++){
            cidades[i].mostrarNivel();
        }
    }
}
