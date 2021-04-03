public class Fornecedor extends Usuario{
  public String nome_fantasia;
  public String website;

 Fornecedor( String n, String l, int l_n, String c, String b, String cid, String uf, String tel, NumeroCadastro c_c, int numc_c, String n_f, String site){
    super(n, l, l_n, c, b, cid, uf, tel, c_c, numc_c);
    nome_fantasia = n_f;
    website = site;
  }
}