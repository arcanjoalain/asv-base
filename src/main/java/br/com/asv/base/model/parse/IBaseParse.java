package br.com.asv.base.model.parse;

import java.io.Serializable;
import br.com.asv.base.client.dto.IBaseDto;
import br.com.asv.base.model.entities.IBaseEntity;

public interface IBaseParse<
	E extends IBaseEntity<I>, 
	D extends IBaseDto<O>, 
	I extends Serializable, 
	O extends Serializable> extends Serializable{
	
	IMaskPid<I,O> getMask();

	D convert(E entity);

	D convert(E entity, boolean isFull) ;
	
	D convertImpl(E entity, boolean isFull) ;

	E convert(D dto) throws IllegalArgumentException;

	E convert(D dto, boolean isFull) throws IllegalArgumentException;
	
	E convertImpl(D dto, boolean isFull) throws IllegalArgumentException;
	
	I convertPidEntity(O id);
	
	O convertPidDto(I id) throws IllegalArgumentException;

}
