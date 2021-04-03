public class Associado extends Usuario{
  public String situacao;
  public int num_associado;

 Associado(String n, String l, int l_n, String c, String b, String cid, String uf, String tel, NumeroCadastro c_c, int numc_c, String situ, int n_a){
    super(n, l, l_n, c, b, cid, uf, tel, c_c, numc_c);

    situacao = situ;
    num_associado = n_a;
  }
}