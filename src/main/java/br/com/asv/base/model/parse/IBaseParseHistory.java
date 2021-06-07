package br.com.asv.base.model.parse;

import java.io.Serializable;

public interface IBaseParseHistory<E extends Serializable> extends Serializable{
	
	String prepareHistory(E entity);

}
