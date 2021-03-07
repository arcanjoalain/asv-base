package br.com.asv.asvbase.model.parse;

import br.com.asv.asvbase.client.dto.IBaseDto;
import br.com.asv.asvbase.model.entities.IBaseEntity;

public interface IBaseParse<E extends IBaseEntity<I>, D extends IBaseDto<I>,I> {

	D toDTO(E entity);

	D toDTO(E entity, boolean isFull);

	E toModel(D dto);

	E toModel(D dto, boolean isFull);

}