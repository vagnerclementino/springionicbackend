package br.com.springionicbackend.domains.enums;

public enum EstadoPagamento {
	
	
	
	PENDENTE (1,"Pendente"),
	QUITADO(2,"Quitado"),
	CANCELADO(3,"Cancelado");
	
	private int codigo;
	private String descricao;
	
	private EstadoPagamento(int codigo, String descricao) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public EstadoPagamento toEnum(Integer codigo) {
		
		EstadoPagamento estadoPagamento = null;
		if (codigo == null) {
			return null;
		}
		
		for (EstadoPagamento epItem : EstadoPagamento.values()) {
			
			if(codigo.equals(epItem.getCodigo())) {
				estadoPagamento =  epItem;
			}			
		}
		
		return estadoPagamento;
	}

}
