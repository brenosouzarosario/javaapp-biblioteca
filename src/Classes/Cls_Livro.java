package Classes;

public class Cls_Livro extends Cls_Emprestimo{
    public int multa(int dias){
        multa=dias*4;
        return multa;
    }
}
