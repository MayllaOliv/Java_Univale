public class Emprestimo {

    private Integer data_emprestimo;
    private Integer data_devolucao;
    private Integer prazo_devolucao;

    public Integer getData_emprestimo() {
        return data_emprestimo;
    }

    public Integer getData_devolucao() {
        return data_devolucao;
    }

    public Integer getPrazo_devolucao() {
        return prazo_devolucao;
    }

    public void setData_emprestimo(Integer data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public void setData_devolucao(Integer data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public void setPrazo_devolucao(Integer prazo_devolucao) {
        this.prazo_devolucao = prazo_devolucao;
    }
}
