package com.inno.fileserver;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int maxSize = 102400 * 1024;
	private String dectory = "uploads";
	private String fp = "png,jpg";

	public FileUpload() {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		Boolean islogined = (Boolean) req.getSession().getAttribute("islogined");
		// 验证是否登陆
		if (islogined == null || (islogined != null && islogined != true)) {
			out.println("Error ,you are not logged");
		}
		
		//获得web目录的绝对路径
		String path = this.getServletContext().getRealPath("/");
		
		//根据日期构建文件存放目录
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd/HH");
		String dectory2 = df.format(new Date());
		
		//要保存文件的绝对路径
		String buildPath = path+dectory+"/"+dectory2+"/";
		//目标目录不存在时自动创建
		File f1 = new File(buildPath);
		if(!f1.exists()){
			f1.mkdirs();
		}
		FileUpload fu = new FileUpload();
//		MultiPartRequest 
		
	}
}
