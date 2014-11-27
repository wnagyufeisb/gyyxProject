/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月26日下午7:09:11
 * 版本号：v1.0
 * 本类主要用途叙述：实现Register的控制
 */

package cn.gyyx.testproject1;



import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.gyyx.testproject.yufei.bean.UserKey;
import cn.gyyx.testproject.yufei.dao.IUserKey;
import cn.gyyx.testproject.yufei.dao.impl.UserKeyDao;
import cn.gyyx.testproject.yufei.service.IUserRegister;
import cn.gyyx.testproject.yufei.service.impl.UserRegister;
import cn.gyyx.testproject.yufei.tool.IsPhone;
import cn.gyyx.testproject.yufei.tool.MD5Password;
import cn.gyyx.testproject.yufei.tool.Stringrandom;

/**
 * 实现注册
 */
@Controller
public class RegisterController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/RegisterController", method = RequestMethod.POST)
	public String UserRegister(HttpServletRequest request, Model model) {
		
		//以下是获取所有表单的值
		String username=request.getParameter("rname");
		String password=request.getParameter("rpassword");
		String password2=request.getParameter("rspassword");
		String sex=request.getParameter("rselect");
		String phone=request.getParameter("rphone");
		//搞一个判断
		IUserKey iUserKey=new UserKeyDao();
		//顺便插一下
         IUserRegister register=new UserRegister();
		//电话判断
		IsPhone isPhone=new IsPhone();
		//产生随机字符串
		Stringrandom stringrandom=new Stringrandom();
		//加密玩
		MD5Password md5Password=new MD5Password();
		//设定一个判断值
		boolean isRegister=false;
		if(username!=null&&password!=null&&sex!=null&&phone!=null)//不为空
		{
			System.out.println(username);
			if(!(username.equals("")&&password.equals("")&&sex.equals("")&&phone.equals("")))//不为空字符串
					{
				System.out.println(username+"1");
				if(password.equals(password2))//二次输入密码相符
				{
					System.out.println(username+"sa");
					if(isPhone.IsPhone(phone))//格式是否正确
					{
						System.out.println(username+"3");
						if(iUserKey.IsUser(username))//看看这位客官是否还能注册这个奇葩的名字
						{
							isRegister=true;
							System.out.println(username+"4");
						}
						
					}
					
				}
				
					}
			
			
		}
		System.out.println(isRegister);
		//從此開始插入用戶的信息
		if(isRegister==true)
		{
			String pString=stringrandom.Stringrandom();//产生个五位的随机字符串
			System.out.println(pString);
			password = md5Password.MD5(password).toString().trim();// 密码转换
			password = password + pString;
			password = md5Password.MD5(password).toString().trim();
			System.out.println(password);
			//加密完成
			register.setUserKey(username, password, pString);
			UserKey key=register.getUserKey(username);
			System.out.println(key.getPassword());
			register.setUserInfo(key.getUserId(), sex, phone, 1);
			return "UserLogin";
		}
		
		
		
	
	return "UserLogin";	
	}
	
	
}
