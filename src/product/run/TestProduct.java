package product.run;

import product.model.vo.Product;

/**
* 실행용 클래스
* 패키지 : product.run
* 클래스명 : TestProduct
* 추가메소드 : public static void main(String[] args)
* 내용 : Product의 printProduct실행 기능제공 클래스
* 패키지 : product.model.vo
* 클래스명 : Product
* 메소드 :  public void printProduct() {} 
* 내용 : 제품소개글 출력(예: TV, 42인치, 100만원)
*/
public class TestProduct {
	
	public static void main(String[] args) {
		
		Product pd = new Product();
		pd.printProduct();
		
	}

}
