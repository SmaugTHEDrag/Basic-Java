package Bai6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class VD_Date {
  public static void main(String[]args) {
	//Hiển thị ngày hiện hành theo định dạng dd/MM/yyyy
	  Date date=new Date(); //date->giá trị ngày hiện hành
	  System.out.println("Ngày hiện hành chưa định dạng:"+date);
	  DateFormat df = new SimpleDateFormat("dd/MM//yyyy"); //MM/dd//yyyy HH:mm:ss
	  System.out.println("Ngày hiện hành định dạng dd//MM//yyyy"+df.format(date));
	  
	  Calendar cal=Calendar.getInstance(); //cal: đối tượng ngày hiện hành
	  System.out.println("Ngày hiện hành định dạng từ Calendar:"+df.format(cal.getTime()));
	  System.out.println("Tháng hiện hành: "+(cal.get(Calendar.MONTH)+1));
	  System.out.println("Thứ trong tuần: "+cal.get(Calendar.DAY_OF_WEEK));
	  System.out.println("Số ngày trong tháng: "+cal.get(Calendar.DAY_OF_YEAR));
	  System.out.println("Số ngày trong năm: "+cal.get(Calendar.DAY_OF_YEAR));
	  System.out.println("Tuần trong năm: "+cal.get(Calendar.WEEK_OF_YEAR));
	  
	  //Gán giá trị ngày mới cho cal: 20/12/2023
	  cal.set(2023, 11, 20);//month: 0-11
	  System.out.println("Ngày mới của cal: "+df.format(cal.getTime()));
	  
	  //Tạo bản sao temp của cal. Cộng 5 ngày vào temp
	  Calendar temp=(Calendar)cal.clone();
	  temp.add(Calendar.DAY_OF_MONTH, 5);
	  System.out.println("Temp: "+df.format(temp.getTime()));
  }
}
