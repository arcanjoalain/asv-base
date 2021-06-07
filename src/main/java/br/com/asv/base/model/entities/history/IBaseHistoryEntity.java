package br.com.asv.base.model.entities.history;

import java.io.Serializable;
import java.util.Date;

import br.com.asv.base.model.entities.IBaseEntity;


public interface IBaseHistoryEntity<I extends Serializable> extends IBaseEntity<I>{
	
	Date getLastModifiedAt();
	
	void setLastModifiedAt(Date lastModifiedAt);
	
	Long getModifieldUserID();
	
	void setModifieldUserID(Long createUserID);
}
