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
	public static String CODE_MEMBER    = "code_member";//07:?™ìƒ?Œì›  21: ? ê·œì·¨ì—…?Œì› 22:? ê·œë¯¸ì·¨?…íšŒ??25:ê¸°ì·¨?…íšŒ??26:ê¸°ë?ì·¨ì—…?Œì› 28:? ê·œ?¹ë³„?Œì› 29:ê¸°íŠ¹ë³„íšŒ??30:? ê·œ?‰ìƒ?•íšŒ??31:ê¸°í‰?ì •?Œì› 32:? ê·œ?‰ìƒ?¹ë³„?Œì› 33:ê¸°í‰?íŠ¹ë³„íšŒ??
	public static String EMAIL			= "email";
	public static String DUES_GUBUN     = "dues_gubun"; //(?Œë¹„êµ¬ë¶„)1:?°íšŒë¹?2:?‰ìƒ?Œë¹„ 3:?°í•˜?¨ì²´?Œë¹„ 4:CMS ?Œë¹„
	public static String PERS_STATE     = "pers_state"; //01:?•ìƒ  06:?¹ì¸??¸°  07:? ì¸ì¦?
	public static String AUTH_START     = "auth_start"; //? íš¨ê¸°ê°„ From
	public static String AUTH_END       = "auth_end"; //? íš¨ê¸°ê°„ End  
	public static String PWCHK       	= "pwchk";   
	public static String CODE_PERS      = "code_pers"; //?Œì›ë²ˆí˜¸
	public static String PERS_BIRTH     = "pers_birth"; //?ë…„?”ì¼
	public static String CODE_BRAN      = "code_bran"; //?Œì†ì§??  
	public static String USER_LEVEL     = "user_level"; //1 ìµœê³ ê´?¦¬??2 ì¤‘ê°„ê´?¦¬??3  ?Œì›?²â–² 4 ?Œì›??5 ?Œì› 6 ë¹„íšŒ??
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
