package br.com.asv.base.model.entities.history;

import java.io.Serializable;
import java.util.List;

public interface IBaseHistoryListEntity<H extends Serializable,I extends Serializable> extends IBaseHistoryEntity<I>,Serializable{

	H createHistories();
	List<H> getHistories();
	void setHistories(List<H> histories);
	void processHistories();
}
