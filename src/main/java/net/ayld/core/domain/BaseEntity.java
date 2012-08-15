package net.ayld.core.domain;

import java.io.Serializable;

public abstract class BaseEntity<I extends Serializable> implements Entity<I>, Serializable{

	private I id;
	
	@Override
	public I getId() {
		return id;
	}

	public void setId(I id) {
		this.id = id;
	}
	
	private static final long serialVersionUID = 1L;
}
