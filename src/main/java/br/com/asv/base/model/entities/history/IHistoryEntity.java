package br.com.asv.base.model.entities.history;

import java.io.Serializable;

import br.com.asv.base.client.dto.IBaseDto;
import br.com.asv.base.model.entities.IBaseEntity;
import br.com.asv.base.model.parse.IBaseParse;


public interface IHistoryEntity<
	E extends IBaseEntity<I> ,
	I extends Serializable> 
		extends IBaseEntity<I>, Serializable{
	
	void setEntity(E entity);
	
	E getEntity();
	
	void prepareEntity();
	
	IBaseParse< E, IBaseDto<Serializable>, I, Serializable> getParse(); 

}
