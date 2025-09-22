package jkda.controller;

import jkda.common.data.LIST_HELPER;
import jkda.spring.abstr.KdaAbstractMapper; 

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("kdaColumnDao")
public class KdaColumnDao extends KdaAbstractMapper {

	@Autowired
	SqlSessionFactory sqlSessionFactory1; 
	
	/* E-Book 추가 */
	public LIST_HELPER selectEbookColumnListHelper(LIST_HELPER listHelper) throws PersistenceException {
		return selectListHelper(sqlSessionFactory1, "kdaColumn.selectEbookColumnCount", "kdaColumn.selectEbookColumnListHelper", listHelper);
	}
	 
}
