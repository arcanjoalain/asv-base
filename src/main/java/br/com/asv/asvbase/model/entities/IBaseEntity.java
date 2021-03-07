package br.com.asv.asvbase.model.entities;

import java.util.Date;

import br.com.asv.asvbase.model.enums.StatusEntityEnum;

public interface IBaseEntity<I> {
	
	I getPid();
	
	void setPid(I pid);
	
	Date getCreatedAt();
	
	void setCreatedAt(Date dateAt);
		
	Long getCreateUserPid();
	
	void setCreateUserPid(Long createUserPid);
		
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
