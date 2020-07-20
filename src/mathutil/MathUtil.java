/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static com.dat.util.MathUtil.computeFactorial;
/**
 *
 * @author ASUS
 */
public class MathUtil {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = "+ computeFactorial(5));
        

        
        //đoạn code trên chính là test hàm bằng tay, manual test
        //tức là:
        //ta chuẩn bị dât dể test, chính là số 5, đầu vào
        //ta gọi hàm CF(5)
        //ta chạy hàm, ta xem nó in ra số mấy(actual value)
        //lúc trước ta phải tự tính bằng tay 5!, cái ta kỳ vọng hàm phải
        //trả về con số này, 120 là cái ta hy vọng hàm trả về cho 5!
        //                          gọi là expected value
        //hàm chạy xong, ta so sánh kết quả giữ expected và actual
        //nếu khớp nhau, thì xử lí đúng, vì xử lý đúng, mới ra như mình mong
        //nếu k khớp, thì hoặc làm sai, hoặc mình ký vọng sai
        
        //hàm bằng tay thì ta phải so sánh bằng mắt expected vs actual = mắt đẻ luận
        //kết quả đúng sai của hàm
        //expected: 720
        System.out.println("6! = "+ computeFactorial(6));
        //expected: 1
        System.out.println("0! = "+ computeFactorial(0));
        //expected: 1
        System.out.println("1! = "+ computeFactorial(1));
        //expected: chửi cà chớn
        //expected: mày đưa đầu vào cà chớn, bố chửi mày bằng việc ném
        //ra ngoại lệ exception, vì ép tính đc do đầu vào cà chớn
        System.out.println("-5! = "+ computeFactorial(-5));
    }
    
    //nhìn = mắt nhìn kết quả, ổn, nhưng chưa hay
    //gia hồ có hỗ trợ thêm bộ thư viện giúp ta test hàm ta viết 1 cách
    //có hiệu quả hơn hiệ ứng màu sắc, và chúng tự so sánh giùm ta
    //ta k cần sout() nhìn kq, so bằng mắt vs kì vọng
    //tool này sẽ so giùm ta bá ta 2 trạng thái duy nhất
    //màu xanh: code chạy actual khớp với expected
    //màu đỏ: toang, actual ko khớp với expected
    //thư viện này mang tên chung: Unit Testing,
    //tên riêng: JUnit, TestNG, xUnit....
    
}
