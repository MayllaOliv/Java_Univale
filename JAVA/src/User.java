public class User {

    public String name;
    public String email;
    public Integer idade;
    public Carrinho carrinho;

    public void setPagar

    public void setName(String userName) {
        name =userName;
    }

    public void setEmail(String userEmail) {
        email = userEmail;
    }

    public void setIdade(Integer userIdade){
       idade = userIdade;
    }

    public void setCarrinho(Carrinho usercarrinho){
        carrinho = usercarrinho;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public Integer getIdade(){
        return idade;
    }

    public Carrinho getCarrinho(){
        return carrinho;
    }
}

