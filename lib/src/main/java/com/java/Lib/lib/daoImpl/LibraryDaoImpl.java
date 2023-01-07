package com.java.Lib.lib.daoImpl;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.java.Lib.lib.dao.LibraryDao;
import com.java.Lib.lib.entity.Library;

public class LibraryDaoImpl implements LibraryDao{
	private HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	@Transactional
	public void insertLib(Library lib) {
		ht.save(lib);
		
	}

}
