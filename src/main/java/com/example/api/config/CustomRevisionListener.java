package com.example.api.config;

import org.hibernate.envers.RevisionListener;

import com.example.api.audit.Revision;

public class CustomRevisionListener implements RevisionListener{
	

	
	public void newRevision(Object revisionEntity) {
		final Revision revision = (Revision) revisionEntity;
	}

}
