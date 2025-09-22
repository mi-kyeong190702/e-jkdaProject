package jkda;

import javax.servlet.http.*;
import javax.servlet.jsp.*;

import java.util.*;
import java.io.*;

public class SessionInfo 
{	
	public static String USER_ID		= "userid";
	public static String LOGIN			= "login";
	public static String LOGIN_INFO		= "login_info";
	public static String MEMBER_JOIN	= "member_join";
	public static String PERS_NAME		= "pers_name";
	public static String PERS_TEL		= "pers_tel";
	public static String PERS_HP		= "pers_hp";
	public static String CODE_MEMBER    = "code_member";//07:?�생?�원  21: ?�규취업?�원 22:?�규미취?�회??25:기취?�회??26:기�?취업?�원 28:?�규?�별?�원 29:기특별회??30:?�규?�생?�회??31:기평?�정?�원 32:?�규?�생?�별?�원 33:기평?�특별회??
	public static String EMAIL			= "email";
	public static String DUES_GUBUN     = "dues_gubun"; //(?�비구분)1:?�회�?2:?�생?�비 3:?�하?�체?�비 4:CMS ?�비
	public static String PERS_STATE     = "pers_state"; //01:?�상  06:?�인??��  07:?�인�?
	public static String AUTH_START     = "auth_start"; //?�효기간 From
	public static String AUTH_END       = "auth_end"; //?�효기간 End  
	public static String PWCHK       	= "pwchk";   
	public static String CODE_PERS      = "code_pers"; //?�원번호
	public static String PERS_BIRTH     = "pers_birth"; //?�년?�일
	public static String CODE_BRAN      = "code_bran"; //?�속�??  
	public static String USER_LEVEL     = "user_level"; //1 최고�?��??2 중간�?��??3  ?�원?�▲ 4 ?�원??5 ?�원 6 비회??
	public static String PATH		    = "path";  
	public static String CODE_POST		= "code_post";  
	public static String PERS_ADD		= "pers_add";  
	public static String PERS_ADD_DETAIL= "pers_add_detail";  
	public static String LIC_NO			= "lic_no";  
	public static String PERS_POINT		= "pers_point"; 
	public static String SEARCH			= "search";
	public static String SEARCH_KEYWORD	= "search_keyword";
	public static String CODE_BIG		= "code_big";
	
	public static String HOMEPAGE_ADMIN = "homepage_admin";
	
	private HttpSession session;
	
	public SessionInfo ( HttpSession sess ) {
		session = sess;	
	}	
	
	public boolean isLogin () {
		String login = (String) session.getAttribute ( LOGIN );
		if ( login != null )
		{
			if ( login.equals("Y")) 
				return true;
			else 
				return false;
		}
		return false;
	}
	
	public String getUserId()
	{
		String userid = (String) session.getAttribute ( USER_ID );
		if ( userid != null )
			return userid;
		return "";
	}
	
	public int getUserLevel()
	{
		int user_level = 0;
		try{
			user_level = (int) session.getAttribute ( USER_LEVEL );
			if ( user_level > 0 )
				return user_level;
		
		}catch(Exception e){
			System.out.println("getUserLevel error:"+ e.toString());
		}
		return 0;
	}
	
	public int getPersPoint()
	{
		int pers_point = 0;
		try{
			if ( session.getAttribute ( PERS_POINT ) == null) {
				return 0;
			} else {
				pers_point = (int) session.getAttribute ( PERS_POINT );
				if ( pers_point > 0 )
					return pers_point;
			}
			
		}catch(Exception e){
			System.out.println("getPersPoint error:"+ e.toString());
		}
		return 0;
	}
	
	public String getCodebig()
	{
		String code_big = (String) session.getAttribute ( CODE_BIG );
		if ( code_big != null )
			return code_big;
		return "";
	}
	
	
	public String getPersState()
	{
		String pers_state = (String) session.getAttribute ( PERS_STATE );
		if ( pers_state != null )
			return pers_state;
		return "";
	}
}
