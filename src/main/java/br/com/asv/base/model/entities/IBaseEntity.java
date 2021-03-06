package br.com.asv.base.model.entities;

import java.io.Serializable;
import java.util.Date;

import br.com.asv.base.model.enums.StatusEntityEnum;

public interface IBaseEntity<I extends Serializable> extends Serializable{
	
	I getPid();
	
	void setPid(I pid);
	
	Date getCreatedAt();
	
	void setCreatedAt(Date dateAt);
		
	I getCreateUserPid();
	
	void setCreateUserPid(I createUserPid);
		
	StatusEntityEnum getStatusEntity();
	
	void setStatusEntity(StatusEntityEnum statusEntity);

	void preRemove();

	void postPersist();

	void postUpdate();

	void postRemove();

	void postLoad();

	void prePersist();
	
	void preUpdate();
	
}
