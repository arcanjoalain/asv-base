package br.com.asv.base.model.parse;

import java.io.Serializable;

public interface IMaskPid<I extends Serializable,O extends Serializable> {
	
	I convertPid(O id) throws IllegalArgumentException;
	
	O convertPidDto(I id);
}
