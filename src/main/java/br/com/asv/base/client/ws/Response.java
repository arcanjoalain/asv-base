package br.com.asv.base.client.ws;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Response<
	D,
	O extends Serializable,
	E extends Serializable> implements IResponse{

	private static final long serialVersionUID = 1925385826590639221L;
	@Getter
	@Setter
	private D data;
	@Getter
	@Setter
	private O options;
	@Getter
	@Setter
	private List<E> errors = new LinkedList<>();
}

