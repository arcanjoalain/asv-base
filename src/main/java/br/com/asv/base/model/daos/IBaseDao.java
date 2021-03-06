package br.com.asv.base.model.daos;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import br.com.asv.base.model.entities.IBaseEntity;
import br.com.asv.base.model.enums.StatusEntityEnum;

public interface IBaseDao<E extends IBaseEntity<I>,I extends Serializable> {
	
	E save(E model);
	Collection<E> save(Collection<E> models);

	E update(E model);

	E findOne(I pid);

	Collection<E> findAll();
	Page<E> findAll(Pageable pageable);

	Collection<E> findAllByStatusEntity(StatusEntityEnum statusEntity);
	Collection<E> findAllByStatusEntitySortByPid(StatusEntityEnum statusEntity);
	Collection<E> findAllByStatusEntity(StatusEntityEnum statusEntity, Sort sort);

	void delete(I pid);
	void delete(Collection<E> models);

	void recovery(I pid);
	void recovery(Collection<E> models);
	Collection<E> findAllSort(String collumnName);
	
	List<E> findAll(List<ISearchCriteria> params, Class<E> clazz);
	List<E> findAll(String search, Class<E> clazz);
	List<E> findAll(String search);
	
	void remove(I pid);
	void remove(Collection<E> models);
	

	
}
