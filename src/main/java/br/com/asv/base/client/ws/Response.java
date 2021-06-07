package br.com.asv.base.client.ws;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<
	D,
	O extends Serializable,
	E extends Serializable> implements IResponse{

	private static final long serialVersionUID = 1925385826590639221L;
	private D data;
	private O options;
	private List<E> errors = new LinkedList<>();
}

