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

import org.apache.zookeeper.data.Id;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.qos.logback.core.joran.conditional.IfAction;
import cn.gyyx.testproject.yufei.bean.ListTemp;
import cn.gyyx.testproject.yufei.tool.Page;
import cn.gyyx.testproject.yufei.tool.XMemcache;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PagesController {

	private static final Logger logger = LoggerFactory
			.getLogger(PagesController.class);

	/**
	 * 进入list页面
	 */

	@RequestMapping(value = "/Page", method = RequestMethod.GET)
	public String IsSuccess(HttpServletRequest request, Model model)

	{
		String username=request.getParameter("username");
		int pageNo=Integer.parseInt(request.getParameter("pageNo"));
            String i=request.getParameter("method");
            List<ListTemp> listTemps = null;
			Page page = new Page();
			if(i.equals("0")){
				pageNo=1;
			listTemps = page.getList(1);
			}
			if(i.equals("1"))
				if(pageNo>1)
			{   { pageNo=pageNo-1;}
				 listTemps = page.getList(pageNo);
			}
			if(i.equals("2"))
			{
				pageNo=pageNo+1;
				 listTemps = page.getList(pageNo);
			}
		
			
			model.addAttribute("listTemp", listTemps);
			model.addAttribute("userName", username);
			model.addAttribute("pageNo",pageNo);
			return "UserList";

		}

	
}


