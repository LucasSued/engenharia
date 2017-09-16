import java.util.Collection;

public class aluno implements alunoref {

	protected int nome;

	protected int id;

	protected int fatura;

	protected int valorMensalidade;

	private Collection<pagamentos> pagamentos;

	public void construtor() {

	}

	public void consultarpagameto() {

	}

	/**
	 * algoritimo pagar mensalidade:receber rm do aluno pagador,valor pago por parametro .ler aluno ponto rm igual a rma aluno pagador
	 * 
	 * pagamento.criarnovopagamento(aluno.rm,aluno.valormensalidade,valorpago)
	 * 
	 * se valor do pagamento for menor do que oda mensalidade adicionar em mal pagador(aluno.rm)
	 *  se não add em bompagador.addbompagador
	 * fim.
	 */
	public void pagarmensalidade(int valorpago, int alunopagador) {

	}


	/**
	 * @see alunoref#pagarmensalidade()
	 */
	public void pagarmensalidade() {

	}

}
