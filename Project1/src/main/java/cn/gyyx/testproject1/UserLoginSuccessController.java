/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月26日下午7:09:11
 * 版本号：v1.0
 * 本类主要用途叙述：进入List页面
 */
package cn.gyyx.testproject1;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.gyyx.testproject.yufei.bean.ListTemp;
import cn.gyyx.testproject.yufei.tool.Page;
import cn.gyyx.testproject.yufei.tool.XMemcache;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserLoginSuccessController {

	private static final Logger logger = LoggerFactory
			.getLogger(UserLoginSuccessController.class);

	/**
	 * 进入list页面
	 */

	@RequestMapping(value = "/UserLoginSuccessController", method = RequestMethod.GET)
	public String IsSuccess(HttpServletRequest request, Model model)

	{
		String uuid = request.getParameter("uuid");

		if (uuid == null || uuid.equals("")) {
			return "UserLogin";
		} else {
			XMemcache xMemcache = new XMemcache();
			String username = "";
			try {
				username = xMemcache.getXMemcache(uuid);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(username + "1234567890");

			Page page = new Page();
			List<ListTemp> listTemps = page.getList(1);
			model.addAttribute("listTemp", listTemps);
			model.addAttribute("userName", username);
			model.addAttribute("pageNo",1);
			return "UserList";

		}

	}

}
