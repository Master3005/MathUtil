/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import com.dat.util.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilTest {
    
    @Test
    public void testSuccessfulCases(){
        //đây là hàm để test các đầu vào hợp lệ của hàm CF()
        //VD CF(5), CF(6),...mình sẽ gọi ở dây, coi actual của chúng trả về
        //có khớp với expected hay k
        //tuy nhiên mình k chơi sout() tự luận 
        //mà để cho .jar vừa add vào tự luận kết quả so sánh,
        //in ra xanh đổ cho mình xem
        assertEquals(1, MathUtil.computeFactorial(0));
        assertEquals(1, MathUtil.computeFactorial(1));
        assertEquals(2, MathUtil.computeFactorial(2));
        assertEquals(6, MathUtil.computeFactorial(3));
        assertEquals(720, MathUtil.computeFactorial(6));
        
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases(){
        //hàm này dùng để test trường hợp đưa dât cà chớn
        //ví dụ -5! CF(-5) tính thế mẹ nào được
        //k tính đc, chứ k đc trả về -1 nói rằng đầu vào vô lí
        //vì xét cho cùng -1 đc xem là 1 value
        //tình huống đầu vào cà chớn, ta sẽ tung ra, ném ra ngoại lệ nào đó
        //mà exception nói chug thì k phải là 1 value
        //nói đại diện cho 1 cái bất thường nào đó
        //bất thường thì k thể so sánh được
        //vậy tình huống hàm trả về ngoại lệ, k là return, nên k xài được hàm
        //assertEquals(value, value...)
        //ta xài chiêu khác, ta chỉ hứng ngoại lệ, coi nó đúng ngoại lệ đó k
        MathUtil.computeFactorial(-5);
    }
    
}
//màu xanh chỉ ra nếu: tất cả là màu xanh
//màu đỏ chỉ cần 1 thằng màu đỏ, coi như toang cả đám
//màu xanh: hàm phải chạy đúng cho mọi trường hợp thử nghiệm đầu vào và xử lý
//màu đỏ: xin lôi, bạn đã đúng gần hết, chỉ còn 1 case bị sai
//                  hàm bạn chạy đâu có đúng hết, hoặc bạn kì vọng sai gì đó
//túm lại, có 1 chút error, coi như là error

//DÙ CODE ĐỎ HAY XANH DO MÌNH CHƠI KIỂU TEST APP QUAJUNIT, DÙNG BẢNG MÀU
//THÌ: CLEAN & BUILD LUÔN ĐƯỢC CHẠY
//NHIỆU VỤ GỐC CỦA CLEAN & BUILD: CODE K CÓ ERROR CÚ PHÁP, PHÁI RA .JAR .WAR

//mình sẽ nâng cấp: code bạn còn màu đỏ, tức là chạy k như kì vọng
//TỚ DISABLE BÚT CLEAN & BUILD NHEN
//ĐỂ HOẶC CODE BẠN PHẢI MÀU XANH, HOẶC BÁN XOÁ MẸ NÓ MẤY PHẦN TEST ĐI
// THÌ MỚI RA .JAR .WAR
 
// NHỚ 2 CON SỐ ĐẶC BIỆT
//NETBEAN 8, 1005
//NETBEAN 10 TRỞ LÊN, 1204