package com.ihtc.upload;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
@WebServlet(value="/upload")
public class FileUpload extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {

			// 获得文件项的工厂类
			FileItemFactory factory = new DiskFileItemFactory();

			// 通过工厂类创建一个Servlet文件上传类
			ServletFileUpload upload = new ServletFileUpload(factory);

			// 把请求中的每个数据读取出来，并且封装成FileItem对象，然后存入List集合
			// 里面
			List<FileItem> items = upload.parseRequest(req);

			// FileItem是整个上传API的核心，通过它可以得到任何form表单的信息
			for (FileItem item : items) {
				if (item.isFormField()) {
					// 如果fileitem中封装的是普通输入项的数据
					String name = item.getFieldName();
					// 解决普通输入项的数据的中文乱码问题
					String value = item.getString("UTF-8");
					// value = new String(value.getBytes("iso-8859-1"),"UTF-8");
					System.out.println(name + "=" + value);

				} else {
					// 如果fileitem中封装的是上传文件
					long filesize = item.getSize();
					String clientFilename = item.getName();
					String suffix = clientFilename.substring(clientFilename.lastIndexOf("."), clientFilename.length());
					String saveFilename = System.currentTimeMillis() + suffix;

					System.out.println("getContentType : " + item.getContentType());
					System.out.println("getName : " + item.getName());

					if (filesize > 0) {
						// 构造这个文件，这个时候此文件还并不存在
						File file = new File("E:/file" + File.separator + saveFilename);
						// 用这个文件对象填充上面的file对象
						item.write(file);
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
