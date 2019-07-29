package com.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.vo.Jsonresult;

public class Jsonwriter {
	public static void write(HttpServletResponse res,Jsonresult jsonresult) throws IOException {
		res.setCharacterEncoding("utf-8");
		res.setContentType("application/json");
		PrintWriter pw = res.getWriter();
		Gson gson = new Gson();
		String json =gson.toJson(jsonresult);
		pw.write(json);
		pw.flush();
		pw.close();
	}
}
