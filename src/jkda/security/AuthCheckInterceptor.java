package jkda.security;  

import java.io.PrintWriter; 

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.context.WebApplicationContext; 
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import jkda.SessionInfo;  

public class AuthCheckInterceptor extends HandlerInterceptorAdapter {
 
	private Log log = LogFactory.getLog(AuthCheckInterceptor.class);
	
	@Autowired 
	private WebApplicationContext context;      

	@Override 
	public boolean preHandle( HttpServletRequest request
							, HttpServletResponse response
							, Object handler) throws Exception 
	{
		boolean isAuth = true; 
		
	    HttpSession session = request.getSession(); 

		String reqUri = request.getRequestURI();
		
		String[] reqUris = reqUri.split("/");
		String actions = reqUris[reqUris.length-1]; 
		AuthInfo authInfo = AuthInfo.getAuthInfo();				
		String auth = (String) authInfo.getInfo(actions);
		
		log.info("********************************* ACTION *********************************");
		log.info(" ACTS : " + actions);
		log.info(" AUTH : " + auth);
		log.info("********************************* ACTION *********************************");
		
		if ( auth != null && auth.equals("Y") )
		{
			String isLogin = (String) session.getAttribute(SessionInfo.LOGIN);
			if ( !isLogin.equals("Y") )
			{
				isAuth = false;
	            response.setContentType("text/html; charset=UTF-8"); 
	            PrintWriter out = response.getWriter();
	            
	            String redirect = "/login/kl_login_nor.do";	            
	            //if ( actions.equals("")) //actions??종류???�라 분기처리 ?????�음.
            	out.println("<script>alert('로그?�을 ?�세??'); document.location.href='" + redirect + "';</script>");
	            
	            out.flush();								
			}
		}
        return isAuth; 
	} 
} 