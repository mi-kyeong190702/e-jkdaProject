package jkda.controller;

import java.util.HashMap;
import java.util.List;

import jkda.common.data.LIST_HELPER;
import jkda.controller.KdaColumnDao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicationServiceImpl implements PublicationService {
	
	private Log log = LogFactory.getLog(PublicationServiceImpl.class);

	@Autowired
	public KdaColumnDao kdaColumnDao;
	
	 
	/* E-Book 추가 */
	@Override
	public LIST_HELPER getEbookColumnListHelper(LIST_HELPER listHelper)
			throws Exception {
		return kdaColumnDao.selectEbookColumnListHelper(listHelper);
	}
	 
		
}
