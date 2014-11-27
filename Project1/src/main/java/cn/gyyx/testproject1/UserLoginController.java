/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月26日下午7:09:11
 * 版本号：v1.0
 * 本类主要用途叙述：实现Login的控制
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
import cn.gyyx.testproject.yufei.service.IUserLogin;
import cn.gyyx.testproject.yufei.service.impl.UserLogin;
import cn.gyyx.testproject.yufei.tool.MD5Password;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserLoginController {

	private static final Logger logger = LoggerFactory
			.getLogger(UserLoginController.class);

	/**
	 * 登录验证
	 */
	@RequestMapping(value = "/UserLoginController", method = RequestMethod.POST)
	public String IsLogin(HttpServletRequest request, Model model) {
		Boolean isLogin = false;// 这玩意主要就是对了你就欧了，错了回登陆界面的一个判断的条件
		String username = request.getParameter("username").toString().trim();
		String password = request.getParameter("password").toString().trim();// 得到表单的值

		if (username != null) {
			MD5Password md5Password = new MD5Password();
			IUserLogin iuserlogin = new UserLogin();
			UserKey userKey = iuserlogin.getUserKeyByUserName(username);
			if (userKey != null) {	
				System.out.println(password);
				password = md5Password.MD5(password).toString().trim();// 密码转换
				password = password + userKey.getpString();
				password = md5Password.MD5(password).toString().trim();
				System.out.println(userKey.getpString());
				System.out.println(userKey.getPassword());
				if (password.equals(userKey.getPassword())) {
					isLogin = true;
				}

			}
			if (isLogin == true) {
				System.out.println(userKey.getUserName());
				return "UserList";
			} else {
				return "UserLogin";
			}

		}

		else {
			return "UserLogin";
		}

	}

}
