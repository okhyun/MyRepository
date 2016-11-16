package com.mycompany.myweb.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myweb.dto.Food;

@Controller
public class FoodController {
   private static final Logger logger = LoggerFactory.getLogger(FoodController.class);

   @RequestMapping("/")
   public String index() {
      logger.info("home() 실행2"); 
      return "index";
   }
   
   @RequestMapping("/foodList")
   public String foodList(Model model) {
    List<Food> list = new ArrayList<>();
	    list.add(new Food("food01.png", "food01_large.png", "Name", "35,000 Won", "Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
	    list.add(new Food("food02.png", "food02_large.png", "Name", "35,000 Won", "Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
	    list.add(new Food("food03.png", "food03_large.png", "Name",  "35,000 Won", "Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
	    list.add(new Food("food04.png", "food04_large.png", "Name",  "35,000 Won", "Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
	    list.add(new Food("food05.png", "food05_large.jpg", "Name",  "35,000 Won", "Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
	    list.add(new Food("food01.png", "food01_large.png", "Name",  "35,000 Won", "Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
	    list.add(new Food("food02.png", "food02_large.png", "Name",  "35,000 Won", "Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
	    list.add(new Food("food03.png", "food03_large.png", "Name",  "35,000 Won", "Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
	    list.add(new Food("food04.png", "food04_large.png", "Name",  "35,000 Won", "Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
	    list.add(new Food("food05.png", "food05_large.jpg", "Name",  "35,000 Won", "Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
     
     model.addAttribute("list", list);
     return "foodList";
   }
   
   @RequestMapping("/getImage")
   public void getImage(String fileName, HttpServletRequest request, HttpServletResponse response) {
      try {
         String mimeType = request.getServletContext().getMimeType(fileName);
         response.setContentType(mimeType);
         
         OutputStream os = response.getOutputStream();
      
         String filePath = request.getServletContext().getRealPath("/resources/image/" + fileName);
         InputStream is = new FileInputStream(filePath);
         byte[] values = new byte[1024];
         
         int byteNum = -1;
         while((byteNum = is.read(values)) != -1) {
            os.write(values, 0, byteNum);
         }
         os.flush();
         is.close();
         os.close();
         } catch(Exception e) {
            e.printStackTrace();
         }
      }
}