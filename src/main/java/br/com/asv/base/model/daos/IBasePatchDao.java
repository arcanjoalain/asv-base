package br.com.asv.base.model.daos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;

import br.com.asv.base.model.entities.IBaseEntity;

public interface IBasePatchDao<E extends IBaseEntity<I>,I> extends IBaseDao<E, I>{

	E patch(I id, JsonPatch patch) throws JsonPatchException, JsonProcessingException;
}
