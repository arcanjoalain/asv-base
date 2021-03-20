package br.com.asv.base.model.entities.history;

import java.util.Date;

import br.com.asv.base.model.entities.IBaseEntity;


public interface IBaseHistoryEntity<I> extends IBaseEntity<I>{
	
	Date getLastModifiedAt();
	
	void setLastModifiedAt(Date lastModifiedAt);
	
	Long getModifieldUserID();
	
	void setModifieldUserID(Long createUserID);
}