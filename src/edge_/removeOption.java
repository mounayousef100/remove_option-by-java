package edge_;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
public class removeOption {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.edgedriver.driver","Users\\Abdallah\\Desktop\\edge driver");
		WebDriver driver = new EdgeDriver ();
		driver.get("http://127.0.0.1:5501/index.html"
				+ "");
		 List <WebElement> theStudents = driver.findElements(By.tagName("option"));
		 int theTotalNumberOfStudents = theStudents.size();
	      System.out.println(theTotalNumberOfStudents+ " this is the orginal numper");
	    		     int howManyItims = 4 ;
	     System.out.println(howManyItims+ " this is remove number of items i");
		    for (int i= 0 ;i<howManyItims;i++) {
				
	 driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
		
			}
		   
		    List <WebElement> theStudantAfterRemove= driver.findElements(By.tagName("option"));
		   int actualNumber = theStudantAfterRemove.size();
		   System.out.println(actualNumber+ " this is atualNumber");
		   int expectedItems= (theTotalNumberOfStudents - howManyItims);
		   System.out.println(expectedItems+ " this is expectedItems");
			Assert.assertEquals(theStudantAfterRemove,expectedItems);
			
	
	}

}
