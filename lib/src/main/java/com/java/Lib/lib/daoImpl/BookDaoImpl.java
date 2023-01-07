package com.java.Lib.lib.daoImpl;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.java.Lib.lib.dao.BookDao;
import com.java.Lib.lib.entity.Book;

public class BookDaoImpl implements BookDao {

	private HibernateTemplate ht;
	public HibernateTemplate getHt() {
		return ht;
	}
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	@Transactional
	public void insertRecord(Book b) {
		ht.save(b);
		
		
	}

}
