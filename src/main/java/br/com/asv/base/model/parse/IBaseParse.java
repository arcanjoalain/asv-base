package br.com.asv.base.model.parse;

import br.com.asv.base.client.dto.IBaseDto;
import br.com.asv.base.model.entities.IBaseEntity;

public interface IBaseParse<
	E extends IBaseEntity<I>, 
	D extends IBaseDto<O>, 
	I, 
	O> {

	D convert(E entity);

	D convert(E entity, boolean isFull);

	E convert(D dto);

	E convert(D dto, boolean isFull);
	
	I convertPidEntity(O id);
	
	O convertPidDto(I id);

}
