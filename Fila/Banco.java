public class Banco{
    public static void main(String args[]){
        Fila f = new Fila();
        int elemento;

        f.inserir(176);
        f.inserir(914);
        f.inserir(12);
        f.inserir(1817);
        f.inserir(100);

        System.out.println("Bem vindos ao Banco Moderno!");
        System.out.println("Servimos bem para servir sempre!");
        System.out.println("Atendimento-----------");

        while (!f.isEmpty()){
            elemento = f.retirar();
            System.out.println("Senha a ser atendida no guiche: "+elemento);
        }
    }
}