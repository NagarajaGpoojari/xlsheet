package leadTest;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExicutLeadTest {

	public static void main(String[] args) throws Exception{
		
			Keyword key=new Keyword();		
			ArrayList a=new ArrayList();
			String FilePath = "d:\\Automation\\FlipkartXLSheet.xlsx";
			FileInputStream file =new FileInputStream(FilePath);
			XSSFWorkbook b=new XSSFWorkbook(file);
			XSSFSheet s =b.getSheet("Sheet2");
			Iterator itr=s.iterator();
			while(itr.hasNext()) {
				Row rowitr=(Row)itr.next();
				Iterator cellitr=rowitr.cellIterator();
				while(cellitr.hasNext()) {
					Cell celldata=(Cell)cellitr.next();
					switch(celldata.getCellType()) {
					
					case STRING:	
					a.add(celldata.getStringCellValue());
					break;
					
					
				case NUMERIC:
					a.add(celldata.getNumericCellValue());
					break;
					
					case BOOLEAN:
					a.add(celldata.getBooleanCellValue());
					break;
				}
			}
			}
			for(int i=0;i<a.size();i++) {
				if(a.get(i).equals("openbrowser")){
					String keyword=(String)a.get(i);
					String data=(String)a.get(i+1);
					String objectname=(String)a.get(i+2);
					String runmode=(String)a.get(i+3);
					System.out.println(keyword);
					System.out.println(data);
					System.out.println(objectname);
					System.out.println(runmode);
					if(runmode.equals("yes")) {
						key.openbrowser();
						
					}
				}
						
						if(a.get(i).equals("navigate")){
							String keyword=(String)a.get(i);
							String data=(String)a.get(i+1);
							String objectname=(String)a.get(i+2);
							String runmode=(String)a.get(i+3);
							System.out.println(keyword);
							System.out.println(data);
							System.out.println(objectname);
							System.out.println(runmode);
							if(runmode.equals("yes")) {
								key.navigate(data);
				}		
	}
						if(a.get(i).equals("click")){
							String keyword=(String)a.get(i);
							String data=(String)a.get(i+1);
							String objectname=(String)a.get(i+2);
							String runmode=(String)a.get(i+3);
							System.out.println(keyword);
							System.out.println(data);
							System.out.println(objectname);
							System.out.println(runmode);
							if(runmode.equals("yes")) {
								key.input(data, objectname);					
	}			
	}
						if(a.get(i).equals("input")){
							String keyword=(String)a.get(i);
							String data=(String)a.get(i+1);
							String objectname=(String)a.get(i+2);
							String runmode=(String)a.get(i+3);
							System.out.println(keyword);
							System.out.println(data);
							System.out.println(objectname);
							System.out.println(runmode);
							if(runmode.equals("yes")) {
								key.click(objectname);					
	}			
	}
			}
	}}
	
