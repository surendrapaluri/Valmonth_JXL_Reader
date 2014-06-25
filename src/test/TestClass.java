package test;


public class TestClass {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		DataDriven d = new DataDriven();
		String[][] value = d.read("D:\\POC\\ValmontSelenium\\ValmontSelenium\\RelatedFiles\\inputdetails.xls");		
		
		for(int i =0;i<value.length;i++){
			for(int k=0; k<value[i].length;k++){
				System.out.print(value[i][k]+" || ");
			}
			System.out.println();
		}
		
	}

}
