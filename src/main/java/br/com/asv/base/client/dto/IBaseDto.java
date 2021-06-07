package br.com.asv.base.client.dto;

import java.io.Serializable;

public interface IBaseDto<I extends Serializable> extends Serializable{
	
	I getPid();
	
	
}
