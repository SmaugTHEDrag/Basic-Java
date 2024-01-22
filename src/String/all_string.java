package String;

public class all_string {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String name = "Pham Thai Nguyen";
			// Xem 2 tên có giống nhau không
			boolean result = name.equalsIgnoreCase("pham thai nguyen");  
			System.out.println(result);
			
			// Xem ký tự thuộc index thứ mấy
			int where = name.indexOf("a");                              
			System.out.println(where);
			
			// Xem ký tự thứ mấy là chữ gì 
			char index = name.charAt(3);                              
			System.out.println(index);

			// Chuyển tất cả chuỗi thành kiểu in hoa
			String uppercase = name.toUpperCase();                          
			System.out.println(uppercase);
			
			// Chuyển tất cả chuỗi thành kiểu thường
			String lowercase = name.toLowerCase();                          
			System.out.println(lowercase);
			
			// Dùng để xóa khoảng trắng không cần thiết
			String trim = name.trim();                                
			System.out.println(trim);
			
			 // Thay đổi ký tự hoặc chuỗi thành ký tự hoặc chuỗi khác
			String replace = name.replace("Thai", "Van");                
			System.out.println(replace);

			// Dùng để so sánh 2 chuỗi với nhau nếu giống nhau thì bằng 0 còn nhỏ hơn thì âm
			System.out.println(name.compareTo("Pham Thai Nguyen 12"));   

			// Dùng để nối vào chuỗi 
			name = name.concat(" is a good student");                    
			System.out.println(name);
			
			// Dùng để xem coi chuỗi nhỏ có thuộc chuỗi lớn không
			String asking = "what do you mean ?";
			System.out.println(asking.contains("what do"));              
			System.out.println(asking.contains("?"));
			
			// Dùng để format theo thứ bạn muốn 
			  String test = "sonoo";
			  String sf1 = String.format("name is %s", test);
			  String sf2 = String.format("value is %f", 32.33434);
			  String sf3 = String.format("value is %.2f", 32.33434);
			  System.out.println(sf1);
			  System.out.println(sf2);
			  System.out.println(sf3);
		}
}

