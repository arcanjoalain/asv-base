package br.com.asv.base.model.daos;

public interface ISearchCriteria {

	String getKey();
	String getOperation();
	Object getValue();
	void setKey(String key);
	void setOperation(String operation);
	void setValue(Object value);
}
